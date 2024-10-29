package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_300_longest_increasing_subsequence;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer array nums, return the length of the longest strictly increasing subsequence.</h2>
 */

public class LongestIncreasingSubsequence {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.print(lengthOfLIS(NUMBERS));
    }

    private static int lengthOfLIS(final int[] NUMBERS) {
        final int LENGTH_OF_NUMBERS = NUMBERS.length;
        final int[] LONGEST_SUB_SEQUENCE_LENGTHS = new int[LENGTH_OF_NUMBERS];
        int maximumLength = 0;
        for (int currentIndex = 0; currentIndex < LENGTH_OF_NUMBERS; currentIndex++) {
            LONGEST_SUB_SEQUENCE_LENGTHS[currentIndex] = 1;
            for (int previousIndex = 0; previousIndex < currentIndex; previousIndex++)
                if (NUMBERS[currentIndex] > NUMBERS[previousIndex])
                    LONGEST_SUB_SEQUENCE_LENGTHS[currentIndex] = Math.max(
                            LONGEST_SUB_SEQUENCE_LENGTHS[currentIndex],
                            LONGEST_SUB_SEQUENCE_LENGTHS[previousIndex] + 1
                    );
            maximumLength = Math.max(maximumLength, LONGEST_SUB_SEQUENCE_LENGTHS[currentIndex]);
        }
        return maximumLength;
    }
}