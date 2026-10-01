package week1.day03.part04_encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Duy");
        student.setAge(120);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
