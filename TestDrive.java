/**
   Course: CS 27500
   Assignment: 1
   Name:
   Email:

   This program tests the Car class.
*/

import java.util.Scanner;

public class TestDrive
{
   public static void main(String[] args)
   {
	   double fuel_efficiency_input, fuel_input, distance;
      final Scanner user = new Scanner(System.in);
      System.out.println("Enter Fuel efficiency(enter 0 to quit)");
      fuel_efficiency_input = user.nextDouble();
      if(fuel_efficiency_input < 0)
      {
    	  user.close();
    	  throw new IllegalArgumentException("Illegal number.");
      }
      if(fuel_efficiency_input == 0)
      {
    	  System.exit(0);
      }
      Car car1 = new Car(fuel_efficiency_input);
      System.out.println("Enter amount of fuel (enter 0 to create a new car)");
      fuel_input = user.nextDouble();
      if(fuel_input < 0)
      {
    	  user.close();
    	  throw new IllegalArgumentException("Illegal number.");
      }
      if (fuel_input == 0)
      {
    	  do {
    		  System.out.println("Enter Fuel efficiency(enter 0 to quit)");
    	      fuel_efficiency_input = user.nextDouble();
    	      if(fuel_efficiency_input == 0)
    	      {
    	    	  System.exit(0);
    	      }
    		  System.out.println("Enter amount of fuel (enter 0 to create a new car)");
    	      fuel_input = user.nextDouble();
          } while(fuel_input == 0);
      }
      car1.addFuel(fuel_input);
      System.out.println("Enter distance to travel(enter 0 to add more fuel)");
      distance = user.nextDouble();
      if(distance < 0)
      {
    	  user.close();
    	  throw new IllegalArgumentException("Illegal number.");
      }
      if(distance > fuel_input * fuel_efficiency_input)
      {
    	  distance = fuel_input * fuel_efficiency_input;
      }
      if(distance == 0)
      {
       do {
    	  System.out.println("Enter amount of fuel (enter 0 to create a new car)");
 	      fuel_input = user.nextDouble();
 	     if (fuel_input == 0)
 	      {
 	    	  do {
 	    		  System.out.println("Enter Fuel efficiency(enter 0 to quit)");
 	    	      fuel_efficiency_input = user.nextDouble();
 	    	      if(fuel_efficiency_input == 0)
 	    	      {
 	    	    	  System.exit(0);
 	    	      }
 	    		  System.out.println("Enter amount of fuel (enter 0 to create a new car)");
 	    	      fuel_input = user.nextDouble();
 	          } while(fuel_input == 0);
 	    	  
 	       }
 	     	car1.addFuel(fuel_input);
          } while(distance == 0);
      }
      System.out.println("Distance actually traveled = " + car1.drive(distance));
      System.out.println("Current fuelLevel = " + car1.getFuelLevel());
      System.out.println("Current odometer = " + car1.getOdometer());
      user.close();
      
      



   }
}
