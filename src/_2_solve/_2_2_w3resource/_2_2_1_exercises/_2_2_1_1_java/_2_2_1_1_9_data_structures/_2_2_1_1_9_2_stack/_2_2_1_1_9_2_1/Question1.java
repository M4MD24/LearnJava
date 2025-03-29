package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_2_stack._2_2_1_1_9_2_1;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a stack with push and pop operations. Find the top element of the stack and check if it is empty or not.</h2>
 */

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        removeLastNumber(NUMBERS);
        System.out.printf("""
                Top element: %d
                Is Empty: %b""",
                NUMBERS.firstElement(),
                NUMBERS.isEmpty());
    }

    private static void removeLastNumber(final Stack<Integer> NUMBERS) {
        NUMBERS.pop();
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
    }
}