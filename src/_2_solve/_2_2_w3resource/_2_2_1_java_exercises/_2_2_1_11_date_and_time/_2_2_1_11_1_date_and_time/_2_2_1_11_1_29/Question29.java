package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a string to a date.</h2>
 */

public class Question29 {
    public static void main(final String[] PARAMETERS) throws ParseException {
        final String DATE_STRING = "2003-06-09";
        final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        final Date DATE = SIMPLE_DATE_FORMAT.parse(DATE_STRING);
        System.out.print(DATE);
    }
}