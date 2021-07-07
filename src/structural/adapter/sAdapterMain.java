package structural.adapter;

public class sAdapterMain {
    public static void main(String[] args) {
        Pen adapterPen = new AdapterPen();

        Assignment obj = new Assignment();
        obj.setP(adapterPen);
        obj.writeAssignment("Hi");
    }
}
