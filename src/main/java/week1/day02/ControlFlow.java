package week1.day02;

import java.util.Scanner;

public class ControlFlow { //1-20 33
    // Bài 1
    private static void checkPositiveNumber(int n) {
        if (n > 0) {
            System.out.println("Positive");
        } else if (n == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }

    // Bài 2
    private static void printOddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    // Bài 3
    private static void findLargerNumber(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println(b);
        }
    }

    // Bài 4
    public static void findLargestNumber(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("Equal");
        } else if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    // Bài 5
    private static void rankedScores(int score) {
        if (score >= 90 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Good");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Fair");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Average");
        } else if (score < 50 && score >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid score");
        }
    }

    // Bài 6
    private static void dayInWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    // Bài 7
    private static void simpleCalculator(int a, String operator, int b) {
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println((float) a / b);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    // Bài 8
    private static void miniMenu(Scanner sc) {
        System.out.println("===== MENU =====");
        System.out.println("1. Say Hello");
        System.out.println("2. Show Java");
        System.out.println("3. Show Developer");
        System.out.println("4. Exit");
        System.out.println("================");
        int choice;
        do {
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Java");
                    break;
                case 3:
                    System.out.println("Developer");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 4);
    }

    // Bài 9
    private static void oneToHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "  ");
        }
    }

    // Bài 10
    private static void evenNumberToHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }

    // Bài 11
    private static void sumOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Bài 12
    private static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Bài 13
    private static void countNumberDividedThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Bài 14
    private static int countNumber(int n) {
        int count = 0;
        if (n == 0) count = 1;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // Bài 15
    private static void sumNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    // Bìa 16
    private static void reverseNumber(int n) {
        int result = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            result = result * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(result);
    }

    // Bài 17
    private static void inputUntilValid(Scanner sc) {
        int input;
        do {
            System.out.print("Nhap so trong khoang 1 den 100: ");
            input = sc.nextInt();
            if (input < 1 || input > 100) {
                System.out.println("Invalid. Please enter again.");
            } else {
                System.out.println("Valid number: " + input);
            }
        } while (input < 1 || input > 100);
    }

    // Bài 18
    private static void firstNumberDevideSeven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    // Bài 19
    private static void skipNumberDevideThree() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    // Bài 20
    private static void firstPrimeNumber() {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                break;
            }
        }
    }

    // Bài 33
    private static void isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //menu
    private static void menu() {
        System.out.println("+---+----------------------------------------+");
        System.out.println("|   |                  MENU                  |");
        System.out.println("+---+----------------------------------------+");
        System.out.println("|1. | Kiem tra so duong-am                   |");
        System.out.println("|2. | Kiem tra so chan le                    |");
        System.out.println("|3. | Kiem tra so lon hon                    |");
        System.out.println("|4. | Kiem tra so lon nhat trong 3 so        |");
        System.out.println("|5. | Xep loai diem                          |");
        System.out.println("|6. | Kiem tra thu trong tuan                |");
        System.out.println("|7. | Simple Calculator                      |");
        System.out.println("|8. | Mini menu                              |");
        System.out.println("|9. | In tu 1 den 100                        |");
        System.out.println("|10.| In so chan                             |");
        System.out.println("|11.| Tong tu 1 den N                        |");
        System.out.println("|12.| Bang cuu chuong                        |");
        System.out.println("|13.| Dem so chia het cho 3                  |");
        System.out.println("|14.| Dem chu so                             |");
        System.out.println("|15.| Tinh tong cac chu so                   |");
        System.out.println("|16.| Dao nguoc so                           |");
        System.out.println("|17.| Nhap so den khi hop le                 |");
        System.out.println("|18.| So dau tien chia het cho 7             |");
        System.out.println("|19.| Bo qua so chia het cho 3               |");
        System.out.println("|20.| Tim so nguyen to dau tien              |");
        System.out.println("|21.| Tim so nguyen to tu 2 den n            |");
        System.out.println("|0. | Thoat chuong trinh                     |");
        System.out.println("+---+----------------------------------------+");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        menu();
        do {
            System.out.print("\nNhap lua chon cua ban (0-21): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nNhap so can kiem tra: "); int a1 = sc.nextInt();
                    checkPositiveNumber(a1);
                    break;
                case 2:
                    System.out.print("\nNhap so can kiem tra: "); int a2 = sc.nextInt();
                    printOddOrEven(a2);
                    break;
                case 3:
                    System.out.print("\nNhap so a: "); int a3 = sc.nextInt();
                    System.out.print("Nhap so b: "); int b3 = sc.nextInt();
                    findLargerNumber(a3, b3);
                    break;
                case 4:
                    System.out.print("\nNhap so a: "); int a4 = sc.nextInt();
                    System.out.print("Nhap so b: "); int b4 = sc.nextInt();
                    System.out.print("Nhap so c: "); int c4 = sc.nextInt();
                    findLargestNumber(a4, b4, c4);
                    break;
                case 5:
                    System.out.print("\nNhap diem: "); int a5 = sc.nextInt();
                    rankedScores(a5);
                    break;
                case 6:
                    System.out.print("\nNhap so: "); int a6 = sc.nextInt();
                    dayInWeek(a6);
                    break;
                case 7:
                    System.out.print("\nNhap so a: "); int a7 = sc.nextInt();
                    System.out.print("Nhap phep toan: "); String operator =  sc.next();
                    System.out.print("Nhap so b: "); int b7 = sc.nextInt();
                    simpleCalculator(a7, operator, b7);
                    break;
                case 8:
                    miniMenu(sc);
                    break;
                case 9:
                    oneToHundred();
                    break;
                case 10:
                    evenNumberToHundred();
                    break;
                case 11:
                    System.out.print("\nNhap so n: "); int a11 = sc.nextInt();
                    sumOneToN(a11);
                    break;
                case 12:
                    System.out.print("\nIn bang cuu chuong cua so: "); int a12 = sc.nextInt();
                    multiplicationTable(a12);
                    break;
                case 13:
                    System.out.print("\nNhap so n: "); int a13 = sc.nextInt();
                    countNumberDividedThree(a13);
                    break;
                case 14:
                    System.out.print("\nNhap so n: "); int a14 = sc.nextInt();
                    System.out.println(countNumber(a14));
                    break;
                case 15:
                    System.out.print("\nNhap so n: "); int a15 = sc.nextInt();
                    sumNumber(a15);
                    break;
                case 16:
                    System.out.print("\nNhap so n: ");  int a16 = sc.nextInt();
                    reverseNumber(a16);
                    break;
                case 17:
                    inputUntilValid(sc);
                    break;
                case 18:
                    firstNumberDevideSeven();
                    break;
                case 19:
                    skipNumberDevideThree();
                    break;
                case 20:
                    firstPrimeNumber();
                    break;
                case 21:
                    System.out.print("\nNhap so n: "); int a21 = sc.nextInt();
                    isPrime(a21);
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