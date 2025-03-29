package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_10;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the first and last day of a month.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        final LocalDate LOCAL_TODAY = LocalDate.now(),
                FIRST_DAY_OF_MONTH = LOCAL_TODAY.with(TemporalAdjusters.firstDayOfMonth()),
                LAST_DAY_OF_MONTH = LOCAL_TODAY.with(TemporalAdjusters.lastDayOfMonth());
        System.out.printf("""
                        First day of the month: %s
                        Last day of the month: %s""",
                FIRST_DAY_OF_MONTH,
                LAST_DAY_OF_MONTH);
    }
}