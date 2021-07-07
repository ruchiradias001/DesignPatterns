package behavioral.strategy;

public interface Fly {
    String flyMsg();
}

class CanFly implements Fly {

    @Override
    public String flyMsg() {
        return "Can fly";
    }
}

class CannotFly implements Fly {

    @Override
    public String flyMsg() {
        return "Cannot fly";
    }
}
