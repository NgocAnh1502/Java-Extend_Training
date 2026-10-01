package week1.day03.part04_encapsulation;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Gui tien khong thanh cong!");
            return;
        }
        balance += amount;
        System.out.println("Gui tien thanh cong, new balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien rut khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So du khong du!");
            return;
        }
        balance -= amount;
        System.out.println("Rut tien thanh cong, new balance: " + balance);
    }
}
