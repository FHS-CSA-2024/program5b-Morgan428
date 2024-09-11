import java.util.Scanner;
public class CarTester{
    Scanner s = new Scanner(System.in);
    public Car addCar(){
        String name = s.nextLine();
        double miles = s.nextDouble();
        double gallons = s.nextDouble();
        new Car(name, miles, gallons);
        car.toString();
        return;
    }
    public static void main(String[] args){
        addCar();
    }
}
