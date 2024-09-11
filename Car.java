import java.util.Scanner;
public class Car{
    // get data here
    private String carName = "";
    private double milesDriven = 0;
    private double gallonsUsed = 0;
    
    //set classespublic Car(String carName, int milesDriven, int gallonsUsed){}
    public Car(){
        //
    }
    public Car(String newName, double newMiles, double newGallons) {
        carName = newName;  // Assign the parameter to the instance variable
        milesDriven = newMiles;
        gallonsUsed = newGallons;
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
        getName();
        double ave = milesDriven / gallonsUsed;
        ave = Math.round(ave * 10) / 10.0;
        return ave;
    }
    public String toString() {
        return carName + " averaged " + calcAve() + " m/g";
    }
    
}
