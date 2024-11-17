package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_3097_shortest_subarray_with_or_at_least_k_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array nums of non-negative integers and an integer k.
 * <br/>
 * <br/>
 * An array is called special if the bitwise OR of all of its elements is at least k.
 * <br/>
 * <br/>
 * Return the length of the shortest special non-empty subarray of nums, or return -1 if no special subarray exists.
 * </h2>
 */

public class ShortestSubarrayWithORAtLeastK2 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minimumSubarrayLength(
                new int[]{2, 1, 8},
                10
        ));
    }

    private static int minimumSubarrayLength(final int[] NUMBERS, final int TARGET_NUMBER) {
        final int COUNT_OF_NUMBERS = NUMBERS.length;
        final int[] BIT_COUNT = new int[32];
        int minimumSubarrayLength = COUNT_OF_NUMBERS + 1;
        for (int leftPointer = 0, currentOrValue = 0, rightPointer = 0; rightPointer < COUNT_OF_NUMBERS; ++rightPointer) {
            currentOrValue |= NUMBERS[rightPointer];
            for (int bitPosition = 0; bitPosition < 32; ++bitPosition)
                if ((NUMBERS[rightPointer] >> bitPosition & 1) == 1)
                    ++BIT_COUNT[bitPosition];
            while (currentOrValue >= TARGET_NUMBER && leftPointer <= rightPointer) {
                minimumSubarrayLength = Math.min(minimumSubarrayLength, rightPointer - leftPointer + 1);
                for (int bitPosition = 0; bitPosition < 32; ++bitPosition)
                    if ((NUMBERS[leftPointer] >> bitPosition & 1) == 1)
                        if (--BIT_COUNT[bitPosition] == 0)
                            currentOrValue ^= 1 << bitPosition;
                ++leftPointer;
            }
        }
        return minimumSubarrayLength > COUNT_OF_NUMBERS
                ? -1
                : minimumSubarrayLength;
    }
}