package structural.adapter;

public class AdapterPen implements Pen {

    Pencil obj = new Pencil();

    @Override
    public void write(String str) {
        obj.draw(str);
    }
}
