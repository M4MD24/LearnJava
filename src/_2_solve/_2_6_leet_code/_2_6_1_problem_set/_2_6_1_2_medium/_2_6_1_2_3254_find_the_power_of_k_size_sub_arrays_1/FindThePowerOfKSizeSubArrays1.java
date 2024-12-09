package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_3254_find_the_power_of_k_size_sub_arrays_1;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array of integers nums of length n and a positive integer k.
 * <br/>
 * <br/>
 * The power of an array is defined as:
 * <br/>
 * <br/>
 * • Its maximum element if all of its elements are consecutive and sorted in ascending order.
 * <br/>
 * <br/>
 * • -1 otherwise.
 * <br/>
 * <br/>
 * You need to find the power of all subarrays of nums of size k.
 * <br/>
 * <br/>
 * Return an integer array results of size n - k + 1, where results[i] is the power of nums[i..(i + k - 1)].
 * </h2>
 */

public class FindThePowerOfKSizeSubArrays1 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(Arrays.toString(resultsArray(new int[]{1, 2, 3, 4, 3, 2, 5}, 3)));
    }

    private static int[] resultsArray(final int[] NUMBERS, final int TAREGT_NUMBER) {
        final int COUNT_OF_NUMBERS = NUMBERS.length;
        final int[] SUB_NUMBERS_POWER = new int[COUNT_OF_NUMBERS - TAREGT_NUMBER + 1];
        int inconsecutiveElementCount = 0;
        for (int index = 1; index < TAREGT_NUMBER; index++)
            if (NUMBERS[index] != NUMBERS[index - 1] + 1)
                inconsecutiveElementCount++;
        int start = 0,
                end = TAREGT_NUMBER - 1;
        while (end < COUNT_OF_NUMBERS) {
            SUB_NUMBERS_POWER[start] = inconsecutiveElementCount == 0
                    ? NUMBERS[end]
                    : -1;
            if (start < COUNT_OF_NUMBERS - 1 && NUMBERS[start] != NUMBERS[start + 1] - 1)
                inconsecutiveElementCount--;
            start++;
            if (end < COUNT_OF_NUMBERS - 1 && NUMBERS[end + 1] != NUMBERS[end] + 1)
                inconsecutiveElementCount++;
            end++;
        }
        return SUB_NUMBERS_POWER;
    }
}