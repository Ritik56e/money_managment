package com.example.moneymanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity representing a transaction (income or expense) or the starting balance.
 */
@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val type: String, // "INCOME", "EXPENSE", "STARTING_BALANCE"
    val amount: Double,
    val date: Long, // timestamp
    val note: String = ""
)
