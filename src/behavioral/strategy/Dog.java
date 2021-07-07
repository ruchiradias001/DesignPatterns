package behavioral.strategy;

public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog");
        flyingType = new CannotFly();
    }
}
