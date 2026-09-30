package week1.day02;

import java.util.Scanner;

public class ATM { //30-ATM
    private static long balance = 10_000_000;

    public static long getBalance() {
        return balance;
    }

    public static void setBalance(long balance) {
        ATM.balance = balance;
    }

    private static boolean checkPin(Scanner sc) {
        int count = 1;
        do {
            System.out.print("Vui long nhap ma pin: ");
            int pin = sc.nextInt();
            if (pin == 1008) {
                return true;
            }
            count++;
            System.out.println("Sai ma pin vui long nhap lai\n");
        } while (count <= 3);
        return false;
    }

    private static void checkBalance() {
        System.out.println("\nSo du tai khoan: " + getBalance());
    }

    private static void deposit(Scanner sc) {
        System.out.print("\nVui long nhap so tien can gui: ");
        long amount = sc.nextLong();
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Gui tien thanh cong. So du tai khoan moi: " + getBalance());
        } else {
            System.out.println("Loi: So tien gui nho hon 0!");
        }
    }

    private static void withdraw(Scanner sc) {
        System.out.print("\nVui long nhap so tien can rut: ");
        long amount = sc.nextLong();
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Rut tien thanh cong. So du tai khoan moi: " + getBalance());
        } else if (amount > getBalance()) {
            System.out.println("Loi: So tien rut vuot qua balance!");
        } else {
            System.out.println("Loi: So tien rut nho hon 0!");
        }
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("+---+----------------------------------------+");
        System.out.println("|   |                  MENU                  |");
        System.out.println("+---+----------------------------------------+");
        System.out.println("|1. | Check Balance                          |");
        System.out.println("|2. | Deposit                                |");
        System.out.println("|3. | Withdraw                               |");
        System.out.println("|4. | Exit                                   |");
        System.out.println("+---+----------------------------------------+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        if (checkPin(sc)) {
            do {
                showMenu();
                System.out.print("\nNhap lua chon: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit(sc);
                        break;
                    case 3:
                        withdraw(sc);
                        break;
                    case 4:
                        System.out.println("Da thoat chuong trinh!");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le. Moi nhap lai!\n");
                }
            } while (choice != 4);
        } else {
            System.out.println("Ban da nhap sai ma pin qua 3 lan");
        }
        sc.close();
    }
}
