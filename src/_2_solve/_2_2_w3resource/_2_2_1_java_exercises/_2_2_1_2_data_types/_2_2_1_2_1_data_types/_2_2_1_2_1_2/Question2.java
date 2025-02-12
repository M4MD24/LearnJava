package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_2_data_types._2_2_1_2_1_data_types._2_2_1_2_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads a number in inches and converts it to meters.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>One inch is 0.0254 meter.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a value for inch: 1000</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>1000.0 inch is 25.4 meters</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final double INCH_VALUE = 1000;
        System.out.printf("Input a value for inch: %f", INCH_VALUE);
        System.out.printf("%f inch is %f meters", INCH_VALUE, INCH_VALUE * 0.0254);
    }
}