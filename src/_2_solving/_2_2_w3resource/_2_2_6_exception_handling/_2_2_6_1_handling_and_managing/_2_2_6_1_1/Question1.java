package _2_solving._2_2_w3resource._2_2_6_exception_handling._2_2_6_1_handling_and_managing._2_2_6_1_1;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that throws an exception and catch it using a try-catch block.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input integer number: ");
        try {
            INPUT.nextInt();
            System.out.println("Done!");
        } catch (final ArithmeticException ARITHMETIC_EXCEPTION) {
            ARITHMETIC_EXCEPTION.printStackTrace();
        }
    }
}