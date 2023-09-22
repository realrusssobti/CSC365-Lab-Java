public class Owner {
    /* Represent the owner of a credit card: A Customer collection and a CreditCard.
     */
    private CustomerCollection customers;
    private CreditCard creditCard;
    public Owner(CustomerCollection customers, CreditCard creditCard) {
        this.customers = customers;
        this.creditCard = creditCard;
    }
    public CustomerCollection getCustomers() {
        return customers;
    }
    public CreditCard getCreditCard() {
        return creditCard;
    }
    public void addCustomer(Customer customer) {
        customers.addCustomer(customer);
    }
    public void removeCustomer(Customer customer) {
        customers.removeCustomer(customer.getID());
    }
}
