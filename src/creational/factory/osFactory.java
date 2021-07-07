package creational.factory;

public class osFactory {
    public OS getInstance(String str) {
        if (str.equals("Android")) {
            return new Android();
        }
        return new Mac();
    }
}
