package week1.day03.part04_encapsulation;

public class Student { //7-8
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
        else {
            System.out.println("Invalid age");
        }
    }
}
