public class Payment {
    /* Represent a payment:
        * CustomerID
        * Amount
        * Date
        * CreditCardNumber.
     */
    private int customerID;
    private double amount;
    private String date;
    private long creditCardNumber;
    public Payment(int customerID, double amount, String date, long creditCardNumber) {
        this.customerID = customerID;
        this.amount = amount;
        this.date = date;
        this.creditCardNumber = creditCardNumber;
    }
    public int getCustomerID() {
        return customerID;
    }
    public double getAmount() {
        return amount;
    }
    public String getDate() {
        return date;
    }
    public long getCreditCardNumber() {
        return creditCardNumber;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


}
