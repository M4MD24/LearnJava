package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_20;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that takes a number and sets a thousand separators for that number.</h2>
 */

public class Question20 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 1234567890;
        System.out.print(getNumberWithCommas(NUMBER));
    }

    private static String getNumberWithCommas(final int NUMBER) {
        return String.valueOf(NUMBER).replaceAll(
                "(\\d)(?=(\\d{3})+(?!\\d))",
                "$1,"
        );
    }
}