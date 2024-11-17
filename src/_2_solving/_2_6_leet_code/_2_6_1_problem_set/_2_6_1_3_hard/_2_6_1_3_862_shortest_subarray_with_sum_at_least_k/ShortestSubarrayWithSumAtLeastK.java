package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_862_shortest_subarray_with_sum_at_least_k;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with a sum of at least k. If there is no such subarray, return -1.
 * <br/>
 * <br/>
 * A subarray is a contiguous part of an array.
 * </h2>
 */

public class ShortestSubarrayWithSumAtLeastK {
    public static void main(final String[] PARAMETERS) {
        System.out.print(shortestSubarray(new int[]{1, 2}, 4));
    }

    private static int shortestSubarray(final int[] NUMBERS, final int TARGET_NUMBER) {
        final int COUNT_OF_NUMBERS = NUMBERS.length;
        final long[] PREFIX_SUM = new long[COUNT_OF_NUMBERS + 1];
        for (int index = 0; index < COUNT_OF_NUMBERS; index++)
            PREFIX_SUM[index + 1] = PREFIX_SUM[index] + NUMBERS[index];
        var shortestLength = getShortestLength(TARGET_NUMBER, COUNT_OF_NUMBERS, PREFIX_SUM);
        return shortestLength == Integer.MAX_VALUE
                ? -1
                : shortestLength;
    }

    private static int getShortestLength(final int TARGET_NUMBER, final int COUNT_OF_NUMBERS, final long[] PREFIX_SUM) {
        int shortestLength = Integer.MAX_VALUE;
        final Deque<Integer> ELEMENTS = new LinkedList<>();
        for (int index = 0; index <= COUNT_OF_NUMBERS; index++) {
            while (!ELEMENTS.isEmpty() && PREFIX_SUM[index] - PREFIX_SUM[ELEMENTS.peekFirst()] >= TARGET_NUMBER)
                shortestLength = Math.min(shortestLength, index - ELEMENTS.pollFirst());
            while (!ELEMENTS.isEmpty() && PREFIX_SUM[index] <= PREFIX_SUM[ELEMENTS.peekLast()])
                ELEMENTS.pollLast();
            ELEMENTS.addLast(index);
        }
        return shortestLength;
    }
}