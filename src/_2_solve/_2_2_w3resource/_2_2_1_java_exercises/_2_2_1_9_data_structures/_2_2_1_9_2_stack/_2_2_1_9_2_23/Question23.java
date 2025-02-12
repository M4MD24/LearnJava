package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_2_stack._2_2_1_9_2_23;

import java.util.Arrays;
import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements a stack and creates a new stack that contains all elements from two stacks without duplicates.</h2>
 */

public class Question23 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.printf(
                """
                        Before Remove Duplicated Numbers: %s
                        After Remove Duplicated Numbers : %s""",
                NUMBERS,
                Arrays.toString(NUMBERS.stream().distinct().toArray())
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