package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_10;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the top and bottom elements of a given stack.</h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.println("Numbers: " + NUMBERS);
        System.out.println("Top Number: " + NUMBERS.firstElement());
        System.out.println("Bottom Number: " + NUMBERS.lastElement());
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
        NUMBERS.push(5);
        NUMBERS.push(4);
    }
}