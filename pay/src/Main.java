import Customer.*;
import Payment.*;
public class Main {
    public static void main(String[] args) {
        PremiumCustomer customer1 = new PremiumCustomer("ali");
        PremiumCustomer customer2 = new PremiumCustomer("mamad");
        RegularCustomer customer3 = new RegularCustomer("gholi");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("slak23084972");
        CreditcardPayment creditcardPayment = new CreditcardPayment("203948201039" , "ali");
        PaypalPayment paypalPayment = new PaypalPayment("email@email.com");
        customer1.displayCostumerInfo();
        customer2.displayCostumerInfo();
        customer3.displayCostumerInfo();
        customer1.makePayment(bitcoinPayment , 12908);
        customer1.makePayment(paypalPayment, 2);
        customer2.makePayment(creditcardPayment , 100);
        customer2.makePayment(bitcoinPayment , 1463);
        customer3.makePayment(paypalPayment , 45);
        customer3.makePayment(creditcardPayment , 99);
        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();
    }
}