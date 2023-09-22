import java.util.HashMap;

public class CreditCardCollection {
    /* A collection of CreditCard objects as a HashSet */
    private HashMap<Integer, CreditCard> creditCards;
    public CreditCardCollection() {
        creditCards = new HashMap();
    }
    public CreditCardCollection(CreditCard[] creditCards){
        this.creditCards = new HashMap();
        for (CreditCard creditCard : creditCards) {
            this.creditCards.put(creditCard.getNumber(), creditCard);
        }
    }
    public void addCreditCard(CreditCard creditCard) {
        creditCards.put(creditCard.getNumber(), creditCard);
    }
    public CreditCard getCreditCard(int number) {
        return creditCards.get(number);
    }
    public void removeCreditCard(int number) {
        creditCards.remove(number);
    }

}