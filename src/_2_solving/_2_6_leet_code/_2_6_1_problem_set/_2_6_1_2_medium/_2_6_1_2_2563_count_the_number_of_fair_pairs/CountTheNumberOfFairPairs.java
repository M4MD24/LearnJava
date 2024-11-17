package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2563_count_the_number_of_fair_pairs;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a 0-indexed integer array nums of size n and two integers lower and upper, return the number of fair pairs.
 * <br/>
 * <br/>
 * A pair (i, j) is fair if:
 * <br/>
 * <br/>
 * • 0 <= i < j < n, and
 * <br/>
 * • lower <= nums[i] + nums[j] <= upper
 * </h2>
 */

public class CountTheNumberOfFairPairs {
    public static void main(final String[] PARAMETERS) {
        System.out.print(countFairPairs(
                new int[]{0, 1, 7, 4, 4, 5},
                3,
                6
        ));
    }

    private static long countFairPairs(final int[] NUMBERS, final int LOWER, final int UPPER) {
        Arrays.sort(NUMBERS);
        return findLessThanEqualTo(NUMBERS, UPPER) - findLessThanEqualTo(NUMBERS, LOWER - 1);
    }

    private static long findLessThanEqualTo(final int[] NUMBERS, final int TARGET_SUM) {
        long pairs = 0;
        int left = 0, right = NUMBERS.length - 1;
        while (left < right)
            if (NUMBERS[left] + NUMBERS[right] <= TARGET_SUM) {
                pairs += (right - left);
                left++;
            } else
                right--;
        return pairs;
    }
}