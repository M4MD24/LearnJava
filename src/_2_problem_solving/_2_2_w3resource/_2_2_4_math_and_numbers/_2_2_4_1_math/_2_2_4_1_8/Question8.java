package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_8;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert an integer value to an absolute value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an integer number: -25
 * <br/>
 * The absolute value of -25 is: 25
 * </h2>
 */

public class Question8 {
    public static void main(final String[] ARGS) {
        final int NUMBER = -25;
        System.out.printf("""
                        Input an integer number:\s%d
                        The absolute value of %d is: %d""",
                NUMBER,
                NUMBER,
                NUMBER >= 0
                        ? NUMBER
                        : -NUMBER);
    }
}