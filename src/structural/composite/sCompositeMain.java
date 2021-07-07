package structural.composite;

public class sCompositeMain {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("leaf 1", 400);
        Component leaf2 = new Leaf("leaf 2", 500);
        Component leaf3 = new Leaf("leaf 3", 700);
        Component leaf4 = new Leaf("leaf 4", 200);
        Component leaf5 = new Leaf("leaf 5", 900);

        Composite comp1 = new Composite("comp 1");
        Composite comp2 = new Composite("comp 2");
        Composite comp3 = new Composite("comp 3");

        comp1.addComponent(leaf1);
        comp1.addComponent(leaf2);

        comp2.addComponent(leaf3);
        comp2.addComponent(leaf4);
        comp2.addComponent(comp1);

        comp3.addComponent(leaf5);

        comp2.showPrice();
    }
}
