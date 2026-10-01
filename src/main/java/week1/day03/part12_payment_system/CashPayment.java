package week1.day03.part12_payment_system;

public class CashPayment extends Payment{
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Cash pay: " +  getAmount());
    }
}
