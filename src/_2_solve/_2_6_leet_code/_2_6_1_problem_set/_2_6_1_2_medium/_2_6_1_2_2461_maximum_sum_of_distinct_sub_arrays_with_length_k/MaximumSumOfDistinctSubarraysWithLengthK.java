package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2461_maximum_sum_of_distinct_sub_arrays_with_length_k;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
 * <br/>
 * <br/>
 * • The length of the subarray is k, and
 * <br/>
 * <br/>
 * • All the elements of the subarray are distinct.
 * <br/>
 * <br/>
 * Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
 * <br/>
 * <br/>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * </h2>
 */

public class MaximumSumOfDistinctSubarraysWithLengthK {
    public static void main(final String[] PARAMETERS) {
        System.out.print(maximumSubarraySum(
                new int[]{1, 5, 4, 2, 9, 9, 9},
                3
        ));
    }

    private static long maximumSubarraySum(final int[] NUMBERS, final int TARGET_NUMBER) {
        System.gc();
        int maximumNumber = 0;
        for (final int NUMBER : NUMBERS)
            maximumNumber = Math.max(maximumNumber, NUMBER);
        final int[] COUNTS = new int[maximumNumber + 1];
        int duplicatesCount = 0;
        long maximumSum = 0,
                currentSum = 0;
        for (int index = 0; index < TARGET_NUMBER; index++) {
            if (COUNTS[NUMBERS[index]] >= 1)
                duplicatesCount++;
            COUNTS[NUMBERS[index]]++;
            currentSum += NUMBERS[index];
        }
        if (duplicatesCount == 0)
            maximumSum = currentSum;
        for (int index = TARGET_NUMBER; index < NUMBERS.length; index++) {
            if (COUNTS[NUMBERS[index]] >= 1)
                duplicatesCount++;
            COUNTS[NUMBERS[index]]++;
            currentSum += NUMBERS[index];
            if (COUNTS[NUMBERS[index - TARGET_NUMBER]] > 1)
                duplicatesCount--;
            COUNTS[NUMBERS[index - TARGET_NUMBER]]--;
            currentSum -= NUMBERS[index - TARGET_NUMBER];
            if (duplicatesCount == 0)
                maximumSum = Math.max(maximumSum, currentSum);
        }
        return maximumSum;
    }

// >
    /*private static long maximumSubarraySum(final int[] NUMBERS, final int TARGET_NUMBER) {
        final int COUNT_OF_NUMBERS = NUMBERS.length;
        if (COUNT_OF_NUMBERS < TARGET_NUMBER)
            return 0;
        else {
            System.gc();
            long maximumSum = 0,
                    currentSum = 0;
            final HashSet<Integer> SUB_ARRAY = new java.util.HashSet<>();
            for (int left = 0, right = 0; right < COUNT_OF_NUMBERS; right++) {
                while (SUB_ARRAY.contains(NUMBERS[right])) {
                    SUB_ARRAY.remove(NUMBERS[left]);
                    currentSum -= NUMBERS[left++];
                }
                SUB_ARRAY.add(NUMBERS[right]);
                currentSum += NUMBERS[right];
                if (right - left + 1 == TARGET_NUMBER) {
                    maximumSum = Math.max(maximumSum, currentSum);
                    SUB_ARRAY.remove(NUMBERS[left]);
                    currentSum -= NUMBERS[left++];
                }
            }
            return maximumSum;
        }
    }*/
}