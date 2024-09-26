package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_15;

import java.time.LocalTime;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to add hours to the current time.</h2>
 */

public class Question15 {
    public static void main(final String[] PARAMETERS) {
        final LocalTime CURRENT_LOCAL_TIME = LocalTime.now();
        System.out.print(CURRENT_LOCAL_TIME.plusHours(2));
    }
}