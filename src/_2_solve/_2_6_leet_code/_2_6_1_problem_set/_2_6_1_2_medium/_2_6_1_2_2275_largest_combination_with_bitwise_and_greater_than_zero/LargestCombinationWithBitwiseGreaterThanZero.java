package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2275_largest_combination_with_bitwise_and_greater_than_zero;

/**
 * <h1>Problem:</h1>
 * <h2>
 * The bitwise AND of an array nums is the bitwise AND of all integers in nums.
 * <br/>
 * <br/>
 * • For example, for nums = [1, 5, 3], the bitwise AND is equal to 1 & 5 & 3 = 1.
 * <br/>
 * • Also, for nums = [7], the bitwise AND is 7.
 * <br/>
 * <br/>
 * You are given an array of positive integers candidates. Evaluate the bitwise AND of every combination of numbers of candidates. Each number in candidates may only be used once in each combination.
 * <br/>
 * <br/>
 * Return the size of the largest combination of candidates with a bitwise AND greater than 0.
 * </h2>
 */

public class LargestCombinationWithBitwiseGreaterThanZero {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}));
    }

    private static int largestCombination(final int[] CANDIDATES) {
        final int[] BIT_COUNTS = new int[32];
        for (final int CANDIDATE : CANDIDATES)
            updateBitCounts(CANDIDATE, BIT_COUNTS);
        int maximumCombination = 0;
        for (int bitIndex = 0; bitIndex < 32; bitIndex++)
            maximumCombination = Math.max(maximumCombination, BIT_COUNTS[bitIndex]);
        return maximumCombination;
    }

    public static void updateBitCounts(int number, final int[] BIT_COUNTS) {
        int bitPosition = 31;
        while (number > 0) {
            BIT_COUNTS[bitPosition] += (number & 1);
            number >>= 1;
            bitPosition--;
        }
    }
}