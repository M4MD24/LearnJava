package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_27;

import java.time.LocalTime;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get information about a given time.</h2>
 */

public class Question27 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTimeInformation(LocalTime.now()));
    }

    private static String getTimeInformation(final LocalTime TIME) {
        return String.format(
                "%02d:%02d:%02d",
                TIME.getHour(),
                TIME.getMinute(),
                TIME.getSecond()
        );
    }
}