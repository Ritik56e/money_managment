package com.example.moneymanager.data;

/**
 * Data Access Object for transaction operations.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\'J\u0010\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\'J\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\'J\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moneymanager/data/TransactionDao;", "", "clearStartingBalance", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransaction", "transaction", "Lcom/example/moneymanager/data/Transaction;", "(Lcom/example/moneymanager/data/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "getStartingBalance", "", "getTotalExpense", "getTotalIncome", "insertTransaction", "app_debug"})
@androidx.room.Dao()
public abstract interface TransactionDao {
    
    @androidx.room.Query(value = "SELECT * FROM transactions ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.moneymanager.data.Transaction>> getAllTransactions();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull()
    com.example.moneymanager.data.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTransaction(@org.jetbrains.annotations.NotNull()
    com.example.moneymanager.data.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM transactions WHERE type = \'STARTING_BALANCE\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearStartingBalance(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(amount) FROM transactions WHERE type = \'INCOME\'")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Double> getTotalIncome();
    
    @androidx.room.Query(value = "SELECT SUM(amount) FROM transactions WHERE type = \'EXPENSE\'")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Double> getTotalExpense();
    
    @androidx.room.Query(value = "SELECT amount FROM transactions WHERE type = \'STARTING_BALANCE\' LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Double> getStartingBalance();
}