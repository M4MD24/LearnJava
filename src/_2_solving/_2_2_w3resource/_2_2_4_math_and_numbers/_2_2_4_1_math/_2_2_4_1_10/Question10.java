package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_10;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to accept a float value of a number and return a rounded float value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a float number: 12.53
 * <br/>
 * The rounded value of 12.530000 is: 13.00
 * </h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final float NUMBER = 12.53F;
        System.out.printf("""
                        Input a float number:\s%f
                        The rounded value of\s%.6f is: %.2f""",
                NUMBER,
                NUMBER,
                (float) Math.round(NUMBER));
    }
}