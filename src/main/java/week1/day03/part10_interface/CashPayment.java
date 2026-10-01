package week1.day03.part10_interface;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by cash: " + amount);
    }
}
