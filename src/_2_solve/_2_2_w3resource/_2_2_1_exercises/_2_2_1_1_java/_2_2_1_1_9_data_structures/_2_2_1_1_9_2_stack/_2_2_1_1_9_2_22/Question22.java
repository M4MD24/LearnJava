package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_2_stack._2_2_1_1_9_2_22;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements a stack and find elements that are in the first stack but not in the second stack.</h2>
 */

public class Question22 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> FIRST_NUMBERS = new Stack<>(),
                SECOND_NUMBERS = new Stack<>();
        addFirstNumbers(FIRST_NUMBERS);
        addSecondNumbers(SECOND_NUMBERS);
        System.out.printf(
                """
                        First Numbers: %s
                        Second Numbers: %s
                        Common Numbers: %s""",
                FIRST_NUMBERS,
                SECOND_NUMBERS,
                getCommonNumbers(FIRST_NUMBERS, SECOND_NUMBERS)
        );
    }

    private static Stack<Integer> getCommonNumbers(final Stack<Integer> FIRST_NUMBERS, final Stack<Integer> SECOND_NUMBERS) {
        final Stack<Integer> COMMON_NUMBERS = new Stack<>();
        COMMON_NUMBERS.addAll(FIRST_NUMBERS);
        COMMON_NUMBERS.retainAll(SECOND_NUMBERS);
        return COMMON_NUMBERS;
    }

    private static void addFirstNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(6);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
        NUMBERS.push(4);
        NUMBERS.push(5);
        NUMBERS.push(1);
    }

    private static void addSecondNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(4);
        NUMBERS.push(5);
        NUMBERS.push(10);
        NUMBERS.push(1);
        NUMBERS.push(0);
    }
}