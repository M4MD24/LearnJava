package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to round a float number to specified decimals.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original number: 451.3256531
 * <br/>
 * Rounded up to 4 decimal: 451.3257
 * </h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final double NUMBER = 451.3256531D;
        final int TARGET_DECIMAL_NUMBERS = 4;
        System.out.printf("Rounded up to %d decimal: %" + TARGET_DECIMAL_NUMBERS + ".4f",
                TARGET_DECIMAL_NUMBERS,
                NUMBER);
    }
}