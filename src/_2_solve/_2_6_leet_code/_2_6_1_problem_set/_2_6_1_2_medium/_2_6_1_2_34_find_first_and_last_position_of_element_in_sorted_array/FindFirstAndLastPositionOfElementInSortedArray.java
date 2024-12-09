package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_34_find_first_and_last_position_of_element_in_sorted_array;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * <br/>
 * <br/>
 * If target is not found in the array, return [-1, -1].
 * <br/>
 * <br/>
 * You must write an algorithm with O(log n) runtime complexity.
 * </h2>
 */

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 7, 7, 8, 8, 10};
        final int TARGET_NUMBER = 8;
        System.out.print(Arrays.toString(searchRange(NUMBERS, TARGET_NUMBER)));
    }

    private static int[] searchRange(final int[] NUMBERS, final int TARGET_NUMBER) {
        final int[] START_AND_LAST_INDICES = {-1, -1};
        START_AND_LAST_INDICES[0] = findFirstPosition(NUMBERS, TARGET_NUMBER);
        if (START_AND_LAST_INDICES[0] != -1)
            START_AND_LAST_INDICES[1] = findLastPosition(NUMBERS, TARGET_NUMBER);
        return START_AND_LAST_INDICES;
    }

    private static int findFirstPosition(final int[] NUMBERS, final int TARGET_NUMBER) {
        int left = 0, right = NUMBERS.length - 1;
        int targetIndex = -1;
        while (left <= right) {
            final int MIDDLE = left + (right - left) / 2;
            if (NUMBERS[MIDDLE] == TARGET_NUMBER) {
                targetIndex = MIDDLE;
                right = MIDDLE - 1;
            } else if (NUMBERS[MIDDLE] < TARGET_NUMBER)
                left = MIDDLE + 1;
            else
                right = MIDDLE - 1;
        }
        return targetIndex;
    }

    private static int findLastPosition(final int[] NUMBERS, final int TARGET_NUMBER) {
        int left = 0, right = NUMBERS.length - 1;
        int targetIndex = -1;
        while (left <= right) {
            final int MIDDLE = left + (right - left) / 2;
            if (NUMBERS[MIDDLE] == TARGET_NUMBER) {
                targetIndex = MIDDLE;
                left = MIDDLE + 1;
            } else if (NUMBERS[MIDDLE] < TARGET_NUMBER)
                left = MIDDLE + 1;
            else
                right = MIDDLE - 1;
        }
        return targetIndex;
    }
}