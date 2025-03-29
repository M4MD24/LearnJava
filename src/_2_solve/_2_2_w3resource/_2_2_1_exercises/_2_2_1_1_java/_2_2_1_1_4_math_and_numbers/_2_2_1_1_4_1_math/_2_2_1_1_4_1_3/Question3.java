package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if a double number is an integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>It's a double number</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final double NUMBER = 5.44444D;
        System.out.printf("It's a %s number",
                NUMBER % 1 == 0
                        ? "integer"
                        : "double");
    }
}