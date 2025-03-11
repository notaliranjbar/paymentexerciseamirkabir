package Payment;
public interface PaymentStrategy {
    public void pay(double amount);
    public String getPaymentDetails();
}