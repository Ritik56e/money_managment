package com.example.moneymanager.ui;

/**
 * ViewModel to handle business logic and expose UI state.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dJ\'\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006#"}, d2 = {"Lcom/example/moneymanager/ui/MoneyViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/moneymanager/data/TransactionRepository;", "(Lcom/example/moneymanager/data/TransactionRepository;)V", "_searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "remainingBalance", "Lkotlinx/coroutines/flow/StateFlow;", "", "getRemainingBalance", "()Lkotlinx/coroutines/flow/StateFlow;", "searchQuery", "getSearchQuery", "totalExpense", "getTotalExpense", "totalIncome", "getTotalIncome", "transactions", "", "Lcom/example/moneymanager/data/Transaction;", "getTransactions", "addExpense", "", "amount", "note", "date", "", "(DLjava/lang/String;Ljava/lang/Long;)V", "addIncome", "deleteTransaction", "transaction", "updateSearchQuery", "query", "app_debug"})
public final class MoneyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.moneymanager.data.TransactionRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.moneymanager.data.Transaction>> transactions = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> totalIncome = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> totalExpense = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> remainingBalance = null;
    
    public MoneyViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moneymanager.data.TransactionRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.moneymanager.data.Transaction>> getTransactions() {
        return null;
    }
    
    public final void updateSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getTotalIncome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getTotalExpense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getRemainingBalance() {
        return null;
    }
    
    public final void addIncome(double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.Nullable()
    java.lang.Long date) {
    }
    
    public final void addExpense(double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.Nullable()
    java.lang.Long date) {
    }
    
    public final void deleteTransaction(@org.jetbrains.annotations.NotNull()
    com.example.moneymanager.data.Transaction transaction) {
    }
}