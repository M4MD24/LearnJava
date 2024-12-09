package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_33_search_in_rotated_sorted_array;

/**
 * <h1>Problem:</h1>
 * <h2>
 * There is an integer array nums sorted in ascending order (with distinct values).
 * <br/>
 * <br/>
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * <br/>
 * <br/>
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * <br/>
 * <br/>
 * You must write an algorithm with O(log n) runtime complexity.
 * </h2>
 */

public class SearchInRotatedSortedArray {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {4, 5, 6, 7, 0, 1, 2};
        final int TARGET_NUMBER = 0;
        System.out.print(search(NUMBERS, TARGET_NUMBER));
    }

    private static int search(final int[] ARRAY, final int TARGET) {
        int startIndex = 0,
                endIndex = ARRAY.length - 1;
        while (startIndex <= endIndex) {
            final int MIDDLE_INDEX = (startIndex + endIndex) / 2;
            if (ARRAY[MIDDLE_INDEX] == TARGET)
                return MIDDLE_INDEX;
            else {
                if (ARRAY[startIndex] <= ARRAY[MIDDLE_INDEX])
                    if (TARGET >= ARRAY[startIndex] && TARGET < ARRAY[MIDDLE_INDEX])
                        endIndex = MIDDLE_INDEX - 1;
                    else
                        startIndex = MIDDLE_INDEX + 1;
                else {
                    if (TARGET > ARRAY[MIDDLE_INDEX] && TARGET <= ARRAY[endIndex])
                        startIndex = MIDDLE_INDEX + 1;
                    else
                        endIndex = MIDDLE_INDEX - 1;
                }
            }
        }
        return -1;
    }
}