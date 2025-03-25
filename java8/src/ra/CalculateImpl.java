package ra;

public class CalculateImpl implements Calculate{
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void printfInfo() {
        System.out.println("Đây là phương thức bị ghi đè ở CalculateImpl");
    }

}
