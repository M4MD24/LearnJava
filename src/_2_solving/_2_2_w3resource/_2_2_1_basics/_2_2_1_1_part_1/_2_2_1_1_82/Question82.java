package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_82;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length).</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [20, 30, 40, 50, 67]
 * <br/>
 * Largest element between first, last, and middle values: 67
 * </h2>
 */

public class Question82 {
    public static void main(final String[] ARGS) {
        final int[] ORIGINAL_ARRAY = {20, 30, 40, 50, 67};
        System.out.println("Original Array: " + Arrays.toString(ORIGINAL_ARRAY));
        displayLargestElementBetweenFirstAndMiddleAndLastValues(ORIGINAL_ARRAY);
    }

    private static void displayLargestElementBetweenFirstAndMiddleAndLastValues(final int[] ORIGINAL_ARRAY) {
        final int FIRST_VALUE = ORIGINAL_ARRAY[0],
                MIDDLE_VALUE = ORIGINAL_ARRAY[ORIGINAL_ARRAY.length / 2],
                LAST_VALUE = ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1];
        int LARGEST_ELEMENT = FIRST_VALUE;

        if ((MIDDLE_VALUE > FIRST_VALUE && MIDDLE_VALUE > LAST_VALUE) ||
                (MIDDLE_VALUE == FIRST_VALUE && MIDDLE_VALUE > LAST_VALUE) ||
                (MIDDLE_VALUE == LAST_VALUE && MIDDLE_VALUE > FIRST_VALUE)) LARGEST_ELEMENT = MIDDLE_VALUE;
        else if ((LAST_VALUE > FIRST_VALUE && LAST_VALUE > MIDDLE_VALUE) ||
                (LAST_VALUE == FIRST_VALUE && LAST_VALUE > MIDDLE_VALUE) ||
                (LAST_VALUE == MIDDLE_VALUE && LAST_VALUE > FIRST_VALUE)) LARGEST_ELEMENT = LAST_VALUE;

        System.out.print("Largest element between first, last, and middle values: " + LARGEST_ELEMENT);
    }
}