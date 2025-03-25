package enscapsulation;

public class Person {

    // thuộc tính
    private String name;
    int age;
    protected boolean sex;
    public String address;

    public Person() {
    }

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, int age, boolean sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 28;
        person.sex = true;
        person.address = "123 Main St";
    }
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + (sex? "Male" : "Female"));
        System.out.println("Address: " + address);
    }
}
