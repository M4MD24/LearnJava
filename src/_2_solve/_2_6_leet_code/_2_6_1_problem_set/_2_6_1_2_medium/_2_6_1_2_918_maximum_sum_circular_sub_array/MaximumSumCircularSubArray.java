package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_918_maximum_sum_circular_sub_array;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
 * <br/>
 * <br/>
 * A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
 * <br/>
 * <br/>
 * A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
 * </h2>
 */

public class MaximumSumCircularSubArray {
    public static void main(final String[] PARAMETERS) {
        System.out.print(maxSubarraySumCircular(new int[]{-3, -2, -3}));
    }

    private static int maximumSum;

    private static int maxSubarraySumCircular(final int[] NUMBERS) {
        System.gc();
        final int CURRENT_MAXIMUM = count(NUMBERS, true),
                CURRENT_MINIMUM = count(NUMBERS, false);
        return CURRENT_MAXIMUM > 0
                ? Math.max(CURRENT_MAXIMUM, maximumSum - CURRENT_MINIMUM)
                : CURRENT_MAXIMUM;
    }

    private static int count(final int[] NUMBERS, final boolean MAXIMUM_MODE) {
        maximumSum = 0;
        int currentMaximumValue = 0;
        int currentMaximumSum = NUMBERS[0];
        for (final int NUMBER : NUMBERS) {
            maximumSum += NUMBER;
            if (MAXIMUM_MODE) {
                currentMaximumValue = Math.max(currentMaximumValue + NUMBER, NUMBER);
                currentMaximumSum = Math.max(currentMaximumSum, currentMaximumValue);
            } else {
                currentMaximumValue = Math.min(currentMaximumValue + NUMBER, NUMBER);
                currentMaximumSum = Math.min(currentMaximumSum, currentMaximumValue);
            }
        }
        return currentMaximumSum;
    }
}