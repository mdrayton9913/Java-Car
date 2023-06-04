# Java-Car
# Car Class

The `Car` class represents a car object and provides methods for managing its fuel efficiency, fuel level, and odometer readings.

## Usage

```java
Car car = new Car(30.0); // Create a car object with a fuel efficiency of 30 miles per gallon

double fuelEfficiency = car.getFuelEfficiency(); // Get the fuel efficiency of the car
double fuelLevel = car.getFuelLevel(); // Get the current fuel level of the car
double odometer = car.getOdometer(); // Get the current odometer reading of the car

Car carWithFuel = car.addFuel(10.0); // Add 10 gallons of fuel to the car
double distanceTraveled = car.drive(200.0); // Drive the car for 200 miles and return the distance traveled

String carSpecs = car.toString(); // Get a string representation of the car object
```

## Class Details

### Constructors

- `Car(double fuelEfficiency)`: Creates a new car object with the specified fuel efficiency. The initial fuel level and odometer reading are set to 0.

- `Car(double fuelEfficiency, double fuelLevel)`: Creates a new car object with the specified fuel efficiency and initial fuel level. The initial odometer reading is set to 0.

### Methods

- `double getFuelEfficiency()`: Returns the fuel efficiency of the car in miles per gallon.

- `double getFuelLevel()`: Returns the current fuel level of the car in gallons.

- `double getOdometer()`: Returns the current odometer reading of the car in miles.

- `Car addFuel(double fuel)`: Adds the specified amount of fuel to the car's fuel level and returns a new car object with the updated fuel level. The fuel efficiency and odometer reading are preserved.

- `double drive(double miles)`: Drives the car for the specified distance in miles. If the car has enough fuel to travel the entire distance, the fuel level is adjusted accordingly, and the odometer reading is updated. Returns the actual distance traveled based on the available fuel. If the car does not have enough fuel, it will travel only as far as the fuel allows.

- `String toString()`: Returns a string representation of the car object, including its fuel efficiency, odometer reading, and fuel level.

## Example

```java
Car car = new Car(25.0, 5.0);
System.out.println(car.toString()); // Output: Car: mpg = 25.0, miles = 0.0, fuel = 5.0.

car.drive(100.0);
System.out.println(car.toString()); // Output: Car: mpg = 25.0, miles = 100.0, fuel = 1.0.

car.addFuel(10.0);
System.out.println(car.toString()); // Output: Car: mpg = 25.0, miles = 100.0, fuel = 11.0.
```

In this example, a car object is created with a fuel efficiency of 25 miles per gallon and an initial fuel level of 5 gallons. The car is then driven for 100 miles, which reduces the fuel level to 1 gallon. Finally, 10 gallons of fuel are added to the car's fuel level, resulting in a total fuel level of 11 gallons.
