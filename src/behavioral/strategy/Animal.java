package behavioral.strategy;

public class Animal {
    public Fly flyingType;

    public String  getFlyingTypeMsg() {
        return flyingType.flyMsg();
    }

    public void setFlyingType(Fly newFlyingType) {
        this.flyingType = newFlyingType;
    }
}
