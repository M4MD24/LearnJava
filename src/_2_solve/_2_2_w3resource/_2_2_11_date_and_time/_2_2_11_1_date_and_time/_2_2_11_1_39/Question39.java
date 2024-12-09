package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_39;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert String to date and time and vice versa.</h2>
 */

public class Question39 {
    public static void main(final String[] PARAMETERS) throws ParseException {
        final String DATE_AND_TIME_PATTERN = "dd-MM-yyyy HH:mm:ss:SSS";
        final String DATE_AND_TIME_TEXT = "09-06-2003 00:00:00:000";
        final Date DATE_AND_TIME_AFTER_CONVERT_FROM_TEXT = convertTextToDateAndTime(DATE_AND_TIME_TEXT, DATE_AND_TIME_PATTERN);
        System.out.println("Converted String to Date:\n" + DATE_AND_TIME_AFTER_CONVERT_FROM_TEXT);
        System.out.print("\nConverted Date to String:\n" + convertDateAndTimeToText(DATE_AND_TIME_AFTER_CONVERT_FROM_TEXT, DATE_AND_TIME_PATTERN));
    }

    private static Date convertTextToDateAndTime(final String TEXT, final String PATTERN) throws ParseException {
        return new SimpleDateFormat(PATTERN).parse(TEXT);
    }

    private static String convertDateAndTimeToText(final Date DATE_AND_TIME, final String PATTERN) {
        return new SimpleDateFormat(PATTERN).format(DATE_AND_TIME);
    }
}