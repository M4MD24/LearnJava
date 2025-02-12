package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the first and last day of each week.</h2>
 */

public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        final LocalDate LOCAL_TODAY = LocalDate.now(),
                FIRST_DAY_OF_WEEK = LOCAL_TODAY.with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY)),
                LAST_DAY_OF_WEEK = LOCAL_TODAY.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.printf("""
                        First day of the week: %s
                        Last day of the week: %s""",
                FIRST_DAY_OF_WEEK,
                LAST_DAY_OF_WEEK);
    }
}