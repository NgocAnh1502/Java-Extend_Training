package week1.day03.part12_payment_system;

public class BankTransferPayment extends Payment implements Refundable{
    public BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("BankPay: " + getAmount());
    }

    @Override
    public void printAmount() {
        System.out.println("Amount of bank: " + getAmount());
    }

    @Override
    public void refund() {
        System.out.println("BankTransfer refund: " +  getAmount());
    }
}
