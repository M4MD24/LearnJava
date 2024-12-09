package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_33;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the next and previous Fridays.</h2>
 */

public class Question33 {
    public static void main(final String[] PARAMETERS) throws ParseException {
        final LocalDate CURRENT_DATE = LocalDate.now(),
                PREVIOUS_FRIDAY = CURRENT_DATE.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)),
                NEXT_FRIDAY = CURRENT_DATE.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.printf("""
                        First Friday: %s
                        Next Friday: %s""",
                PREVIOUS_FRIDAY.format(DATE_TIME_FORMATTER),
                NEXT_FRIDAY.format(DATE_TIME_FORMATTER));
    }
}