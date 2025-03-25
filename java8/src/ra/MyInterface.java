package ra;
@FunctionalInterface
public interface MyInterface {
    // functional interface là interface có 1 và chỉ một phương thức trừu tượng
    void abstractMethod();

   default void printData(){

   };
}
