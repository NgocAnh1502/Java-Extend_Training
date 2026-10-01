package week1.day03.part06_super;

public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eats");
    }
}
