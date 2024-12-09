package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_22;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a program to check if a number is a Mersenne number or not.
 * <br/>
 * In mathematics, a Mersenne number is a number that can be written in the form M(n) = 2^n − 1 for some integer n.
 * <<br/>
 * The first four Mersenne primes are 3, 7, 31, and 127
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 127
 * <br/>
 * 127 is a mersenne number.
 * </h2>
 */
public class Question22 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 127;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf(NUMBER + " is%s a mersenne number", isMersenneNumber(NUMBER) ? "" : "n't");
    }

    private static boolean isMersenneNumber(final int NUMBER) {
        for (int index = 1; index < NUMBER; index++)
            if (NUMBER == Math.pow(2, index) - 1)
                return true;
        return false;
    }
}