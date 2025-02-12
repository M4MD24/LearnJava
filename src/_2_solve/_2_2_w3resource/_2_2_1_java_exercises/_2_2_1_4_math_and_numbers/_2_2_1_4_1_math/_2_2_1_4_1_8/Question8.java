package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_1_math._2_2_1_4_1_8;

/**
 * <h1>Problem:</h1>
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
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = -25;
        System.out.printf("""
                        Input an integer number: %d
                        The absolute value of %d is: %d""",
                NUMBER,
                NUMBER,
                NUMBER >= 0
                        ? NUMBER
                        : -NUMBER);
    }
}