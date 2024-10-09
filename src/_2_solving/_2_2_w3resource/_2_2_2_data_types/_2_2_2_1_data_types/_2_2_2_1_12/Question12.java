package _2_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_12;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compare two signed and unsigned numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Signed integers: -2147483648, 2147483647
 * <br/>
 * ----------------------------------------
 * <br/>
 * Result of comparing signed numbers: -1
 * <br/>
 * Result of comparing unsigned numbers: 1
 * </h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = Integer.MIN_VALUE,
                SECOND_NUMBER = Integer.MAX_VALUE;
        System.out.printf("Signed numbers: %d, %d\n", FIRST_NUMBER, SECOND_NUMBER);
        System.out.println("-".repeat(String.valueOf(FIRST_NUMBER).length() + String.valueOf(SECOND_NUMBER).length() + 18));
        System.out.printf("Result of comparing signed numbers: %d", Integer.compare(FIRST_NUMBER, SECOND_NUMBER));
        System.out.printf("Result of comparing unsigned numbers: %d", Integer.compareUnsigned(FIRST_NUMBER, SECOND_NUMBER));
    }
}