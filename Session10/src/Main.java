import inherit.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape.displayInfo();
        Shape.Color color = new Shape.Color("Blue");
        color.setColor("abc");
    }
}