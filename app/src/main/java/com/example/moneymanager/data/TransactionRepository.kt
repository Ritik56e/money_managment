package com.example.moneymanager.data

import kotlinx.coroutines.flow.Flow

/**
 * Repository to abstract data source from ViewModel.
 */
class TransactionRepository(private val transactionDao: TransactionDao) {
    val allTransactions: Flow<List<Transaction>> = transactionDao.getAllTransactions()
    val totalIncome: Flow<Double?> = transactionDao.getTotalIncome()
    val totalExpense: Flow<Double?> = transactionDao.getTotalExpense()
    val startingBalance: Flow<Double?> = transactionDao.getStartingBalance()

    suspend fun insert(transaction: Transaction) {
        transactionDao.insertTransaction(transaction)
    }

    suspend fun delete(transaction: Transaction) {
        transactionDao.deleteTransaction(transaction)
    }

    suspend fun setStartingBalance(amount: Double) {
        transactionDao.clearStartingBalance()
        transactionDao.insertTransaction(
            Transaction(
                type = "STARTING_BALANCE",
                amount = amount,
                date = System.currentTimeMillis()
            )
        )
    }
}
