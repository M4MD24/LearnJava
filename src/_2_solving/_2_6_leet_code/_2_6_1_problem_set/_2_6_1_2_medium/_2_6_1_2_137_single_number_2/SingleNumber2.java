package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_137_single_number_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
 * <br/>
 * <br/>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * </h2>
 */

public class SingleNumber2 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {2, 2, 3, 2};
        System.out.print(singleNumber(NUMBERS));
    }

    private static int singleNumber(final int[] NUMBERS) {
        System.gc();
        int bitCountForOnes = 0,
                bitCountForTwos = 0;
        for (final int NUMBER : NUMBERS) {
            bitCountForOnes ^= NUMBER & ~bitCountForTwos;
            bitCountForTwos ^= NUMBER & ~bitCountForOnes;
        }
        return bitCountForOnes;
    }

// >
    /*private static int singleNumber(final int[] NUMBERS) {
        int bitCountForOnes = 0,
                bitCountForTwos = 0;
        for (final int NUMBER : NUMBERS) {
            bitCountForTwos |= bitCountForOnes & NUMBER;
            bitCountForOnes ^= NUMBER;
            final int BIT_COUNT_FOR_THREES = bitCountForOnes & bitCountForTwos;
            bitCountForOnes &= ~BIT_COUNT_FOR_THREES;
            bitCountForTwos &= ~BIT_COUNT_FOR_THREES;
        }
        return bitCountForOnes;
    }*/
}