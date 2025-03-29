package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_2_static_members._2_2_1_1_5_2_3;

/**
 * <h3>Static Block</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Question3" with a static block that initializes a static variable 'initialValue' to 1000. Print the value of 'initialValue' before and after creating an instance of "Question3".</h2>
 */

public class Question3 {
    static int initialValue;

    static {
        initialValue = 1000;
        System.out.println("Static block = " + initialValue);
    }

    public static void main(final String[] ARGUMENTS) {
        System.out.println("Before = " + initialValue);
        final Question3 INITIALIZER = new Question3();
        System.out.print("After = " + initialValue);
    }
}