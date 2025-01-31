package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_24;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to display dates in the following formats.
 * <br/>
 * 09-06-2003
 * <br/>
 * 09:06:20:030
 * </h2>
 */

public class Question24 {
    public static void main(final String[] ARGUMENTS) {
        final LocalDateTime CURRENT_DATE = LocalDateTime.now();
        final DateTimeFormatter DATE_AND_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy\nHH:mm:ss:SSS");
        final String FORMATTED_DATE_AND_TIME = CURRENT_DATE.format(DATE_AND_TIME_FORMATTER);
        System.out.print(FORMATTED_DATE_AND_TIME);
    }
}