package week1.day03.part09_abstraction;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.sound();
        
        cat.eat();
        cat.sound();
    }
}
