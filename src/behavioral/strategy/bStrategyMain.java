package behavioral.strategy;

public class bStrategyMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("dog -> " + dog.getFlyingTypeMsg());
        System.out.println("bird -> " + bird.getFlyingTypeMsg());

        bird.setFlyingType(new CannotFly());

        System.out.println("bird -> " + bird.getFlyingTypeMsg());
    }
}
