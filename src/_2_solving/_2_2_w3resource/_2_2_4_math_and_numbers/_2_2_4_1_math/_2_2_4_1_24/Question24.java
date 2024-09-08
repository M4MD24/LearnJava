package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_24;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to calculate the Binomial Coefficient of two positive numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the first number(n): 10
 * <br/>
 * Input the second number(k): 2
 * <br/>
 * Binomial Coefficient of the said numbers 45
 * </h2>
 *
 * @see _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_24.images <h2>Figure</h2>
 */

public class Question24 {
    public static void main(final String[] PARAMETERS) {
        final byte FIRST_NUMBER = 10,
                SECOND_NUMBER = 2;
        System.out.printf("""
                        Input the first number(n): %d
                        Input the second number(k): %d
                        Binomial Coefficient of the said numbers %d""",
                FIRST_NUMBER,
                SECOND_NUMBER,
                getBinomialCoefficient(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static long getBinomialCoefficient(final byte FIRST_NUMBER, final byte SECOND_NUMBER) {
        return getFactorial(FIRST_NUMBER) / (getFactorial(SECOND_NUMBER) * getFactorial((byte) (FIRST_NUMBER - SECOND_NUMBER)));
    }

    private static long getFactorial(final byte NUMBER) {
        long multiplication = 1;
        for (int index = 2; index <= NUMBER; index++)
            multiplication *= index;
        return multiplication;
    }
}