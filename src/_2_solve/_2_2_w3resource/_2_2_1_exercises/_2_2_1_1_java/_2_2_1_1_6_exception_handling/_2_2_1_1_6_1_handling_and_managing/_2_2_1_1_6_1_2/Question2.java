package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_6_exception_handling._2_2_1_1_6_1_handling_and_managing._2_2_1_1_6_1_2;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input odd number: ");
        isOdd(INPUT.nextInt());
    }

    private static void isOdd(final int NUMBER) {
        if (NUMBER % 2 != 0)
            System.out.println("Done!");
        else
            System.out.print(new IllegalArgumentException("Not odd number!").getMessage());
    }
}