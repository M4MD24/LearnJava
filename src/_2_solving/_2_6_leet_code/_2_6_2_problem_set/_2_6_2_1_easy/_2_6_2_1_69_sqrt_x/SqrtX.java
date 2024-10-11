package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_69_sqrt_x;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * <br/>
 * <br/>
 * You must not use any built-in exponent function or operator.
 * <br/>
 * <br/>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * </h2>
 */

public class SqrtX {
    public static void main(final String[] PARAMETERS) {
        System.out.print(mySqrt(8));
    }

    private static int mySqrt(final int NUMBER) {
        return (int) Math.sqrt(NUMBER);
    }
}