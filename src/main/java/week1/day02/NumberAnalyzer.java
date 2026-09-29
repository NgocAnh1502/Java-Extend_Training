package week1.day02;

import java.util.Scanner;

public class NumberAnalyzer { //29
    private static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        else return false;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int countNumber(int n) {
        int count = 0;
        if (n == 0) count = 1;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    private static int sumNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static void reverseNumber(int n) {
        int result = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            result = result * 10 + lastDigit;
            n /= 10;
        }
        System.out.println("Reverse: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n  = sc.nextInt();

        System.out.println("\nEven: " +  isEven(n));
        System.out.println("Prime: " +  isPrime(n));
        System.out.println("Digits: " +  countNumber(n));
        System.out.println("Digit Sum: " + sumNumber(n));
        reverseNumber(n);
        sc.close();
    }
}
