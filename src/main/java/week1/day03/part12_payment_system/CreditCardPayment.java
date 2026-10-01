package week1.day03.part12_payment_system;

public class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("CreditCard pay: " + getAmount());
    }

    @Override
    public void printAmount() {
        System.out.println("Amount of CreditCard: " + getAmount());
    }

    @Override
    public void refund() {
        System.out.println("CreditCard refund: " +  getAmount());
    }
}
