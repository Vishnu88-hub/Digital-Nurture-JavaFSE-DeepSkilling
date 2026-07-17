package adapterpattern;

public class PayPalGateway {

    public void sendPayment(double amount) {
        System.out.println("PayPal Payment of $" + amount + " processed.");
    }

}