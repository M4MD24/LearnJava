package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_28;

import java.util.Stack;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that implements a stack and create a new stack by removing elements that do not satisfy a condition.</h2>
 */

public class Question28 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.printf("""
                        Numbers: %s
                        contain odd numbers? %s""",
                NUMBERS,
                getNumbersAfterRemoveOddNumbers(NUMBERS)
        );
    }

    private static Stack<Integer> getNumbersAfterRemoveOddNumbers(final Stack<Integer> NUMBERS) {
        final Stack<Integer> NUMBERS_AFTER_REMOVE_ODD_NUMBERS = new Stack<>();
        NUMBERS_AFTER_REMOVE_ODD_NUMBERS.addAll(NUMBERS);
        NUMBERS_AFTER_REMOVE_ODD_NUMBERS.removeIf(number -> number % 2 != 0);
        return NUMBERS_AFTER_REMOVE_ODD_NUMBERS;
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(8);
        NUMBERS.push(3);
        NUMBERS.push(9);
        NUMBERS.push(4);
        NUMBERS.push(1);
        NUMBERS.push(0);
    }
}