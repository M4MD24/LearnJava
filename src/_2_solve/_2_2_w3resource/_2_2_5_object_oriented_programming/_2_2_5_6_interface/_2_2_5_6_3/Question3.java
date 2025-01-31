package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_interface._2_2_5_6_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Flyable with a method called fly(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly() method for each of the three classes.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        spacecraft();
        airplane();
        helicopter();
    }

    private static void helicopter() {
        final Flyable HELICOPTER = new Helicopter();
        HELICOPTER.fly();
    }

    private static void airplane() {
        final Flyable AIRPLANE = new Airplane();
        AIRPLANE.fly();
    }

    private static void spacecraft() {
        final Flyable SPACECRAFT = new Spacecraft();
        SPACECRAFT.fly();
    }
}

interface Flyable {
    void fly();
}

class Spacecraft implements Flyable {
    @Override
    public void fly() {
        System.out.println("Spacecraft is Flying!");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is Flying!");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly() {
        System.out.println("Helicopter is Flying!");
    }
}