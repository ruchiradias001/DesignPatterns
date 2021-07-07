package behavioral.strategy;

public class Bird extends Animal {
    public Bird() {
        System.out.println("Bird");
        flyingType = new CanFly();
    }
}
