package week1.day03.challenge_ecommerce;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card paid: " + amount);
        System.out.println("Payment successful.");
    }
}