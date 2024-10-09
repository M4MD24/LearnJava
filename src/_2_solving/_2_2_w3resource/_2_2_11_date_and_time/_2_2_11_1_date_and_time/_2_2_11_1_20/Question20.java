package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_20;

import java.time.Instant;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the current timestamp.</h2>
 */

public class Question20 {
    public static void main(final String[] PARAMETERS) {
        final Instant CURRENT_DATE = Instant.now();
        System.out.print(CURRENT_DATE);
    }
}