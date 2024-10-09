package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_9;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to insert an element (specific position) into an array.</h2>
 */

public class Question9 {
    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(final String[] PARAMETERS) {
        final int TARGET_NUMBER = 0,
                TARGET_POSITION = 2;
        System.out.println("Before Insert: " + Arrays.toString(numbers));
        insertTargetNumberInTargetPosition(TARGET_POSITION, TARGET_NUMBER);
        System.out.print("After Insert: " + Arrays.toString(numbers));
    }

    private static void insertTargetNumberInTargetPosition(final int TARGET_POSITION, final int TARGET_NUMBER) {
        final int[] NEW_NUMBERS = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, NEW_NUMBERS, 0, numbers.length);
        NEW_NUMBERS[TARGET_POSITION] = TARGET_NUMBER;
        System.arraycopy(numbers, TARGET_POSITION, NEW_NUMBERS, TARGET_POSITION + 1, numbers.length - TARGET_POSITION);
        numbers = NEW_NUMBERS;
    }
}