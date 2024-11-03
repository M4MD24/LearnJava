package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_13_currency_formatter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_13_currency_formatter.files <h2>Question</h2>
 */

public class CurrencyFormatter {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final double AMOUNT = Double.parseDouble(INPUT.readLine());
        final String FORMATTED_AMOUNT = new DecimalFormat("#,##0.00").format(AMOUNT);
        OUTPUT.write(("US: $" + FORMATTED_AMOUNT));
        OUTPUT.write(("\nIndia: Rs." + FORMATTED_AMOUNT));
        OUTPUT.write(("\nChina: " + (char) 65509 + FORMATTED_AMOUNT));
        OUTPUT.write("\nFrance: " + FORMATTED_AMOUNT.replace(",", " ").replace(".", ",") + " " + (char) 8364);
        OUTPUT.flush();
    }
}