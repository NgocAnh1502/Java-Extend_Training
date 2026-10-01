package week1.day03.part11_employee_management;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Developer work with programming language " + this.programmingLanguage);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Developer bonus: " +  getSalary() * 1.5);
    }
}
