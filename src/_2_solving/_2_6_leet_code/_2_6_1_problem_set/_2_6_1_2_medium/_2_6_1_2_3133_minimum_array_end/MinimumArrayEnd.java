package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_3133_minimum_array_end;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given two integers n and x. You have to construct an array of positive integers nums of size n where for every 0 <= i < n - 1, nums[i + 1] is greater than nums[i], and the result of the bitwise AND operation between all elements of nums is x.
 * <br/>
 * <br/>
 * Return the minimum possible value of nums[n - 1].
 * </h2>
 */

public class MinimumArrayEnd {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minEnd(2, 7));
    }

    private static long minEnd(int countOfNumbers, final int TARGET_VALUE) {
        long minimumNumbersEnd = TARGET_VALUE;
        countOfNumbers--;
        for (long mask = 1; countOfNumbers > 0; mask <<= 1)
            if ((mask & TARGET_VALUE) == 0) {
                minimumNumbersEnd |= (countOfNumbers & 1) * mask;
                countOfNumbers >>= 1;
            }
        return minimumNumbersEnd;
    }

// >
    /*private static long minEnd(final int NUMBER_OF_ELEMENTS, final int TARGET_VALUE) {
        long minimumNumbersEnd = TARGET_VALUE;
        for (int index = 1; index < NUMBER_OF_ELEMENTS; index++)
            minimumNumbersEnd = (minimumNumbersEnd + 1) | TARGET_VALUE;
        return minimumNumbersEnd;
    }*/
}