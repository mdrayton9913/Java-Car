/**
   This program tests the public interface of the Car class.

   When you run this program using your Car class, the only
   output you should get is the message
      "Your Car class passed all of these tests."

   Do not make any changes to this file.
*/

public class PreTestDrive
{
   public static void main( String[] args )
   {
      Car car1 = new Car(25.5);

      double fuelEfficiency = car1.getFuelEfficiency();
      double fuelLevel = car1.getFuelLevel();
      double odometer = car1.getOdometer();

      if (fuelLevel != 0.0 || fuelEfficiency != 25.5 || odometer != 0.0)
      {
         System.out.println("1. There is a problem with your constructors.");
         System.exit(0);
      }

      Car car2 = new Car(10.0, 5.0);

      fuelEfficiency = car2.getFuelEfficiency();
      fuelLevel = car2.getFuelLevel();
      odometer = car2.getOdometer();

      if (fuelLevel != 5.0 || fuelEfficiency != 10.0 || odometer != 0.0)
      {
         System.out.println("2. There is a problem with your constructors.");
         System.exit(0);
      }

      String s1 = car1.toString();

      if (! s1.equals("Car: mpg = 25.5, miles = 0.0, fuel = 0.0.") )
      {
         System.out.println("3. There is a problem with your toString() method.");
         System.exit(0);
      }

      String s2 = car2.toString();

      if (! s2.equals("Car: mpg = 10.0, miles = 0.0, fuel = 5.0.") )
      {
         System.out.println("4. There is a problem with your toString() method.");
         System.exit(0);
      }

      double newFuelLevel = car1.addFuel(12.5).getFuelLevel();

      fuelEfficiency = car1.getFuelEfficiency();
      odometer = car1.getOdometer();

      if(newFuelLevel != 12.5 || fuelEfficiency != 25.5 || odometer != 0.0)
      {
         System.out.println("5. There is a problem with your addFuel method.");
         System.exit(0);
      }

      double distance = car1.drive(76.5);

      if (distance != 76.5 || ! car1.toString().equals("Car: mpg = 25.5, miles = 76.5, fuel = 9.5."))
      {
         System.out.println("6. There is a problem with your drive method.");
         System.exit(0);
      }

      distance = car1.drive(1000);

      if (distance != 242.25 || ! car1.toString().equals("Car: mpg = 25.5, miles = 318.75, fuel = 0.0."))
      {
         System.out.println("7. There is a problem with your drive method.");
         System.exit(0);
      }

      distance = car1.drive(1);

      if (distance != 0.0 || ! car1.toString().equals("Car: mpg = 25.5, miles = 318.75, fuel = 0.0."))
      {
         System.out.println("8. There is a problem with your drive method.");
         System.exit(0);
      }

      System.out.println("Your Car class passed all of these tests.");
   }
}
