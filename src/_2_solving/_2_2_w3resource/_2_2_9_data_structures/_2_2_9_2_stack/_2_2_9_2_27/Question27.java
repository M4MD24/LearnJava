package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_27;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements a stack and checks if at least one element of the stack satisfies a condition.</h2>
 */

public class Question27 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.printf("""
                        Numbers: %s
                        contain odd numbers? %b""",
                NUMBERS,
                containOddNumber(NUMBERS)
        );
    }

    private static boolean containOddNumber(final Stack<Integer> NUMBERS) {
        return NUMBERS.stream().anyMatch(number -> number % 2 != 0);
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(8);
        NUMBERS.push(4);
        NUMBERS.push(1);
        NUMBERS.push(0);
    }
}