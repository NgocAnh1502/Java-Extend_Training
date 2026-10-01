package week1.day03.part03_this;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Gui tien khong thanh cong!");
            return;
        }
        this.balance += amount;
        System.out.println("Gui tien thanh cong, new balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            System.out.println("Rut tien thanh cong, new balance: " + this.balance);
        } else if  (amount < 0) {
            System.out.println("Rut tien khong thanh cong! Khong rut duoc 0");
        } else {
            System.out.println("Rut tien khong thanh cong! Khong du so du");
        }
    }

    public void showBalance() {
        System.out.println("So du tai khoan: " + this.balance);
    }
}
