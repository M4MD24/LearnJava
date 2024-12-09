package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_172_factorial_trailing_zeroes;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer n, return the number of trailing zeroes in n!.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.</h2>
 */

public class FactorialTrailingZeroes {
    public static void main(final String[] PARAMETERS) {
        System.out.print(trailingZeroes(5));
    }

    private static int trailingZeroes(final int NUMBER) {
        return NUMBER == 0
                ? 0
                : NUMBER / 5 + trailingZeroes(NUMBER / 5);
    }
}