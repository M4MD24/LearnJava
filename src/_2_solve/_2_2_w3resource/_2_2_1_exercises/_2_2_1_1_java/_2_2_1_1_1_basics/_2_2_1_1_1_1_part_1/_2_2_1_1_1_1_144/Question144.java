package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_144;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove all occurrences of a specified value in a given originalArray of integers. Return the updated originalArray length.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original originalArray: [1, 4, 6, 7, 6, 2]
 * <br/>
 * The length of the new originalArray is: 4
 * </h2>
 */

public class Question144 {
    public static void main(final String[] ARGUMENTS) {
        final int[] ORIGINAL_ARRAY = {1, 4, 6, 7, 6, 2};
        int targetValue = 6,
                newLength = removeOccurrences(ORIGINAL_ARRAY, targetValue);

        System.out.println("Original array: " + Arrays.toString(ORIGINAL_ARRAY));
        System.out.println("The length of the new array is: " + newLength);
    }

    private static int removeOccurrences(int[] originalArray, int targetValue) {
        int newLength = originalArray.length;
        for (int value: originalArray)
            if (value == targetValue) newLength--;
        return newLength;
    }
}