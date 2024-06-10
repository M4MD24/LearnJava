package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert temperature from Fahrenheit to Celsius degrees.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a degree in Fahrenheit: 212</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>212.0 degree Fahrenheit is equal to 100.0 in Celsius</h2>
 */

public class Question1 {
    public static void main(final String[] ARGS) {
        final double FAHRENHEIT_DEGREE = 212;
        System.out.printf("%f° degree fahrenheit is equal to %f° in celsius\n", FAHRENHEIT_DEGREE, getCelsiusDegree(FAHRENHEIT_DEGREE));
    }

    private static double getCelsiusDegree(final double FAHRENHEIT_DEGREE) {
        return (5 * (FAHRENHEIT_DEGREE - 32)) / 9;
    }
}