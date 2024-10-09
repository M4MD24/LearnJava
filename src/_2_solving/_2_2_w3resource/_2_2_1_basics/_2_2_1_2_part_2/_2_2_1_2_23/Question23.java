package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_23;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the median of the numbers inside the window (size k) at each step in a given array of integers with duplicate numbers. Move the window to the array start.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [1, 2, 3, 4, 5, 6, 7, 8, 8]
 * <br/>
 * <br/>
 * Value of k: 3
 * <br/>
 * <br/>
 * Result:
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 4
 * <br/>
 * 5
 * <br/>
 * 6
 * <br/>
 * 7
 * <br/>
 * 8
 * </h2>
 */

public class Question23 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8};
        final int NUMBERS_REQUIRED_TO_BE_COMPILED = 3;
        System.out.printf("Original array: %s\n\n", Arrays.toString(NUMBERS));
        System.out.printf("Value of k: %d\n\n", NUMBERS_REQUIRED_TO_BE_COMPILED);
        mediansPrint(NUMBERS, NUMBERS_REQUIRED_TO_BE_COMPILED);
    }

    private static void mediansPrint(final int[] NUMBERS, final int NUMBERS_REQUIRED_TO_BE_COMPILED) {
        for (int index = NUMBERS_REQUIRED_TO_BE_COMPILED / 2; index < NUMBERS.length - NUMBERS_REQUIRED_TO_BE_COMPILED / 2; index++)
            System.out.println(NUMBERS[index]);
    }
}