import java.util.Scanner;
public class CarTester{
    Scanner s = new Scanner(System.in);
    public Car addCar(){
        System.out.println("Enter Car Name:");
        String carName = s.nextLine();
        System.out.println("Enter Car Miles:");
        double miles = s.nextDouble();
        System.out.println("Enter Car Gallons:");
        double gallons = s.nextDouble();
        Car car = new Car(carName, miles, gallons);
        System.out.println(car.toString());
        return car;
    }
    public static void main(String[] args) {
        CarTester carA = new CarTester();
        carA.addCar();
        CarTester carB = new CarTester();
        carB.addCar();
    }
}
