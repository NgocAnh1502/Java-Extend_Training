package week1.day03.challenge_ecommerce;

public class BankTransfer implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Bank Transfer paid: " + amount);
        System.out.println("\nPayment successful.");
    }
}