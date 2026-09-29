package week1.day02;

import java.util.Scanner;

public class StudentManager { //28
    private static double calculateAverage(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }
    private static String getRank(double averageScore){
        if (averageScore < 0 || averageScore > 100) return "Invalid Score";
        if (averageScore >= 90) return "Excellent";
        if (averageScore >= 80) return "Good";
        if (averageScore >= 70) return "Fair";
        if (averageScore >= 50) return "Average";
        return "Fail";
    }
    private static boolean isPassed(double averageScore){
        if (averageScore >= 50 && averageScore <= 100) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        int math = sc.nextInt();
        System.out.print("Nhap diem tieng anh: ");
        int english = sc.nextInt();
        System.out.print("Nhap diem java: ");
        int java = sc.nextInt();
        double average =  calculateAverage(math, english, java);

        System.out.println("\nName: " + name);
        System.out.println("Average: " + average);
        System.out.println("Rank: " + getRank(average));
        System.out.println("Status: " + (isPassed(average) ? "Passed" : "Fail") );

        sc.close();
    }
}
