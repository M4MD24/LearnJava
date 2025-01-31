package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_1574_shortest_subarray_to_be_removed_to_make_array_sorted;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining elements in arr are non-decreasing.
 * <br/>
 * <br/>
 * Return the length of the shortest subarray to remove.
 * <br/>
 * <br/>
 * A subarray is a contiguous subsequence of the array.
 * </h2>
 */

public class ShortestSubarrayToBeRemovedToMakeArraySorted {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(findLengthOfShortestSubarray(new int[]{1, 2, 3, 10, 4, 2, 3, 5}));
    }

    private static int findLengthOfShortestSubarray(final int[] NUMBERS) {
        final int COUNT_OF_NUMBERS = NUMBERS.length;
        int left = 0,
                right = COUNT_OF_NUMBERS - 1;
        while (left < COUNT_OF_NUMBERS - 1 && NUMBERS[left] <= NUMBERS[left + 1]) left++;
        if (left == COUNT_OF_NUMBERS - 1) {
            System.gc();
            return 0;
        } else {
            while (right > 0 && NUMBERS[right - 1] <= NUMBERS[right]) right--;
            int minimumToRemove = Math.min(COUNT_OF_NUMBERS - left - 1, right);
            int prefix = 0, suffix = right;
            while (prefix <= left && suffix < COUNT_OF_NUMBERS)
                if (NUMBERS[prefix] <= NUMBERS[suffix])
                    minimumToRemove = Math.min(minimumToRemove, suffix - prefix++ - 1);
                else
                    suffix++;
            return minimumToRemove;
        }
    }
}