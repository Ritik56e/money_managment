package com.example.moneymanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moneymanager.data.AppDatabase
import com.example.moneymanager.data.TransactionRepository
import com.example.moneymanager.ui.MoneyManagerUI
import com.example.moneymanager.ui.MoneyViewModel
import com.example.moneymanager.ui.theme.MoneyManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val database = AppDatabase.getDatabase(this)
        val repository = TransactionRepository(database.transactionDao())
        
        val viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return MoneyViewModel(repository) as T
            }
        })[MoneyViewModel::class.java]

        setContent {
            MoneyManagerTheme {
                MoneyManagerUI(viewModel)
            }
        }
    }
}
