package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_81;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [20, 30, 40]
 * <br/>
 * <br/>
 * Swapping the first and last elements:
 * <br/>
 * with new array: [40, 30, 20]
 * <br/>
 * with temporary variable: [40, 30, 20]
 * <br/>
 * without new array and temporary variable: [40, 30, 20]
 * </h2>
 */

public class Question81 {
    public static void main(final String[] ARGS) {
        int[] ORIGINAL_ARRAY = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(ORIGINAL_ARRAY));
        System.out.println("\nSwapping the first and last elements:");

        swapFirstAndLastElementOfArrayWithNewArray(ORIGINAL_ARRAY);

        swapFirstAndLastElementOfArrayWithTemporary(ORIGINAL_ARRAY);

        ORIGINAL_ARRAY = new int[]{20, 30, 40};
        swapFirstAndLastElementOfArrayWithoutTemporary(ORIGINAL_ARRAY);
    }

    private static void swapFirstAndLastElementOfArrayWithNewArray(final int[] ORIGINAL_ARRAY) {
        final int[] NEW_ARRAY = ORIGINAL_ARRAY.clone();
        NEW_ARRAY[0] = ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1];
        NEW_ARRAY[NEW_ARRAY.length - 1] = ORIGINAL_ARRAY[0];
        System.out.println("with new array: " + Arrays.toString(NEW_ARRAY));
    }

    private static void swapFirstAndLastElementOfArrayWithTemporary(final int[] ORIGINAL_ARRAY) {
        int LAST_ELEMENT = ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1];
        ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1] = ORIGINAL_ARRAY[0];
        ORIGINAL_ARRAY[0] = LAST_ELEMENT;
        System.out.println("with temporary variable: " + Arrays.toString(ORIGINAL_ARRAY));
    }

    private static void swapFirstAndLastElementOfArrayWithoutTemporary(final int[] ORIGINAL_ARRAY) {
        ORIGINAL_ARRAY[0] += ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1];
        ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1] = ORIGINAL_ARRAY[0] - ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1];
        ORIGINAL_ARRAY[0] -= ORIGINAL_ARRAY[ORIGINAL_ARRAY.length - 1];
        System.out.println("without new array and temporary variable: " + Arrays.toString(ORIGINAL_ARRAY));
    }
}