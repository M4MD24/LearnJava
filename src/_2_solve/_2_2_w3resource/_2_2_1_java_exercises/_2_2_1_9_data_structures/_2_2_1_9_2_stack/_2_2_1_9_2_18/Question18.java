package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_2_stack._2_2_1_9_2_18;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to merge two stacks into one.</h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> FIRST_NUMBERS = new Stack<>(),
                SECOND_NUMBERS = new Stack<>();
        addNumbers(FIRST_NUMBERS);
        addNumbers(SECOND_NUMBERS);
        System.out.printf(
                """
                        First Numbers: %s
                        Second Numbers: %s
                        Numbers After Merging: %s""",
                FIRST_NUMBERS,
                SECOND_NUMBERS,
                numbersAfterMergeNumbers(FIRST_NUMBERS, SECOND_NUMBERS));
    }

    private static Stack<Integer> numbersAfterMergeNumbers(final Stack<Integer> FIRST_NUMBERS, final Stack<Integer> SECOND_NUMBERS) {
        final Stack<Integer> NUMBERS_AFTER_MERGE_NUMBERS = new Stack<>();
        NUMBERS_AFTER_MERGE_NUMBERS.addAll(FIRST_NUMBERS);
        NUMBERS_AFTER_MERGE_NUMBERS.addAll(SECOND_NUMBERS);
        return NUMBERS_AFTER_MERGE_NUMBERS;
    }


    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(6);
        NUMBERS.push(2);
        NUMBERS.push(3);
        NUMBERS.push(4);
        NUMBERS.push(5);
        NUMBERS.push(1);
    }
}