package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_inheritance._2_2_5_1_2;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".</h2>
 */

public class Question2 {
    public static void main(final String[] ARGS) {
        System.out.print(new Car().drive());
    }
}

class Vehicle {
    String drive() {
        return "Repairing a vehicle";
    }
}

class Car extends Vehicle {
    @Override
    String drive() {
        return "Repairing a car";
    }
}