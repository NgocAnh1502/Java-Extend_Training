package week1.day03.part12_payment_system;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystemMain {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        payments.add(new CreditCardPayment(200));
        payments.add(new BankTransferPayment(500));
        payments.add(new CashPayment(50));

        for(Payment payment : payments){
            payment.pay();
        }
    }
}
