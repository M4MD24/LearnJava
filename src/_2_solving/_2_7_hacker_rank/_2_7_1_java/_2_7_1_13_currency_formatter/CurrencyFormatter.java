package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_13_currency_formatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_13_currency_formatter.files <h2>Question</h2>
 */

public class CurrencyFormatter {
    public static void main(final String[] PARAMETERS) throws Exception {
        final Scanner INPUT = new Scanner(System.in);
        final double PAYMENT = INPUT.nextDouble();
        final Locale US_LOCALE = Locale.US,
                INDIA_LOCALE = new Locale("en", "IN"),
                CHINA_LOCALE = Locale.CHINA,
                FRANCE_LOCALE = Locale.FRANCE;
        final String US = NumberFormat.getCurrencyInstance(US_LOCALE).format(PAYMENT),
                INDIA = NumberFormat.getCurrencyInstance(INDIA_LOCALE).format(PAYMENT),
                CHINA = NumberFormat.getCurrencyInstance(CHINA_LOCALE).format(PAYMENT),
                FRANCE = NumberFormat.getCurrencyInstance(FRANCE_LOCALE).format(PAYMENT);
        System.out.println("US: " + US);
        System.out.println("India: " + INDIA);
        System.out.println("China: " + CHINA);
        System.out.print("France: " + FRANCE);
    }
}