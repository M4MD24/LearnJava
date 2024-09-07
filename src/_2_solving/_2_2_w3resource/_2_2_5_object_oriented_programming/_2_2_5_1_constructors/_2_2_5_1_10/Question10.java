package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_constructors._2_2_5_1_10;

/**
 * <h3>Constructor for Singleton Pattern</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance.</h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final Singleton SINGLETON_1 = Singleton.getInstance(),
                SINGLETON_2 = Singleton.getInstance();
        System.out.print((SINGLETON_1 == SINGLETON_2)
                ? "Same!"
                : "Not Same!");
    }
}

class Singleton {
    private static Singleton singleton = null;

    Singleton() {
        System.out.println("Instance created!");
    }

    static Singleton getInstance() {
        return (singleton == null)
                ? singleton = new Singleton()
                : singleton;
    }
}