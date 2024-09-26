package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the number of days between two years.</h2>
 */

public class Question46 {
    public static void main(final String[] PARAMETERS) {
        final LocalDate FIRST_YEAR = LocalDate.of(2003, 1, 1),
                SECOND_YEAR = LocalDate.of(2005, 1, 1);
        final long DIFFERENCE_DAYS = ChronoUnit.DAYS.between(FIRST_YEAR, SECOND_YEAR);
        System.out.print(Math.abs(DIFFERENCE_DAYS));
    }
}