package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_38;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the difference between two dates in days.</h2>
 */

public class Question38 {
    public static void main(final String[] ARGUMENTS) {
        final LocalDate FIRST_DATE = LocalDate.of(2003, 6, 9),
                SECOND_DATE = LocalDate.of(2003, 6, 8);
        final long DIFFERENCE_DAYS = ChronoUnit.DAYS.between(FIRST_DATE, SECOND_DATE);
        System.out.print(
                Math.abs(DIFFERENCE_DAYS) + " " + (
                        (DIFFERENCE_DAYS != 1)
                                ? "Days"
                                : "Day"
                )
        );
    }
}