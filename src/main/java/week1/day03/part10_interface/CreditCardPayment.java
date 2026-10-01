package week1.day03.part10_interface;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by credit card: " + amount);
    }
}
