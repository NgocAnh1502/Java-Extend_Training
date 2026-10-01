package week1.day03.challenge_ecommerce;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Duy");

        Product keyboard = new Product(1, "Keyboard", 1_500_000);
        Product mouse = new Product(2, "Mouse", 800_000);
        Product monitor = new Product(3, "Monitor", 4_000_000);

        Order order = new Order(1, customer);
        order.addProduct(keyboard);
        order.addProduct(mouse);
        order.addProduct(monitor);

        System.out.println(order);

        System.out.println("\nPayment method: Bank Transfer");

        PaymentMethod payment = new BankTransfer();
        payment.pay(order.calculateTotal());
    }
}
