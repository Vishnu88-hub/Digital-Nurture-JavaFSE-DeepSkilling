package adapterpattern;

public class StripeGateway {

    public void makePayment(double amount) {
        System.out.println("Stripe Payment of $" + amount + " processed.");
    }

}