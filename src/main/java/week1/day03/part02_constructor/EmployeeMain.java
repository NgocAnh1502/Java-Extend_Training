package week1.day03.part02_constructor;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(1, "An");
        Employee e3 = new Employee(2, "Bình", 1500);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
