import java.util.HashSet;

public class OwnerCollection {
    private HashSet<Owner> owners;
    public OwnerCollection(){
        this.owners = new HashSet<Owner>();
    }
    public void addOwner(Owner owner){
        this.owners.add(owner);
    }
    public void removeOwner(Owner owner){
        this.owners.remove(owner);
    }
    public HashSet<Owner> getOwners(){
        return this.owners;
    }
    public Owner getOwnerByCreditCardNumber(long creditCardNumber){
        for (Owner owner : this.owners){
            if (owner.getCreditCard().getNumber() == creditCardNumber){
                return owner;
            }
        }
        return null;
    }
    public void UpdateOwnership(Owner newOwner){
        long CreditCardNumber = newOwner.getCreditCard().getNumber();
        for (Owner owner : this.owners){
            if (owner.getCreditCard().getNumber() == CreditCardNumber){
                this.owners.remove(owner);
                this.owners.add(newOwner);
                return;
            }
    }
    }

}
