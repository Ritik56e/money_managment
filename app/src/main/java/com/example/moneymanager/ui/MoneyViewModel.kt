package com.example.moneymanager.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moneymanager.data.Transaction
import com.example.moneymanager.data.TransactionRepository
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

/**
 * ViewModel to handle business logic and expose UI state.
 */
class MoneyViewModel(private val repository: TransactionRepository) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    val transactions: StateFlow<List<Transaction>> = repository.allTransactions
        .combine(searchQuery) { list, query ->
            // Filter out starting balance if any exist in DB (for clean UI)
            val filteredList = list.filter { it.type != "STARTING_BALANCE" }
            if (query.isBlank()) {
                filteredList
            } else {
                filteredList.filter { transaction ->
                    val dateStr = SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Date(transaction.date))
                    transaction.note.contains(query, ignoreCase = true) ||
                    transaction.amount.toString().contains(query) ||
                    transaction.type.contains(query, ignoreCase = true) ||
                    dateStr.contains(query, ignoreCase = true)
                }
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    val totalIncome: StateFlow<Double> = repository.totalIncome
        .map { it ?: 0.0 }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0.0)

    val totalExpense: StateFlow<Double> = repository.totalExpense
        .map { it ?: 0.0 }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0.0)

    val remainingBalance: StateFlow<Double> = combine(totalIncome, totalExpense) { income, expense ->
        income - expense
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0.0)

    fun addIncome(amount: Double, note: String, date: Long? = null) {
        viewModelScope.launch {
            repository.insert(Transaction(type = "INCOME", amount = amount, date = date ?: System.currentTimeMillis(), note = note))
        }
    }

    fun addExpense(amount: Double, note: String, date: Long? = null) {
        viewModelScope.launch {
            repository.insert(Transaction(type = "EXPENSE", amount = amount, date = date ?: System.currentTimeMillis(), note = note))
        }
    }

    fun deleteTransaction(transaction: Transaction) {
        viewModelScope.launch {
            repository.delete(transaction)
        }
    }
}
