import java.util.HashSet;

public class TransactionCollection {
    private HashSet<Transaction> transactions;
    public TransactionCollection(){
        this.transactions = new HashSet<Transaction>();
    }
    public void addTransaction(Transaction transaction){
        this.transactions.add(transaction);
    }
    public void removeTransaction(Transaction transaction){
        this.transactions.remove(transaction);
    }
    public HashSet<Transaction> getTransactions(){
        return this.transactions;
    }

}
