package week1.day03.part05_inheritance;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eat");
    }
    public void sleep() {
        System.out.println("Sleep");
    }
}
