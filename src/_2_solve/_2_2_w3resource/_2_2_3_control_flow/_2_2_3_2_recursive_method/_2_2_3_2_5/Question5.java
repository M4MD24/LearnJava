package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>3.5 raised to the power of 4 is: 150.0625</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final float BASE = 3.5F;
        final int POWER = 4;
        System.out.printf("%f raised to the power of %d is: %f",
                BASE,
                POWER,
                getResultPowerOfNumber(BASE, POWER, BASE));
    }

    private static float getResultPowerOfNumber(final float BASE, int power, float resultPowerOfNumber) {
        if (power == 1)
            return resultPowerOfNumber;
        else
            return getResultPowerOfNumber(BASE, --power, resultPowerOfNumber * BASE);
    }
}