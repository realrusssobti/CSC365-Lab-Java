import java.util.HashMap;
import java.util.HashSet;

public class PaymentCollection {
    /* Collection of payments.
     */
    private HashSet<Payment> payments;
    public PaymentCollection() {
        payments = new HashSet<Payment>();
    }
    public HashSet<Payment> getPayments() {
        return payments;
    }
    public void addPayment(Payment payment) {
        payments.add(payment);
    }
    public void removePayment(Payment payment) {
        payments.remove(payment);
    }

}
