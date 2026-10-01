package week1.day03.part10_interface;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by bank transfer: " + amount);
    }
}
