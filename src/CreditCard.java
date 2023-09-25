import java.util.ArrayList;

enum CreditCardType {
    VISA,
    MASTERCARD,
    AMERICAN_EXPRESS,
    DISCOVER
}
public class CreditCard {
    /* Properties:
        * Number
        * Type
        * Limit
        * Balance
        * Active
     */
    private long number;
    private CreditCardType type;
    private int limit;
    private float balance;
    private boolean active;


    public CreditCard(long number, String type, int limit, float balance, boolean active) {
        this.number = number;
        this.type = CreditCardType.valueOf(type);
        this.limit = limit;
        this.balance = balance;
        this.active = active;

    }
    public long getNumber() {
        return number;
    }
    public String getType() {
        return String.valueOf(type);
    }
    public int getLimit() {
        return limit;
    }
    public float getBalance() {
        return balance;
    }
    public boolean getActive() {
        return active;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setType(String type) {
        this.type = CreditCardType.valueOf(type);
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

}
