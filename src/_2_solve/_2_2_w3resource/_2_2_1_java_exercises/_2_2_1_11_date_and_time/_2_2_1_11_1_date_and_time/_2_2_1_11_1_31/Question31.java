package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_31;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compute the difference between two dates in hours, minutes, seconds, milliseconds, and nanoseconds.</h2>
 */

public class Question31 {
    public static void main(final String[] PARAMETERS) throws ParseException {
        final LocalTime CURRENT_TIME = LocalTime.now();
        final LocalTime ANOTHER_TIME = LocalTime.of(
                9,
                6,
                2,
                300
        );
        final Duration DURATION = Duration.between(CURRENT_TIME, ANOTHER_TIME);
        final long HOURS = DURATION.toHours(),
                MINUTES = DURATION.toMinutes() % 60,
                SECONDS = DURATION.getSeconds() % 60,
                MILLISECONDS = DURATION.toMillis() % 1000,
                NANOSECONDS = DURATION.toNanos() % 1000;
        System.out.printf(
                "Difference: %d hours, %d minutes, %d seconds, %d milliseconds, %d nanoseconds",
                -HOURS,
                -MINUTES,
                -SECONDS,
                -MILLISECONDS,
                -NANOSECONDS
        );
    }
}