public class Vendor {
    /* Represents a Vendor
        * ID
        * Name
        * Location
     */
    private int id;
    private String name;
    private String location;

    public Vendor(int ID, String name, String location){
        this.id = ID;
        this.name = name;
        this.location = location;
    }
    public void setID(int ID){
        this.id = ID;
    }
    public int getID(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }

}
