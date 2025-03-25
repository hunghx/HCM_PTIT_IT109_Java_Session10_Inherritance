package enscapsulation;

public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "John"; // private
        person.age =25;
        person.sex = true;
        person.address = "123 Main St";
    }
}
