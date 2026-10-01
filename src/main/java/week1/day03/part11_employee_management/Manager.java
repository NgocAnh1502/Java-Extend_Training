package week1.day03.part11_employee_management;

public class Manager extends Employee {
    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    @Override
    public void calculateBonus() {
        System.out.println("Manager bonus: " + getSalary() * 2);
    }
}
