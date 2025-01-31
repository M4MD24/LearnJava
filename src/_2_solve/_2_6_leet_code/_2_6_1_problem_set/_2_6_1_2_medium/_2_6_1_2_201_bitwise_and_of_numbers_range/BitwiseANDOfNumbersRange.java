package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_201_bitwise_and_of_numbers_range;

/**
 * <h1>Problem:</h1>
 * <h2>Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.</h2>
 */

public class BitwiseANDOfNumbersRange {
    public static void main(final String[] ARGUMENTS) {
        final int LEFT = 5,
                RIGHT = 7;
        System.out.print(rangeBitwiseAnd(LEFT, RIGHT));
    }

    private static int rangeBitwiseAnd(int left, int right) {
        int shiftCount = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shiftCount++;
        }
        return left << shiftCount;
    }
}