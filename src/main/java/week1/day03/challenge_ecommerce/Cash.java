package week1.day03.challenge_ecommerce;

public class Cash implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Cash paid: " + amount);
        System.out.println("Payment successful.");
    }
}