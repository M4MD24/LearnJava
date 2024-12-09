package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_19;

import java.time.LocalDate;
import java.time.Period;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the year and month between two dates.</h2>
 */

public class Question19 {
    public static void main(final String[] PARAMETERS) {
        final LocalDate CURRENT_DATE = LocalDate.now(),
                ANOTHER_DATE = LocalDate.of(2003, 6, 9);
        final Period DIFFERENCE_BETWEEN_CURRENT_DATE_AND_ANOTHER_DATE = Period.between(CURRENT_DATE, ANOTHER_DATE);
        System.out.printf("""
                        Years : %d
                        Months: %d""",
                -DIFFERENCE_BETWEEN_CURRENT_DATE_AND_ANOTHER_DATE.getYears(),
                -DIFFERENCE_BETWEEN_CURRENT_DATE_AND_ANOTHER_DATE.getMonths());
    }
}