public class Customer {
    /* Properties:
        * SSN
        * ID
        * Name
        * Address
        * Phone Number
     */
    private int SSN;
    private int ID;
    private String name;
    private String address;
    private int phoneNumber;

    public Customer(int SSN, int ID, String name, String address, int phoneNumber) {
        this.SSN = SSN;
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public int getSSN() {
        return SSN;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address= address;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
