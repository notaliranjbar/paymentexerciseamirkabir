package Customer;
import Payment.PaymentStrategy;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;
    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<String>();
    }
    public abstract void displayCostumerInfo();
    public void makePayment(PaymentStrategy paymentStratergy, double amount) {
        paymentStratergy.pay(amount);
        this.paymentHistory.add(paymentStratergy.getPaymentDetails() +" with " + amount +" amount");
    }
    public void showPaymentHistory() {
        System.out.println("showing " + this.name+ " payment history...");
        for(String tarakonesh : this.paymentHistory){
            System.out.println(tarakonesh);
        }
    }
}