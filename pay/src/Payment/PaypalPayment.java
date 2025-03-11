package Payment;
public class PaypalPayment implements PaymentStrategy{
    String email;
    public PaypalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
    }
    @Override
    public String getPaymentDetails() {
        return "Payment done with Paypal with" + this.email + "email address";
    }
}