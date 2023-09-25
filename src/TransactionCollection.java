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

    public Transaction[] getTransactions(long number, String startDate, String endDate) {
        HashSet<Transaction> transactions = new HashSet<Transaction>();
        for (Transaction transaction : this.transactions){
            if (transaction.getCreditCardNumber() == number && transaction.getDate().compareTo(startDate) >= 0 && transaction.getDate().compareTo(endDate) <= 0){
                transactions.add(transaction);
            }
        }
        return transactions.toArray(new Transaction[transactions.size()]);
    }
}
