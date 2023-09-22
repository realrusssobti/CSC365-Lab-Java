import java.util.ArrayList;

public class VendorCollection {
    private ArrayList<Vendor> vendors;
    public VendorCollection(){
        this.vendors = new ArrayList<Vendor>();
    }
    public void addVendor(Vendor vendor){
        this.vendors.add(vendor);
    }
    public void removeVendor(Vendor vendor){
        this.vendors.remove(vendor);
    }
    public ArrayList<Vendor> getVendors(){
        return this.vendors;
    }
    public Vendor getVendor(int ID){
        for (Vendor vendor : this.vendors){
            if (vendor.getID() == ID){
                return vendor;
            }
        }
        return null;
    }
    public Vendor getVendor(String name){
        for (Vendor vendor : this.vendors){
            if (vendor.getName().equals(name)){
                return vendor;
            }
        }
        return null;
    }

}
