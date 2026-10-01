package week1.day03.part08_override;

public class AnimalOverrideMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Animal animal = new Dog();
        animal.sound();
    }
}
