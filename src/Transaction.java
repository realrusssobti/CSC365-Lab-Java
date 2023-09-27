public class Transaction {
    /* Represent a transaction:
     * CustomerID
     * Amount
     * Date
     * CreditCardNumber.
     * Vendor
     */
    private int customerID;
    private double amount;
    private String date;
    private long creditCardNumber;
    private String vendor;
    public Transaction(int customerID, double amount, String date, long creditCardNumber, String vendor) {

        this.customerID = customerID;
        this.amount = amount;
        this.date = date.replaceAll("[^\\d]", "");
        this.creditCardNumber = creditCardNumber;
        this.vendor = vendor;
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
    public String getVendor() {
        return vendor;
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
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    @Override
    public String toString() {
        return "CustomerID: " + customerID + "\nAmount: " + amount + "\nDate: " + date + "\nCreditCardNumber: " + creditCardNumber + "\nVendor: " + vendor;
    }
}
