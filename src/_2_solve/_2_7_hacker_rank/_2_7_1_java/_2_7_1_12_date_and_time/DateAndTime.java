package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_12_date_and_time;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_12_date_and_time.files <h2>Question</h2>
 */

public class DateAndTime {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String[] DATE_PARTS = INPUT.readLine().split(" ");
        final int MONTH = Integer.parseInt(DATE_PARTS[0]),
                DAY = Integer.parseInt(DATE_PARTS[1]),
                YEAR = Integer.parseInt(DATE_PARTS[2]);
        final String DAY_OF_WEEK = LocalDate.of(YEAR, MONTH, DAY)
                .getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                .toUpperCase();
        OUTPUT.write(DAY_OF_WEEK);
        OUTPUT.flush();
    }
}