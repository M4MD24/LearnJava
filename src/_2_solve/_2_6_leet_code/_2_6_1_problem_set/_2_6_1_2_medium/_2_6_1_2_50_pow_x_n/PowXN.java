package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_50_pow_x_n;

/**
 * <h1>Problem:</h1>
 * <h2>Implement pow(x, n), which calculates x raised to the power n (i.e., xn).</h2>
 */

public class PowXN {
    public static void main(final String[] PARAMETERS) {
        System.out.print(myPow(2.0D, 10));
    }

    private static double myPow(final double BASE, final int EXPONENT) {
        return Math.pow(BASE, EXPONENT);
    }
}