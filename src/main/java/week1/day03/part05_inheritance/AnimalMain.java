package week1.day03.part05_inheritance;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\nCat");
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
