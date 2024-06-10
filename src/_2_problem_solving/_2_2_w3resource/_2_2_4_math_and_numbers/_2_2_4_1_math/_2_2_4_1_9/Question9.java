package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_9;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a floating value to an absolute value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a float number: -12.53
 * <br/>
 * The absolute value of -12.53 is: 12.53
 * </h2>
 */

public class Question9 {
    public static void main(final String[] ARGS) {
        final float NUMBER = -12.53F;
        System.out.printf("""
                        Input a float number:\s%f
                        The absolute value of\s%f is: %f""",
                NUMBER,
                NUMBER,
                NUMBER >= 0 ?
                        NUMBER :
                        -NUMBER);
    }
}