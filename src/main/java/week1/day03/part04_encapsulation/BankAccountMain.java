package week1.day03.part04_encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("123");
        account.setOwnerName("Duy");

        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("\nDeposit");
        account.deposit(500);

        System.out.println("\nWithdraw");
        account.withdraw(200);
    }
}
