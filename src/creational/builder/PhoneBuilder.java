package creational.builder;

public class PhoneBuilder {
    private String OS;
    private int ram;
    private int storage;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Phone getPhone() {
        return new Phone(OS, ram, storage);
    }
}
