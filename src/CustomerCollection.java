import java.util.HashMap;

public class CustomerCollection {
    /*
    This class is a collection of Customer objects. It is used to store a set of Customers and allow for easy access to them.
     */
    private HashMap<Integer, Customer> customers;
    public CustomerCollection() {
        customers = new HashMap<Integer, Customer>();
    }
    public CustomerCollection(Customer[] customers){
        this.customers = new HashMap<Integer, Customer>();
        for (Customer customer : customers) {
            this.customers.put(customer.getID(), customer);
        }
    }
    public void addCustomer(Customer customer) {
        customers.put(customer.getID(), customer);
    }
    public Customer getCustomer(int ID) {
        return customers.get(ID);
    }
    public void removeCustomer(int ID) {
        customers.remove(ID);
    }

}
