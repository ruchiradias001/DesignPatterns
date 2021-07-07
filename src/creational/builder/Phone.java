package creational.builder;

public class Phone {
    private String OS;
    private int ram;
    private int storage;

    public Phone(String OS, int ram, int storage) {
        this.OS = OS;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Phone[" +
                "OS= " + OS +
                ", ram= " + ram +
                ", storage= " + storage +
                "]";
    }
}
