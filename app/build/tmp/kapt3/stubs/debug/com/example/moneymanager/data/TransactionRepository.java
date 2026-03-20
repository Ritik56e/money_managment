package com.example.moneymanager.data;

/**
 * Repository to abstract data source from ViewModel.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\u0019R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/moneymanager/data/TransactionRepository;", "", "transactionDao", "Lcom/example/moneymanager/data/TransactionDao;", "(Lcom/example/moneymanager/data/TransactionDao;)V", "allTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/moneymanager/data/Transaction;", "getAllTransactions", "()Lkotlinx/coroutines/flow/Flow;", "startingBalance", "", "getStartingBalance", "totalExpense", "getTotalExpense", "totalIncome", "getTotalIncome", "delete", "", "transaction", "(Lcom/example/moneymanager/data/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "setStartingBalance", "amount", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TransactionRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.moneymanager.data.TransactionDao transactionDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.moneymanager.data.Transaction>> allTransactions = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Double> totalIncome = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Double> totalExpense = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Double> startingBalance = null;
    
    public TransactionRepository(@org.jetbrains.annotations.NotNull()
    com.example.moneymanager.data.TransactionDao transactionDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.moneymanager.data.Transaction>> getAllTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getTotalIncome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getTotalExpense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getStartingBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.moneymanager.data.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.moneymanager.data.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setStartingBalance(double amount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}