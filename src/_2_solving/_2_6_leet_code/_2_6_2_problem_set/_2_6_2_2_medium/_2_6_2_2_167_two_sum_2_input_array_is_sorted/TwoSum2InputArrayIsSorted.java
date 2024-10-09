package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_167_two_sum_2_input_array_is_sorted;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <br/>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <br/>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * <br/>
 * Your solution must use only constant extra space.
 * </h2>
 */

public class TwoSum2InputArrayIsSorted {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {2, 7, 11, 15};
        final int TARGET_NUMBER = 9;
        System.out.print(Arrays.toString(twoSum(NUMBERS, TARGET_NUMBER)));
    }

    private static int[] twoSum(final int[] NUMBERS, final int TARGET_NUMBER) {
        int leftPosition = 0,
                rightPosition = NUMBERS.length - 1;
        while (NUMBERS[leftPosition] + NUMBERS[rightPosition] != TARGET_NUMBER)
            if (NUMBERS[leftPosition] + NUMBERS[rightPosition] < TARGET_NUMBER)
                leftPosition++;
            else
                rightPosition--;
        return new int[]{++leftPosition, ++rightPosition};
    }
}