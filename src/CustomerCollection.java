import java.util.HashMap;

public class CustomerCollection {
    /*
    This class is a collection of Customer objects. It is used to store a set of Customers and allow for easy access to them.
     */
    private HashMap<Integer, Customer> customers;
    public CustomerCollection() {
        customers = new HashMap<>();
    }
    public CustomerCollection(Customer[] customers){
        this.customers = new HashMap<>();
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
    public String toString(){
        // build a string representation of the CustomerCollection
        StringBuilder string = new StringBuilder();
        for (Customer customer : customers.values()){
            string.append(customer.toString()).append("\n");

        }
        return string.toString();
    }

    public Customer getCustomerBySSN(int ssn) {
        for (Customer customer : customers.values()){
            if (customer.getSSN() == ssn){
                return customer;
            }
        }
        return null;
    }
}
