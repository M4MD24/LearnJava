package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_4_inheritance._2_2_5_4_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.</h2>
 */

public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        final Truck TRUCK = new Truck("Volvo", "FH16", 2022, FuelType.Diesel);
        final Car CAR = new Car("Toyota", "Corolla", 2020, FuelType.Petrol);
        final Motorcycle MOTORCYCLE = new Motorcycle("Harley-Davidson", "Street Glide", 2021, FuelType.Petrol);

        System.out.println("Fuel efficiency of the car: " + CAR.calculateFuelEfficiency(100, 10) + " km/l");
        System.out.println("Distance traveled by the motorcycle in 2 hours at 60 km/h: " + MOTORCYCLE.calculateDistance(2, 60) + " km");
        System.out.println("Max speed of the truck: " + TRUCK.calculateMaxSpeed(500, 10000) + " km/h");
    }
}

class Vehicle {
    Vehicle(final String MAKE, final String MODEL, final int YEAR, final FuelType FUEL_TYPE) {
    }

    double calculateFuelEfficiency(final double DISTANCE, final double FUEL_CONSUMED) {
        return DISTANCE / FUEL_CONSUMED;
    }

    double calculateDistance(final double TIME, final double SPEED) {
        return TIME * SPEED;
    }

    int calculateMaxSpeed(final int HORSE_POWER, final double VEHICLE_WEIGHT) {
        return (int) ((HORSE_POWER * 2.0) / VEHICLE_WEIGHT);
    }
}

class Truck extends Vehicle {
    Truck(final String MAKE, final String MODEL, final int YEAR, final FuelType FUEL_TYPE) {
        super(MAKE, MODEL, YEAR, FUEL_TYPE);
    }
}

class Car extends Vehicle {
    Car(final String MAKE, final String MODEL, final int YEAR, final FuelType FUEL_TYPE) {
        super(MAKE, MODEL, YEAR, FUEL_TYPE);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(final String MAKE, final String MODEL, final int YEAR, final FuelType FUEL_TYPE) {
        super(MAKE, MODEL, YEAR, FUEL_TYPE);
    }
}

enum FuelType {
    Gasoline,
    Diesel,
    NaturalGas,
    Propane,
    Biofuels,
    Hydrogen,
    Petrol
}