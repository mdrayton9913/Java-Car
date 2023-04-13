/**
   Course: CS 27500
   Assignment: 1
   Name: Maximillan Drayton
   Email:mdrayton@pnw.edu

   This Car class models a few aspects of a real car.
*/

public class Car
{
		  private double fuel_efficiency; //miles per gallon
		  private double fuel_level; //gallons
		  private double odometer; //miles
		  public Car(double fuelEfficiency)
		  {
		    fuel_efficiency = fuelEfficiency;
		    fuel_level = 0;
		    odometer = 0;
		  }
		  public Car(double fuelEfficiency, double fuelLevel) {
		    fuel_efficiency = fuelEfficiency;
		    fuel_level = fuelLevel;
		    odometer = 0;
		  }
		  public double getFuelEfficiency(){
		    return fuel_efficiency;
		  }
		  public double getFuelLevel(){
		    return fuel_level;
		  }
		  public double getOdometer(){
		    return odometer;
		  }
		  Car addFuel(double fuel)
		  {
		    fuel_level = fuel_level + fuel;
		    Car car_copy = new Car(fuel_efficiency, fuel_level);
		    car_copy.odometer = odometer;
		    return car_copy;
		  }
		  public double drive(double miles){
		    if (miles > fuel_level * fuel_efficiency)
		    {
		    double distance_traveled = fuel_level * fuel_efficiency;
		      odometer = odometer + (fuel_level * fuel_efficiency);
		      fuel_level = 0;
		      return distance_traveled;
		    }
		    else
		    {
		    	fuel_level = fuel_level - (miles/fuel_efficiency);
		    	odometer = odometer + miles;
		    	return miles;
		    }
		  }
		  public String toString(){
		    String specs = "Car: mpg = " + fuel_efficiency + 
		      ", miles = " + odometer + ", fuel = " 
		      + fuel_level + ".";
		    return specs;

		  }
		  
}
