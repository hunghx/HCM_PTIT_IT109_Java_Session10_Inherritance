package inherit;

public class Shape {

    // thuộc tính : static variable
    public static final String NAME = "Hunghx";
//    public static final Student[] students = new Student[100];

    // phương thức static
    public static void displayInfo() {
        System.out.println("This is a shape class. Name: " + NAME);
    }

    public Shape() {
        System.out.println("Khởi tạo đối tượng");
    }

    // khối static
    static {
//        students[0] = new Student();
//        students[1] = new Student();
//        students[2] = new Student();
        // code logic
        int a =10;
        if(NAME.length()>4){
            System.out.println("length of Name more than 4");
        }else {
            System.out.println("length of Name less than or equal 4");
        }
    }

    public static class Color{
        // các thuộc tính và phơng thức
        private String color;
        public Color(final String color){
            this.color = color;
//            color = "abc";
            System.out.println("This is a color class. Color: " + color);
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
//        displayInfo();
    }
}
