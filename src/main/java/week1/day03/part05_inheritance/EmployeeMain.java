package week1.day03.part05_inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Tester tester = new Tester();

        developer.setId(1);
        developer.setName("Rack");
        developer.setSalary(4.4);
        developer.setProgrammingLanguage("Jav");

        tester.setId(1);
        tester.setName("K-ATM");
        tester.setSalary(100);
        tester.setTestingTool("Piano");

        developer.work();
        tester.work();
    }
}
