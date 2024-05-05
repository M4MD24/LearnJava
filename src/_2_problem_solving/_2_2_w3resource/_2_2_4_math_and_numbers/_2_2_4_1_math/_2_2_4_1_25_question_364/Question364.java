package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_25_question_364;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to calculate e raise to the power x using the sum of the first n terms of the Taylor Series.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input n: 25
 * <br/>
 * Input x: 5
 * <br/>
 * e^x = 148.41316
 * </h2>
 */

public class Question364 {
    public static void main(final String[] ARGS) {
        final int COUNT_OF_TERMS = 25,
                EXPONENT = 5;
        System.out.print(STR."""
                Input number: \{COUNT_OF_TERMS}
                Input power: \{EXPONENT}
                e^x = \{getExponential(COUNT_OF_TERMS, EXPONENT)}""");
    }

    private static double getExponential(final int COUNT_OF_TERMS, final double EXPONENT) {
        double exponential = 1,
                factorial = 1;
        for (int number = 1; number < COUNT_OF_TERMS; number++) {
            factorial *= number;
            exponential += Math.pow(EXPONENT, number) / factorial;
        }
        return exponential;
    }
}