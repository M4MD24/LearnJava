package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_1_two_sum;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <br/>
 * <br/>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <br/>
 * <br/>
 * You can return the answer in any order.
 * </h2>
 */

public class TwoSum {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {2, 7, 11, 15};
        final int TARGET = 9;
        System.out.print(Arrays.toString(twoSum(NUMBERS, TARGET)));
    }

    private static int[] twoSum(final int[] NUMBERS, final int TARGET) {
        for (int firstNumberIndex = 1; firstNumberIndex < NUMBERS.length; firstNumberIndex++)
            for (int secondNumberIndex = firstNumberIndex; secondNumberIndex < NUMBERS.length; secondNumberIndex++)
                if (NUMBERS[secondNumberIndex - firstNumberIndex] + NUMBERS[secondNumberIndex] == TARGET)
                    return new int[]{secondNumberIndex - firstNumberIndex, secondNumberIndex};
        return null;
    }
}