package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_162_find_peak_element;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A peak element is an element that is strictly greater than its neighbors.
 * <br/>
 * <br/>
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * <br/>
 * <br/>
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 * <br/>
 * <br/>
 * You must write an algorithm that runs in O(log n) time.
 * </h2>
 */

public class FindPeakElement {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 1, 3, 5, 6, 4};
        System.out.print(findPeakElement(NUMBERS));
    }

    private static int findPeakElement(final int[] ARRAY) {
        System.gc();
        int left = 0,
                right = ARRAY.length - 1;
        while (left < right) {
            final int MIDDLE = left + (right - left) / 2;
            if (ARRAY[MIDDLE] > ARRAY[MIDDLE + 1])
                right = MIDDLE;
            else
                left = MIDDLE + 1;
        }
        return left;
    }
}