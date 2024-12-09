package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to combine local date and time into a single object.</h2>
 */

public class Question41 {
    public static void main(final String[] PARAMETERS) {
        final LocalDate CURRENT_DATE = LocalDate.now();
        final LocalTime CURRENT_TIME = LocalTime.now();
        final LocalDateTime CURRENT_DATE_AND_TIME = LocalDateTime.of(CURRENT_DATE, CURRENT_TIME);
        System.out.print("Date and Time: " + CURRENT_DATE_AND_TIME);
    }
}