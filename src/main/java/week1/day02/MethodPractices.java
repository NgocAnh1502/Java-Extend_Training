package week1.day02;

import java.util.Scanner;

public class MethodPractices { //21-27
    // Bài 21
    private static int sum(int a, int b) {
        return a + b;
    }

    // Bài 22
    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Bài 23
    private static int max(int a, int b) {
        return a > b ? a : b; //Math.max(a, b);
    }
    private static int max(int a, int b, int c) {
        return max(max(a, b), c); //Math.max(max(a, b), c);
    }

    // Bài 24
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Bài 25
    public static long factorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    // Bài 26
    public static int calculate(int a, int b) {
        return a + b;
    }
    public static double calculate(double a, double b) {
        return a + b;
    }
    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    // Bài 27
    private static void print(int value) {
        System.out.println(value);
    }
    private static void print(String value) {
        System.out.println(value);
    }
    private static void print(double value) {
        System.out.println(value);
    }

    private static void menu() {
        System.out.println("+---+----------------------------------------+");
        System.out.println("|   |                  MENU                  |");
        System.out.println("+---+----------------------------------------+");
        System.out.println("|1. | Method tinh tong                       |");
        System.out.println("|2. | Method kiem tra so chan                |");
        System.out.println("|3. | Method tim so lon nhat                 |");
        System.out.println("|4. | Method kiem tra so nguyen to           |");
        System.out.println("|5. | Method tinh factorial                  |");
        System.out.println("|6. | Overloading calculate                  |");
        System.out.println("|7. | Overloading print                      |");
        System.out.println("|0. | Thoat chuong trinh                     |");
        System.out.println("+---+----------------------------------------+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        menu();
        do {
            System.out.print("\nNhap lua chon cua ban (0-7): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nNhap so a: "); int a1 = sc.nextInt();
                    System.out.print("Nhap so b: "); int b1 = sc.nextInt();
                    System.out.print(sum(a1, b1));
                    break;
                case 2:
                    System.out.print("\nNhap so a: "); int a2 = sc.nextInt();
                    System.out.println(isEven(a2));
                    break;
                case 3:
                    System.out.print("\nNhap so a: "); int a3 = sc.nextInt();
                    System.out.print("Nhap so b: "); int b3 = sc.nextInt();
                    System.out.print("Nhap so c: "); int c3 = sc.nextInt();
                    System.out.println("\nSo lon hon trong 2 so a va b la: " + max(a3, b3));
                    System.out.println("So lon hon trong 3 so a, b va c la: " + max(a3, b3, c3));
                    break;
                case 4:
                    System.out.print("\nNhap so: "); int a4 = sc.nextInt();
                    System.out.println("\nSo nguyen to: " + isPrime(a4));
                    break;
                case 5:
                    System.out.print("\nNhap so: "); int a5 = sc.nextInt();
                    System.out.println("\nfactorial(" + a5 + ") = " + factorial(a5));
                    break;
                case 6:
                    System.out.println(calculate(10, 20));
                    System.out.println(calculate(10.5, 20.5));
                    System.out.println(calculate(10, 20, 30));
                    break;
                    // Java biet phai goi method nao vi Java dua vao Method Signature: ten method, danh sach tham so.
                    // khi chay chuong trinh complier tu kiem tra cac doi so truyen vao de tim ham phu hop nhat.
                case 7:
                    print(10);
                    print("Hello");
                    print(10.5);
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.\n");
            }
        } while (choice != 0);
        sc.close();
    }
}
