package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_21;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Vehicle" with attributes for make, model, and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.</h2>
 */

public class Question21 {
    public static void main(final String[] PARAMETERS) {
        final Vehicle TRUCK = new Truck("Truck 1", "333", 2022, 5000);
        TRUCK.displayInformation();

        final Vehicle CAR = new Car("Car 1", "222", 2020, (byte) 5);
        CAR.displayInformation();

        final Vehicle MOTORCYCLE = new Motorcycle("Motorcycle 1", "111", 2021, 500);
        MOTORCYCLE.displayInformation();
    }
}

class Vehicle {
    private final String MAKE,
            MODEL;
    private final int YEAR;

    Vehicle(final String MAKE, final String MODEL, final int YEAR) {
        this.MAKE = MAKE;
        this.MODEL = MODEL;
        this.YEAR = YEAR;
    }

    String getMake() {
        return MAKE;
    }

    String getModel() {
        return MODEL;
    }

    int getYear() {
        return YEAR;
    }

    void displayInformation() {
        System.out.print(getMake() + ", " + getModel() + ", " + getYear());
    }
}

class Truck extends Vehicle {
    private final int CAPACITY;

    Truck(final String MAKE, final String MODEL, final int YEAR, final int CAPACITY) {
        super(MAKE, MODEL, YEAR);
        this.CAPACITY = CAPACITY;
    }

    int getCapacity() {
        return CAPACITY;
    }

    @Override
    void displayInformation() {
        super.displayInformation();
        System.out.println(", Capacity: " + getCapacity());
    }
}

class Car extends Vehicle {
    private final byte NUMBER_OF_SEATS;

    Car(final String MAKE, final String MODEL, final int YEAR, final byte NUMBER_OF_SEATS) {
        super(MAKE, MODEL, YEAR);
        this.NUMBER_OF_SEATS = NUMBER_OF_SEATS;
    }

    int getNumberOfSeats() {
        return NUMBER_OF_SEATS;
    }

    @Override
    void displayInformation() {
        super.displayInformation();
        System.out.println(", Number of Seats: " + getNumberOfSeats());
    }
}

class Motorcycle extends Vehicle {
    private final int ENGINE_CAPACITY;

    Motorcycle(final String MAKE, final String MODEL, final int YEAR, final int ENGINE_CAPACITY) {
        super(MAKE, MODEL, YEAR);
        this.ENGINE_CAPACITY = ENGINE_CAPACITY;
    }

    public int getEngineCapacity() {
        return ENGINE_CAPACITY;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(", Engine Capacity: " + getEngineCapacity());
    }
}