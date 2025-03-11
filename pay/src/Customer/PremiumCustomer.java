package Customer;

public class PremiumCustomer extends Customer{
    public PremiumCustomer(String name) {
        super(name);
    }
    @Override
    public void displayCostumerInfo() {
        System.out.println(this.name + " is premium customer");
    }
}