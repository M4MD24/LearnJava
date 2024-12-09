package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_53_maximum_sub_array;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer array nums, find the subarray with the largest sum, and return its sum.</h2>
 */

public class MaximumSubArray {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 4, -1, 7, 8};
        System.out.print(maxSubArray(NUMBERS));
    }

    private static int maxSubArray(final int[] NUMBERS) {
        int maximumSum = NUMBERS[0],
                currentSum = 0;
        for (final int NUMBER : NUMBERS) {
            currentSum += NUMBER;
            maximumSum = Math.max(currentSum, maximumSum);
            if (currentSum < 0)
                currentSum = 0;
        }
        return maximumSum;
    }
}