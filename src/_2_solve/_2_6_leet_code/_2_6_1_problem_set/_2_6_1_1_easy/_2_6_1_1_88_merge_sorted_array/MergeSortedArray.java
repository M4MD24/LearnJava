package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_88_merge_sorted_array;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <br/>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <br/>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * </h2>
 */

public class MergeSortedArray {
    public static void main(final String[] ARGUMENTS) {
        final int[] FIRST_NUMBERS = {1, 2, 3, 0, 0, 0},
                SECOND_NUMBERS = {2, 5, 6};
        final int FIRST_LENGTH = 3,
                SECOND_LENGTH = 3;
        mergeSortedArray(FIRST_NUMBERS, FIRST_LENGTH, SECOND_NUMBERS, SECOND_LENGTH);
        System.out.print(Arrays.toString(FIRST_NUMBERS));
    }

    private static void mergeSortedArray(final int[] FIRST_NUMBERS, int firstNumbersLength, final int[] SECOND_NUMBERS, int secondNumbersLength) {
        int afterMergeNumbersLengthIndices = firstNumbersLength + secondNumbersLength - 1;
        while (secondNumbersLength > 0) {
            FIRST_NUMBERS[afterMergeNumbersLengthIndices--] = (firstNumbersLength > 0 && FIRST_NUMBERS[firstNumbersLength - 1] > SECOND_NUMBERS[secondNumbersLength - 1])
                    ? FIRST_NUMBERS[--firstNumbersLength]
                    : SECOND_NUMBERS[--secondNumbersLength];
        }
    }
}