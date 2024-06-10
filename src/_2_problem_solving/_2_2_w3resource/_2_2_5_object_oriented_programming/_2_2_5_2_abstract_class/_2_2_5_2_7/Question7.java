package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_abstract_class._2_2_5_2_7;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGS) {
        car();
        motorcycle();
    }

    private static void motorcycle() {
        final Vehicle MOTORCYCLE = new Motorcycle();
        MOTORCYCLE.startEngine();
        MOTORCYCLE.stopEngine();
    }

    private static void car() {
        final Vehicle CAR = new Car();
        CAR.startEngine();
        CAR.stopEngine();
    }
}

abstract class Vehicle {
    abstract void startEngine();

    abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Start Car Engine!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop Car Engine!");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Start Motorcycle Engine!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop Motorcycle Engine!");
    }
}