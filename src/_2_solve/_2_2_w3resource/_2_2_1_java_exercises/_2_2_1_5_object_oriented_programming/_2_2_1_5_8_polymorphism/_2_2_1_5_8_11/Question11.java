package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_8_polymorphism._2_2_1_5_8_11;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.</h2>
 */
public class Question11 {
    public static void main(final String[] ARGUMENTS) {
        final Vehicle VEHICLE = new Vehicle();
        VEHICLE.startEngine();
        VEHICLE.stopEngine();

        System.out.println();

        final Vehicle CAR = new Car();
        CAR.startEngine();
        CAR.stopEngine();

        System.out.println();

        final Vehicle MOTORCYCLE = new Motorcycle();
        MOTORCYCLE.startEngine();
        MOTORCYCLE.stopEngine();
    }
}

class Vehicle {
    void startEngine() {
        System.out.println("Start Vehicle Engine!");
    }

    void stopEngine() {
        System.out.println("Stop Vehicle Engine!");
    }
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