package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_1829_maximum_xor_for_each_query;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>You are given a sorted array nums of n non-negative integers and an integer maximumBit. You want to perform the following query n times:</h2>
 * <br/>
 * <br/>
 * <ol>
 *     <li>Find a non-negative integer k < 2maximumBit such that nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k is maximized. k is the answer to the ith query.</li>
 *     <li>Remove the last element from the current array nums.</li>
 * </ol>
 * <br/>
 * <br/>
 * <h2>Return an array answer, where answer[i] is the answer to the ith query.</h2>
 */

public class MaximumXORForEachQuery {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(Arrays.toString(getMaximumXor(
                new int[]{2, 3, 4, 7},
                3
        )));
    }

    private static int[] getMaximumXor(final int[] NUMBERS, final int MAXIMUM_BIT) {
        int cumulativeXor = 0;
        final int MAXIMUM_VALUE_WITH_MAXIMUM_BIT_LIMIT = (1 << MAXIMUM_BIT) - 1;
        final int[] XOR_RESULTS = new int[NUMBERS.length];
        for (final int CURRENT_NUMBER : NUMBERS)
            cumulativeXor ^= CURRENT_NUMBER;
        for (int index = 0; index < NUMBERS.length; index++) {
            XOR_RESULTS[index] = cumulativeXor ^ MAXIMUM_VALUE_WITH_MAXIMUM_BIT_LIMIT;
            cumulativeXor ^= NUMBERS[NUMBERS.length - 1 - index];
        }
        return XOR_RESULTS;
    }
}