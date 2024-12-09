package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_23;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the number of months left in the year.</h2>
 */

public class Question23 {
    public static void main(final String[] PARAMETERS) {
        final LocalDate CURRENT_DATE = LocalDate.now();
        final LocalDate LAST_DAY_OF_YEAR = CURRENT_DATE.with(TemporalAdjusters.lastDayOfYear());
        final Period MONTHS_REMAINING_IN_YEAR = CURRENT_DATE.until(LAST_DAY_OF_YEAR);
        System.out.print(MONTHS_REMAINING_IN_YEAR.getMonths());
    }
}