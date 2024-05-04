package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_5_question_329;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>3.5 raised to the power of 4 is: 150.0625</h2>
 */

public class Question329 {
    public static void main(final String[] ARGS) {
        final float BASE = 3.5F;
        final int POWER = 4;
        System.out.print(STR."\{BASE} raised to the power of \{POWER} is: \{getResultPowerOfNumber(BASE, POWER, BASE)}");
    }

    private static float getResultPowerOfNumber(final float BASE, int power, float resultPowerOfNumber) {
        if (power == 1)
            return resultPowerOfNumber;
        else
            return getResultPowerOfNumber(BASE, --power, resultPowerOfNumber * BASE);
    }
}