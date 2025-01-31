package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_36;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a Unix timestamp to a date.</h2>
 */

public class Question36 {
    public static void main(final String[] ARGUMENTS) {
        final long UNIX_SECONDS = 1055106000L;
        final Date DATE = new Date(UNIX_SECONDS * 1000L);
        final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        final String DATE_STRING = SIMPLE_DATE_FORMAT.format(DATE);
        System.out.print(DATE_STRING);
    }
}