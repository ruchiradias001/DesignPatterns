package creational.builder;

public class cBuilderMain {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOS("Android").setStorage(256).setRam(8).getPhone();
        System.out.println(p);
    }
}
