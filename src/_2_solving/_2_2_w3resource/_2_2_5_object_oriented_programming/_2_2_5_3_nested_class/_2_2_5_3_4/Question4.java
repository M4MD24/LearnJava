package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_4;

/**
 * <h3>Anonymous Class</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface called Greeting with a method sayHello(). In the main method, create an anonymous class that implements the Greeting interface and override the sayHello() method to print "Hello, World!". Call the sayHello() method.</h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final Greeting GREETING = () -> System.out.println("Hello, World!");
        GREETING.sayHello();
    }
}

interface Greeting {
    void sayHello();
}
