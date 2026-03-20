package com.example.moneymanager.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for transaction operations.
 */
@Dao
interface TransactionDao {
    @Query("SELECT * FROM transactions ORDER BY date DESC")
    fun getAllTransactions(): Flow<List<Transaction>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction)

    @Delete
    suspend fun deleteTransaction(transaction: Transaction)

    @Query("DELETE FROM transactions WHERE type = 'STARTING_BALANCE'")
    suspend fun clearStartingBalance()

    @Query("SELECT SUM(amount) FROM transactions WHERE type = 'INCOME'")
    fun getTotalIncome(): Flow<Double?>

    @Query("SELECT SUM(amount) FROM transactions WHERE type = 'EXPENSE'")
    fun getTotalExpense(): Flow<Double?>

    @Query("SELECT amount FROM transactions WHERE type = 'STARTING_BALANCE' LIMIT 1")
    fun getStartingBalance(): Flow<Double?>
}
