package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_28;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that displays the date time information before a certain number of hours and minutes from the current date.</h2>
 */

public class Question28 {
    public static void main(final String[] ARGUMENTS) {
        final int HOURS_TO_SUBTRACT = 3;
        final int MINUTES_TO_SUBTRACT = 45;
        final LocalDateTime CURRENT_DATE_AND_TIME = LocalDateTime.now();
        final LocalDateTime MODIFIED_DATE_AND_TIME = CURRENT_DATE_AND_TIME
                .minusHours(HOURS_TO_SUBTRACT)
                .minusMinutes(MINUTES_TO_SUBTRACT);
        final DateTimeFormatter DATE_AND_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.printf("""
                        Current date and time: %s
                        %d hours and %d minutes ago: %s""",
                CURRENT_DATE_AND_TIME.format(DATE_AND_TIME_FORMATTER),
                HOURS_TO_SUBTRACT,
                MINUTES_TO_SUBTRACT,
                MODIFIED_DATE_AND_TIME.format(DATE_AND_TIME_FORMATTER));
    }
}