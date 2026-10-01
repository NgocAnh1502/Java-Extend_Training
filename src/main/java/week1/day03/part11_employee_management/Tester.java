package week1.day03.part11_employee_management;

public class Tester extends Employee {
    private String testingTool;

    public Tester(int id, String name, double salary, String testingTool) {
        super(id, name, salary);
        this.testingTool = testingTool;
    }

    @Override
    public void work() {
        System.out.println("Tester work with testing tool " + this.testingTool);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Tester bonus: " + getSalary() * 1.25);
    }
}
