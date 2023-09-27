import java.util.Scanner;

/*
    This program supports the following operations on the memory:
    * Create a new customer.
    * Create a new credit card for an existing customer (will affect both the credit card and ownership data). Initially, the credit card will not be active.
    * Issue a credit card duplicate for additional customer (will affect only the ownership data)
    * Cancel a credit card.
    * Active a credit card.
    * Add a new vendor.
    * Create a new transaction. This will affect the balance of the credit card.
    * Allow a customer to pay off credit card. This will affect both the payment data and credit card balance.
 */
public class Main {
    private CustomerCollection customers;
    private CreditCardCollection creditCards;
    private VendorCollection vendors;
    private OwnerCollection owners;
    private TransactionCollection transactions;
    private PaymentCollection payments;

    public static void main(String[] args) {
        // Initialize collections of customers, credit cards, ownership, payment, vendors, and transactions
        CustomerCollection customers = new CustomerCollection();
        CreditCardCollection creditCards = new CreditCardCollection();
        OwnerCollection owners = new OwnerCollection();
        PaymentCollection payments = new PaymentCollection();
        VendorCollection vendors = new VendorCollection();
        TransactionCollection transactions = new TransactionCollection();
        Scanner scanner = new Scanner(System.in);

        // Main loop
        while (true){
            try {
                // Remind user of date command
                System.out.println("Enter dates in YYYY-MM-DD or similar, e.g. 2024-01-01");
                // Query or Command?
                System.out.println("Query (q) or Command (c)?");
                String input = scanner.nextLine();
                // lowercase and get first letter
                char firstLetter = input.toLowerCase().charAt(0);
                if (firstLetter == 'q') {
                    // Queries!
                    System.out.println("Queries Menu:");
                    System.out.println("1. Get all customers.");
                    System.out.println("2. Locate Customer by ID or SSN.");
                    System.out.println("3. Get Credit Card Info.");
                    System.out.println("4. Get Credit Card Transactions.");

                    // Get the query
                    int query = scanner.nextInt();
                    switch (query){
                        case(1):{
                            System.out.println(customers);
                            break;
                        }
                        case(2):{
                            // Prompt for ID or SSN
                            System.out.println("Search by ID (1) or SSN? (2)?");
                            int search = scanner.nextInt();
                            if (search == 1){
                                // Search by ID
                                System.out.println("Enter ID:");
                                int ID = scanner.nextInt();
                                System.out.println(customers.getCustomer(ID));
                            } else if (search == 2){
                                // Search by SSN
                                System.out.println("Enter SSN:");
                                int SSN = scanner.nextInt();
                                System.out.println(customers.getCustomerBySSN(SSN));
                            } else {
                                System.out.println("Invalid input, try again");
                            }
                            break;
                        } // Locate Customer by ID or SSN
                        case(3):{
                            System.out.println("Enter credit card number:");
                            scanner.nextLine(); // flush the buffer
                            long number = scanner.nextLong();
                            System.out.println(creditCards.getCreditCard(number));
                            break;
                        } // Get Credit Card Info
                        case(4):{
                            // Get the credit card number
                            System.out.println("Enter credit card number:");
                            long number = scanner.nextLong();
                            // Start Date
                            System.out.println("Enter start date:");
                            String startDate = scanner.nextLine();
                            scanner.nextLine(); // flush the buffer
                            // End Date
                            System.out.println("Enter end date:");
                            String endDate = scanner.nextLine();
                            scanner.nextLine(); // flush the buffer
                            // Get All Transactions which match the filters
                            Transaction[] transactions1 = transactions.getTransactions(number, startDate, endDate);
                            // Print the transactions
                            for (Transaction transaction : transactions1){
                                System.out.println(transaction);
                            }
                            break;
                        } // Get Credit Card Transactions
                    }
                } else if (firstLetter == 'c'){
                    // Commands!
                    System.out.println("Commands Menu:");
                    System.out.println("1. Create a new customer.");
                    System.out.println("2. Create a new credit card for an existing customer (will affect both the credit card and ownership data). Initially, the credit card will not be active.");
                    System.out.println("3. Issue a credit card duplicate for additional customer (will affect only the ownership data)");
                    System.out.println("4. Cancel a credit card.");
                    System.out.println("5. Active a credit card.");
                    System.out.println("6. Add a new vendor.");
                    System.out.println("7. Create a new transaction. This will affect the balance of the credit card.");
                    System.out.println("8. Allow a customer to pay off credit card. This will affect both the payment data and credit card balance.");

                    // Get the command
                    int command = scanner.nextInt();
                    switch(command){
                        case (1):{
                            // Collect the data
                            System.out.println("Enter SSN:");
                            int SSN = scanner.nextInt();
                            System.out.println("Enter ID:");
                            int ID = scanner.nextInt();
                            System.out.println("Enter name:");
                            // Clear the buffer
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            System.out.println("Enter address:");
                            scanner.nextLine(); // flush the buffer
                            String address = scanner.nextLine();
                            System.out.println("Enter phone number:");
                            long phoneNumber = scanner.nextLong();
                            // Create the customer
                            Customer customer = new Customer(SSN, ID, name, address, phoneNumber);
                            // Add the customer to the collection
                            customers.addCustomer(customer);
                            break;

                        }
                        case (2):{
                            // Collect the data
                            System.out.println("Enter credit card number:");
                            long number = scanner.nextLong();
                            System.out.println("Enter credit card type:");
                            // Clear the buffer
                            scanner.nextLine();
                            String type = scanner.nextLine();
                            System.out.println("Enter credit card limit:");
                            int limit = scanner.nextInt();
                            // Create the credit card
                            CreditCard creditCard = new CreditCard(number, type, limit, 0, false);
                            // Create a Owner
                            Owner owner = new Owner(customers, creditCard);
                            creditCards.addCreditCard(creditCard);
                            // Add the owner to the owners collection
                            owners.addOwner(owner);
                            break;

                        }
                        case (3):{
                            // Collect the data
                            System.out.println("Enter credit card number:");
                            long number = scanner.nextLong();
                            // Get the Customer ID
                            System.out.println("Enter customer ID:");
                            int ID = scanner.nextInt();
                            // Get the customer
                            Customer customer = customers.getCustomer(ID);
                            // Get the owner
                            Owner owner = owners.getOwnerByCreditCardNumber(number);
                            // Add the customer to the owner
                            if (owner != null) {
                                owner.addCustomer(customer);

                            } else {
                                System.out.println("Owner not found");
                            }

                            break;
                        }
                        case (4):{
                            // Collect the data
                            System.out.println("Enter credit card number:");
                            long number = scanner.nextLong();
                            // Cancel the credit card
                            creditCards.getCreditCard(number).setActive(false);
                            break;

                        }
                        case (5):{
                            // Collect the data
                            System.out.println("Enter credit card number:");
                            long number = scanner.nextLong();
                            // Activate the credit card
                            creditCards.getCreditCard(number).setActive(true);
                            break;
                        }
                        case (6):{
                            // Get the data for a new vendor
                            System.out.println("Enter vendor name:");
                            scanner.nextLine(); // flush the buffer
                            String name = scanner.nextLine();
                            System.out.println("Enter vendor address:");
//                        scanner.nextLine(); // flush the buffer
                            String address = scanner.nextLine();
                            System.out.println("Enter vendor ID:");
                            int ID = scanner.nextInt();
                            // Create the vendor
                            Vendor vendor = new Vendor(ID, name, address);
                            // Add the vendor to the collection
                            vendors.addVendor(vendor);
                            break;
                        }
                        case (7):{
                            // Collect the data
                            System.out.println("Enter transaction ID:");
                            int ID = scanner.nextInt();
                            System.out.println("Enter transaction amount:");
                            int amount = scanner.nextInt();
                            System.out.println("Enter transaction date:");
                            scanner.nextLine(); // flush the buffer
                            String date = scanner.nextLine();
                            System.out.println("Enter transaction vendor:");
                            scanner.nextLine(); // flush the buffer
                            String vendor = scanner.nextLine();
                            System.out.println("Enter transaction credit card number:");
                            long number = scanner.nextLong();
                            System.out.println("Enter transaction customer ID:");
                            int customerID = scanner.nextInt();
                            // Create the transaction
                            Transaction transaction = new Transaction( customerID,  amount,  date,  number,  vendor);
                            // Add the transaction to the collection
                            transactions.addTransaction(transaction);
                            break;
                        }
                        case (8):{
                            // Collect the data
                            System.out.println("Enter payment ID:");
                            int ID = scanner.nextInt();
                            System.out.println("Enter payment amount:");
                            int amount = scanner.nextInt();

                            System.out.println("Enter payment date:");
                            scanner.nextLine(); // flush the buffer
                            String date = scanner.nextLine();
                            System.out.println("Enter payment credit card number:");
                            long number = scanner.nextLong();
                            System.out.println("Enter payment customer ID:");
                            int customerID = scanner.nextInt();
                            // Create the payment
                            Payment payment = new Payment(ID, amount, date, number);
                            // Add the payment to the collection
                            payments.addPayment(payment);
                            break;

                        }
                    }
                    // flush the buffer
                    scanner.nextLine();

                } else {
                    System.out.println("Invalid input, try again");
                }
            } catch (Exception e) {
                System.out.println("Something went wrong, try again");
            }
        }


    }
}