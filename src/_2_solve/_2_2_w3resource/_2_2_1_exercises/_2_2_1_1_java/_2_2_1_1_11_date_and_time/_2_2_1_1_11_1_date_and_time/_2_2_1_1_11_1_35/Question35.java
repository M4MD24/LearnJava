package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_35;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to extract date and time from the date string.</h2>
 */

public class Question35 {
    public static void main(final String[] ARGUMENTS) throws ParseException {
        final String DATE_AND_TIME = "09-06-2003\n00:00:00:000";
        final Date DATE = new SimpleDateFormat("dd-MM-yyyy\nHH:mm:ss:SSS").parse(DATE_AND_TIME);
        final String DATE_AND_TIME_AFTER_PARSE = new SimpleDateFormat("dd-MM-yyyy\nHH:mm:ss:SSS").format(DATE);
        System.out.print(DATE_AND_TIME_AFTER_PARSE);
    }
}