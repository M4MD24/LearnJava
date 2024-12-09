package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_2220_minimum_bit_flips_to_convert_number;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.
 * <br/>
 * For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
 * <br/>
 * Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
 * </h2>
 */

public class MinimumBitFlipsToConvertNumber {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minimumBitFlip(10, 7));
    }

    private static int minimumBitFlip(final int START, final int GOAL) {
        return Integer.bitCount(START ^ GOAL);
    }
}