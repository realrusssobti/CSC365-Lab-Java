# CSC 365 Labs - Russ Sobti

## Lab 1 - Basic Java App

### Description:

Lab 1. (To be implemented in Java), double lab

Please read and understand all instructions before starting your implementation.

Physical data design depends on the workload. For example, range queries (e.g., find everyone who is older than 30
years) are best served by a balanced tree structure, while partial match queries (e.g., find everyone who is named John
Smith) can be supported by both hash tables and tree structures (hash tables may be preferred because the amortized
search time is O(1) compare to O(log(n)). Arrays and linked lists may also be suitable depending on the workload (i.e.,
the type of queries and updates that are expected and their frequencies).
In this lab, you will create a program that keeps track of credit cards, customers, and vendors, where all the
information will be stored in main memory. It is your job to make the program as efficient as possible by choosing the
data structures that give the best performance. Please use the data structures that are available in Java and do not
implement your own data structures. I am assuming you will choose from HashSet, HashMap,TreeSet,TreeMap, and ArrayList
in most cases.
Your program will store information about the following entities. Create two classes for each entry.

For example, the Customer class will store information about a single customer, while the CustomerCollection class will
store information about a collection of customers. Store the collection of customers using the data structure that is
most appropriate and provide appropriate access methods.

- customer: SSN, id, name, address, phone number. Example: John Smith with SSN 2342342341 and id 45 lives on 123 Main
  Street and has phone number 234241423. SSN is of course unique. The value of id is also unique and is automatically
  assigned by the system (e.g., use a static variable that increments by one to assign it).
- credit card: number, type (enum value, can be Visa, MC, American Express, or Discover), credit limit, current
  balance (must be less than the credit limit). For example, credit card with number 2432143232 is Visa, credit limit of
  $10,000 and current balance of $3444.23. The credit card number is unique. You cannot have two credit cards with the
  same number. Add an additional bit that represents if the credit card is active. Credit cards are initially inactive.
- ownership: which customer owns which credit card. For example, customer with id 7 owns credit card with credit card
  number 123432432. A customer can own multiple credit cards and a credit card can be owned by multiple customers (e.g.,
  husband and wife may carry credit cards with the same credit card number). Add an additional bit that represents
  whether the ownership information is current. For example, if a user cancels a credit card, than this bit needs to be
  set to false.
- vender: id, name, location of main office. Example: vendor with id 23 has name “Best Buy” and main office location
  “123 Main St., Austin, TX”. The id of the vender is unique and assigned by the system.
- transaction: Contains information that a customer purchased something with a credit card. Example: On January 5th,
  2015, customer with id 255 used CC with credit card number 2342343432 at vendor id 233 for $654.23 worth of purchases.
  Store all information: date, customer id, cc number, and vender id.
- payment: Contains information that a payment was made on the balance of a credit card. For example, on June 2, 2015,
  $400.34 was payed on credit card 23424123432.

Your program should support the following updates. Identify object by their IDs.

- Create a new customer.
- Create a new credit card for an existing customer (will affect both the credit card and ownership data). Initially,
  the credit card will not be active.
- Issue a credit card duplicate for additional customer (will affect only the ownership data)
- Cancel a credit card.
- Active a credit card.
- Add a new vendor.
- Create a new transaction. This will affect the balance of the credit card.
- Allow a customer to pay off credit card. This will affect both the payment data and credit card balance.

Your program should support the following queries.

- Locate customer by ID or SSN.
- For a given customer (specified ID or SSN), print credit card information (i.e., credit card number, credit limit, and
  balance for each credit card).
- For a given credit card (specified by CC number), print credit card information (e.g., balance, credit limit, card
  holders).
- For a given credit card, print all transactions that are in a specified date range.

The updates and queries should be performed mainly by calling methods on objects from the collection classes. Create a
Main class that contains the main method. The code in the Main class should not be very long. Your program will be
tested by executing Main.java.
Please save and backup all labs after submission. Many labs will depend on previous labs.




