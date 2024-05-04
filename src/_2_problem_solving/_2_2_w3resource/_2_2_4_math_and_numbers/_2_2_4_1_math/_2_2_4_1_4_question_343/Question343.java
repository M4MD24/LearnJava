package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_4_question_343;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to round a float number to specified decimals.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original number: 451.3256531
 * <br/>
 * Rounded up to 4 decimal: 451.3257
 * </h2>
 */

public class Question343 {
    public static void main(final String[] ARGS) {
        final double NUMBER = 451.3256531D;
        final int TARGET_DECIMAL_NUMBERS = 4;
        System.out.print(STR."Rounded up to \{TARGET_DECIMAL_NUMBERS} deciaml: \{String.format(STR."%\{TARGET_DECIMAL_NUMBERS}.4f", NUMBER)}");
    }
}