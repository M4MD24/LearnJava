package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_17;

import java.math.BigDecimal;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the number of decimal places in a given number.</h2>
 */

public class Question17 {
    public static void main(final String[] ARGUMENTS) {
        final BigDecimal NUMBER = new BigDecimal("123456789.123456789");
        System.out.print(getCountOfDecimalPlaces(NUMBER));
    }

    private static long getCountOfDecimalPlaces(final BigDecimal NUMBER) {
        return NUMBER.scale();
    }

// >
    /*public static void main(final String[] ARGUMENTS) {
        final Number NUMBER = 123456789.123456789;
        System.out.print(getCountOfDecimalPlaces(NUMBER));
    }

    private static long getCountOfDecimalPlaces(final Number NUMBER) {
        final String NUMBER_AS_TEXT = String.valueOf(NUMBER);
        return NUMBER_AS_TEXT.contains(".")
                ? NUMBER_AS_TEXT.split("\\.")[1].length()
                : 0;
    }*/
}