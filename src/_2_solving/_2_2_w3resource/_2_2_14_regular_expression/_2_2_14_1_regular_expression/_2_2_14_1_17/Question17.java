package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_17;

import java.math.BigDecimal;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the number of decimal places in a given number.</h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) {
        final BigDecimal NUMBER = new BigDecimal("123456789.123456789");
        System.out.print(getCountOfDecimalPlaces(NUMBER));
    }

    private static long getCountOfDecimalPlaces(final BigDecimal NUMBER) {
        return NUMBER.scale();
    }

// >
    /*public static void main(final String[] PARAMETERS) {
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