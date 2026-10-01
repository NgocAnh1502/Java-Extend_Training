package week1.day03.part07_polymorphism;

public class EmployeePolymorphismMain {
    public static void main(String[] args) {
        Employee developer = new Developer();
        Employee tester = new Tester();

        developer.work();
        tester.work();
    }
}
