package week1.day03.part10_interface;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100000);
        
        Payment payment2 = new CashPayment();
        payment2.pay(50000);
        
        Payment payment3 = new BankTransferPayment();
        payment3.pay(200000);
    }
}
