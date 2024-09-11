import java.util.Scanner;
public class Car{
    // get data here
    private String carName = "";
    private double milesDriven = 0;
    private double gallonsUsed = 0;
    
    //set classespublic Car(String carName, int milesDriven, int gallonsUsed){}
    public Car(){
        String name = carName;
        double miles = milesDriven;
        double gallons = gallonsUsed;
    }
    public Car(String newName, double newMiles, double newGallons){
        newName = carName;
        newMiles = milesDriven;
        newGallons = gallonsUsed;
    }
    public String getName(){
        return carName;
    }
    public double getMiles(){
        return milesDriven;
    }
    public double getGallons(){
        return gallonsUsed;
    }
    public void setName(String newName){
        carName = newName;
    }
    public void setMiles(double newMiles){
        milesDriven = newMiles;
    }
    public void setGallons(double newGallons){
        gallonsUsed = newGallons;
    }
    public double calcAve(){
        double ave = milesDriven / gallonsUsed;
        return ave;
    }
    public String toString(){
        String str = carName + "averaged" + (milesDriven / gallonsUsed);
        return str;
    }
    
}
