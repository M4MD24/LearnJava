package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_178_question_178;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the longest increasing continuous subsequence in a given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3]
 * <br/>
 * Size of longest increasing continuous subsequence: 5
 * </h2>
 */

public class Question178 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};
        System.out.println(STR."Original array: \{Arrays.toString(NUMBERS)}");
        System.out.println(STR."Size of longest increasing continuous subsequence: \{getLongestIncreasingContinuousSubSequence(NUMBERS)}");
    }

    private static int getLongestIncreasingContinuousSubSequence(final int[] NUMBERS) {
        int longestIncreasingContinuousSubSequence = 0, currentIncreasingContinuousSubSequence = 1;
        for (int firstIndex = 0, secondIndex = 1; secondIndex < NUMBERS.length; firstIndex++, secondIndex++) {
            if (NUMBERS[firstIndex] == NUMBERS[secondIndex] - 1) currentIncreasingContinuousSubSequence++;
            else {
                if (currentIncreasingContinuousSubSequence > longestIncreasingContinuousSubSequence) longestIncreasingContinuousSubSequence = currentIncreasingContinuousSubSequence;
                currentIncreasingContinuousSubSequence=1;
            }
        }
        return longestIncreasingContinuousSubSequence;
    }
}