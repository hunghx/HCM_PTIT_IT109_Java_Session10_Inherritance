import ra.Calculate;
import ra.CalculateImpl;
import ra.IShape;
import ra.MyClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
       // gọi static method của interface
        Calculate.staticMethod();
        Calculate calculate = new CalculateImpl();
        //  cú pháp lambda : thay thế lớp nặc danh dùng trong tạo đối tượng  interface có 1 phương thức trừu tượng
       // Java7 : anonymous class - lớp nặc danh
        IShape circle = new IShape() {
            @Override
            public double calAreaCircle(double radius) {
                return radius*radius*Math.PI;
            }
        };


        // Java8: lambda expression
        IShape shape = (r)-> r*r*Math.PI;
        // Java8 cung cấp các funtional Interface trong gói java.util.function

        // method reference
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        // hiển thị các giá trị ra màn hình

        Consumer<Integer> consumer = num -> System.out.println(num);

        list.forEach(MyClass::printNumber);




    }
}