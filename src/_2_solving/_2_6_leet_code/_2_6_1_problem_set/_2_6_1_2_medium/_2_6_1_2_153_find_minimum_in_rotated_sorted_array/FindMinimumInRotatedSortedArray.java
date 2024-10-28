package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_153_find_minimum_in_rotated_sorted_array;

/**
 * <h1>Problem:</h1>
 * <h2>Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:</h2>
 * <br/>
 * <br/>
 * <ul>
 *     <li>[4,5,6,7,0,1,2] if it was rotated 4 times.</li>
 *     <li>[0,1,2,4,5,6,7] if it was rotated 7 times.</li>
 * </ul>
 * <br/>
 * <br/>
 * <h2>
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <br/>
 * <br/>
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * <br/>
 * <br/>
 * You must write an algorithm that runs in O(log n) time.
 * </h2>
 */

public class FindMinimumInRotatedSortedArray {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {3, 4, 5, 1, 2};
        System.out.print(findMin(NUMBERS));
    }

    private static int findMin(final int[] NUMBERS) {
        int start = 0, end = NUMBERS.length - 1;
        while (start < end) {
            final int MIDDLE = start + (end - start) / 2;
            if (NUMBERS[MIDDLE] > NUMBERS[end])
                start = MIDDLE + 1;
            else
                end = MIDDLE;
        }
        return NUMBERS[start];
    }
}