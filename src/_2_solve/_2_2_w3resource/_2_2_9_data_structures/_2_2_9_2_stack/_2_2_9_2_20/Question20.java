package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_20;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements a stack and checks if two stacks are equal.</h2>
 */

public class Question20 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> FIRST_NUMBERS = new Stack<>(),
                SECOND_NUMBERS = new Stack<>();
        addNumbers(FIRST_NUMBERS);
        addNumbers(SECOND_NUMBERS);
        System.out.printf(
                """
                        First Numbers: %s
                        Second Numbers: %s
                        are numbers equals numbers? %b""",
                FIRST_NUMBERS,
                SECOND_NUMBERS,
                FIRST_NUMBERS.equals(SECOND_NUMBERS));
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(6);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
        NUMBERS.push(4);
        NUMBERS.push(5);
        NUMBERS.push(1);
    }
}