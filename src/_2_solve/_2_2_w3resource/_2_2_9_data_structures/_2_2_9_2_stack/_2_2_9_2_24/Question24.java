package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_24;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements a stack and creates a new stack from a portion of the original stack.</h2>
 */

public class Question24 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        final int FIRST_POSITION = 2,
                SECOND_POSITION = 5;
        System.out.printf(
                """
                        Before Remove Duplicated Numbers: %s
                        After Remove Duplicated Numbers : %s""",
                NUMBERS,
                NUMBERS.subList(FIRST_POSITION, SECOND_POSITION)
        );
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(6);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
        NUMBERS.push(4);
        NUMBERS.push(5);
        NUMBERS.push(3);
        NUMBERS.push(1);
    }
}