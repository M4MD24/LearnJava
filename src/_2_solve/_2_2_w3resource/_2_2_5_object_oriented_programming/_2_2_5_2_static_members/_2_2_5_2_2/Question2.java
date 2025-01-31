package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_static_members._2_2_5_2_2;

/**
 * <h3>Static Methods</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Question2" with a static method add that takes two integers and returns their sum. Demonstrate the usage of this static method in the main method without creating an instance of "Question2".</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(add(10, 20));
    }

    static long add(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER + SECOND_NUMBER;
    }
}