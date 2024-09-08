package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_static_members._2_2_5_2_6;

/**
 * <h3>Static Method with Static Variable</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a static method "generateID()" that returns the next ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.</h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        System.out.println(IDGenerator.generateID());
        System.out.println(IDGenerator.generateID());
        System.out.println(IDGenerator.generateID());
    }
}

class IDGenerator {
    private static int nextID = 1;

    static int generateID() {
        return nextID++;
    }
}