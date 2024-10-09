package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_26;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements a stack and checks if all elements of the stack satisfy a condition.</h2>
 */

public class Question26 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.printf("""
                        Numbers: %s
                        Are numbers odd? %b""",
                NUMBERS,
                areNumbersOdd(NUMBERS)
        );
    }

    private static boolean areNumbersOdd(final Stack<Integer> NUMBERS) {
        return NUMBERS.stream().allMatch(number -> number % 2 != 0);
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(9);
        NUMBERS.push(1);
        NUMBERS.push(7);
    }
}