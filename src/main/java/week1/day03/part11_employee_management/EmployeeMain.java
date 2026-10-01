package week1.day03.part11_employee_management;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer(1, "Nguyen Van A", 100, "Java"));
        employees.add(new Tester(2, "Nguyen Van B", 50, "Selenium"));
        employees.add(new Manager(3, "Nguyen Van C", 300));

        for (Employee employee : employees) {
            employee.work();
            employee.calculateBonus();
        }
    }
}
