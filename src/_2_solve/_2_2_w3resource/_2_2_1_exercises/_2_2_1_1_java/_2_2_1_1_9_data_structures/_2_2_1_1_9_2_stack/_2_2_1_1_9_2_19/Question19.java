package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_2_stack._2_2_1_1_9_2_19;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements a stack and checks if the stack is a subset of another stack.</h2>
 */

public class Question19 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> FIRST_NUMBERS = new Stack<>(),
                SECOND_NUMBERS = new Stack<>();
        addNumbers(FIRST_NUMBERS);
        addNumbers(SECOND_NUMBERS);
        removeNumbers(SECOND_NUMBERS);
        System.out.printf(
                """
                        First Numbers: %s
                        Second Numbers: %s
                        Is subset of numbers? %b""",
                FIRST_NUMBERS,
                SECOND_NUMBERS,
                areSubsetNumbersOfNumbers(FIRST_NUMBERS, SECOND_NUMBERS));
    }

    private static boolean areSubsetNumbersOfNumbers(final Stack<Integer> NUMBERS, final Stack<Integer> SUBSET_NUMBERS) {
        if (!SUBSET_NUMBERS.isEmpty()) {
            for (final Integer NUMBER : SUBSET_NUMBERS)
                if (!NUMBERS.contains(NUMBER))
                    return false;
            return true;
        } else
            return false;
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

    private static void removeNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.clear();
        NUMBERS.add(1);
        NUMBERS.add(0);
        NUMBERS.add(2);
    }
}