package inherit;

import enscapsulation.Person;

public class Student extends Person {
    // instance variables - attributes
    Address address;      // aggregation

    public Student(Address address, String name, int a, String add, boolean sex ) {
        super(name, a, sex); // goi đến constructor ở lớp cha
        this.address = address;
    }


    @Override
    public void showInfo() {
        System.out.println("Address");
    }
    public void showInfo1(){
        super.showInfo(); // supper chính là Person
    }
    public static void main(String[] args) {
        // gọi tới phương thức chưa bi ghi đè
//      Student p = new Student(new Address());
//      p.showInfo(); // hiển thị thông tin của Studnet
//      p.showInfo1(); // hiển thị thông tin của Person

    }

}

