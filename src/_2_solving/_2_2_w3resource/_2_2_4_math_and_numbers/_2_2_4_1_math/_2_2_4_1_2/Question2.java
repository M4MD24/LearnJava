package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_2;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get whole and fractional parts from a double value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original number: 12.56
 * <br/>
 * Integral part: 12.0
 * <br/>
 * Fractional part: 0.5600000000000005
 * </h2>
 */

public class Question2 {
    public static void main(final String[] ARGS) {
        final double NUMBER = 12.56D;
        System.out.printf("Original number: %f\n", NUMBER);
        System.out.printf("Integral part: %f\n", Math.floor(NUMBER));
        System.out.printf("Fractional part: %f", NUMBER - Math.floor(NUMBER));
    }
}