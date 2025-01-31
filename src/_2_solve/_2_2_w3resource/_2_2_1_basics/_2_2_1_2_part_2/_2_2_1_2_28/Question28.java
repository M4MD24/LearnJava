package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_28;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the longest increasing continuous subsequence in a given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3]
 * <br/>
 * Size of longest increasing continuous subsequence: 5
 * </h2>
 */

public class Question28 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};
        System.out.printf("Original array: %s\n", Arrays.toString(NUMBERS));
        System.out.printf("Size of longest increasing continuous subsequence: %d", getLongestIncreasingContinuousSubSequence(NUMBERS));
    }

    private static int getLongestIncreasingContinuousSubSequence(final int[] NUMBERS) {
        int longestIncreasingContinuousSubSequence = 0, currentIncreasingContinuousSubSequence = 1;
        for (int firstIndex = 0, secondIndex = 1; secondIndex < NUMBERS.length; firstIndex++, secondIndex++) {
            if (NUMBERS[firstIndex] == NUMBERS[secondIndex] - 1) currentIncreasingContinuousSubSequence++;
            else {
                if (currentIncreasingContinuousSubSequence > longestIncreasingContinuousSubSequence) longestIncreasingContinuousSubSequence = currentIncreasingContinuousSubSequence;
                currentIncreasingContinuousSubSequence = 1;
            }
        }
        return longestIncreasingContinuousSubSequence;
    }
}