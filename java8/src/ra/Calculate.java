package ra;

public interface Calculate {
    double PI = 3.14;
    double calculateArea();
    // phương thức mặc định
    default  void printfInfo(){
        System.out.println("Đây là phương thức mặc định");
    };

    // phát triển thêm tính năng
    default void newMethod(){

    }
    // phương thức tĩnh
    static void staticMethod(){
        System.out.println("Đây là phương thức tinh");
    }


}
