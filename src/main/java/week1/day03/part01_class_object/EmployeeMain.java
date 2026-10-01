package week1.day03.part01_class_object;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.name = "An";
        employee1.salary = 1000;

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.name = "Bình";
        employee2.salary = 1200;

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.name = "Châu";
        employee3.salary = 3000;

        System.out.println("\nEmployee 1");
        System.out.println("ID: " + employee1.id);
        System.out.println("Name: " + employee1.name);
        System.out.println("Salary: " + employee1.salary);

        System.out.println("\nEmployee 2");
        System.out.println("ID: " + employee2.id);
        System.out.println("Name: " + employee2.name);
        System.out.println("Salary: " + employee2.salary);

        System.out.println("\nEmployee 3");
        System.out.println("ID: " + employee3.id);
        System.out.println("Name: " + employee3.name);
        System.out.println("Salary: " + employee3.salary);
    }
}
