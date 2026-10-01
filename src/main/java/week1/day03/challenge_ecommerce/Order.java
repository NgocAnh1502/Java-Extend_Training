package week1.day03.challenge_ecommerce;

import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Product> products;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new java.util.ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void removeProduct(Product product){
        this.products.remove(product);

    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customer.getName());
        sb.append("\n\nOrder:\n");
        for (Product product : products) {
            sb.append(String.format("- %-15s %,.0f%n", product.getName(), product.getPrice()));
        }
        sb.append(String.format("%nTotal: %,.0f", calculateTotal()));
        return sb.toString();
    }
}
