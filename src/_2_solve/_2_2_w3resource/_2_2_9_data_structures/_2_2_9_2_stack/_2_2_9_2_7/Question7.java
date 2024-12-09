package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_7;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count all stack elements.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.println("Numbers: " + NUMBERS);
        System.out.print("Count of Numbers: " + NUMBERS.size());
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
    }
}