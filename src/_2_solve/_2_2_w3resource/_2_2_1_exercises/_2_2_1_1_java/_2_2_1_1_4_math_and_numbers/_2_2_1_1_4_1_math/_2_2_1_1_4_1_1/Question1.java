package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to round up integer division results.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Percentage of Marks: 88%</h2>
 */

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        final int CURRENT_MARKS = 440,
                TOTAL_MARKS = 500;
        System.out.printf("Percentage of Marks: %d%%",
                CURRENT_MARKS * 100 / TOTAL_MARKS);
    }
}