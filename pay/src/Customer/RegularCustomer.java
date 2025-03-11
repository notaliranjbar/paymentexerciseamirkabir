package Customer;
public class RegularCustomer extends Customer{
    public RegularCustomer(String name) {
        super(name);
    }
    @Override
    public void displayCostumerInfo() {
        System.out.println(this.name + " is regular customer");
    }
}