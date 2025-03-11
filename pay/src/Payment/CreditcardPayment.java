package Payment;
public class CreditcardPayment implements PaymentStrategy {
    String cardNumber, cardHolderName;
    public CreditcardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void pay(double amount) {}
    @Override
    public String getPaymentDetails() {
        return "the Payment is done by" + " with creditcard with" + this.cardNumber+" cardnumber";
    }
}