package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_51;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to divide a given array of integers into given k non-empty subsets whose sums are all equal. Return true if all sums are equal otherwise return false.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [1, 3, 3, 5, 6, 6]
 * <br/>
 * Target of subsets: 4
 * <br/>
 * Is sum equals: true
 * </h2>
 */

public class Question51 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 3, 2, 4, 5, 5};
        final int TARGET_NUMBER_OF_SUBSETS = 4;
        System.out.printf("Original array: %s\n", Arrays.toString(NUMBERS));
        System.out.printf("target of subsets: %d\n", TARGET_NUMBER_OF_SUBSETS);
        System.out.printf("Are all sums equals: %b", areAllSumsEquals(NUMBERS, TARGET_NUMBER_OF_SUBSETS));
    }

    private static boolean areAllSumsEquals(final int[] NUMBERS, final int TARGET_NUMBER_OF_SUBSETS) {
        int sum = 0;
        for (final int NUMBER : NUMBERS)
            sum += NUMBER;
        final int INTEGER_NUMBER = sum / TARGET_NUMBER_OF_SUBSETS;
        final double DOUBLE_NUMBER = (double) sum / TARGET_NUMBER_OF_SUBSETS;
        return INTEGER_NUMBER == DOUBLE_NUMBER;
    }
}