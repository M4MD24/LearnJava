package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_8_polymorphism._2_2_1_1_5_8_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final Vehicle VEHICLE = new Vehicle();
        VEHICLE.speedUp();

        final Vehicle CAR = new Car();
        CAR.speedUp();

        final Vehicle BICYCLE = new Bicycle();
        BICYCLE.speedUp();
    }
}

class Vehicle {
    void speedUp() {
        System.out.println("Vehicle Speed has been increased!");
    }
}

class Car extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Car Speed has been increased!");
    }
}

class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Bicycle Speed has been increased!");
    }
}