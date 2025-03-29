package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_14;

import java.time.LocalTime;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the current local time.</h2>
 */

public class Question14 {
    public static void main(final String[] ARGUMENTS) {
        final LocalTime CURRENT_LOCAL_TIME = LocalTime.now();
        System.out.print(CURRENT_LOCAL_TIME);
    }
}