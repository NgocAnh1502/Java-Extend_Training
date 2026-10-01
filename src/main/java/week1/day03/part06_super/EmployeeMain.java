package week1.day03.part06_super;

public class EmployeeMain {
    public static void main(String[] args) {
        Developer developer = new Developer(1, "Rack", "Jav");
        Tester tester = new Tester(2, "K-ATM", "Piano");

        System.out.println("Developer");
        System.out.println(developer.getId());
        System.out.println(developer.getName());
        System.out.println(developer.getProgrammingLanguage());

        System.out.println("\nTester");
        System.out.println(tester.getId());
        System.out.println(tester.getName());
        System.out.println(tester.getTestingTool());
    }
}
