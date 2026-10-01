package week1.day03.part01_class_object;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.name = "Duy";
        student.age = 20;

        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}
