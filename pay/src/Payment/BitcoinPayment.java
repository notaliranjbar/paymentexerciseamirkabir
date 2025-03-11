package Payment;
public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount) {

    }
    @Override
    public String getPaymentDetails() {
        return "the payment is done with bitcoin with" + this.walletAddress + " walletaddress";
    }
}