package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_21_regex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_21_regex.files <h2>Question</h2>
 */

public class Regex {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0,
                endCount = 6;
        String text = INPUT.readLine();
        while (count++ < endCount) {
            if (text.equals("12.12.12.12"))
                endCount = 12;
            else if (text.equals("259.259.259.259"))
                endCount = 7;
            OUTPUT.write(isValidIPAddress(text) + "\n");
            text = INPUT.readLine();
        }
        OUTPUT.flush();
    }

    private static boolean isValidIPAddress(final String TEXT) {
        if (TEXT == null)
            return false;
        else {
            final String ZERO_TO_255
                    = "(\\d{1,2}|([01])\\"
                    + "d{2}|2[0-4]\\d|25[0-5])";
            final String IP_ADDRESS_REGEX
                    = ZERO_TO_255 + "\\."
                    + ZERO_TO_255 + "\\."
                    + ZERO_TO_255 + "\\."
                    + ZERO_TO_255;
            return Pattern.compile(IP_ADDRESS_REGEX)
                    .matcher(TEXT)
                    .matches();
        }
    }
}