package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_42;

import java.time.Duration;
import java.time.Period;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to define a period of time using date-based values (Period) and a duration of time using time-based values (Duration).</h2>
 */

public class Question42 {
    public static void main(final String[] ARGUMENTS) {
        final Period PERIOD = Period.of(
                2,
                3,
                5
        );
        System.out.println("Period: " + PERIOD);

        final Duration DURATION = Duration
                .ofHours(5)
                .plusMinutes(30)
                .plusSeconds(45);
        System.out.print("Duration: " + DURATION);
    }
}