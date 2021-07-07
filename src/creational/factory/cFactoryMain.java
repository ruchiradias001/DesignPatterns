package creational.factory;

public class cFactoryMain {
    public static void main(String[] args) {
        osFactory osfObj = new osFactory();

        OS obj1 = osfObj.getInstance("Android");
        obj1.specs();

        System.out.println();

        OS obj2 = osfObj.getInstance("Mac");
        obj2.specs();
    }
}
