package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_34;

import java.text.ParseException;
import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get today's date at midnight time.</h2>
 */

public class Question34 {
    public static void main(final String[] PARAMETERS) throws ParseException {
        final Calendar CALENDAR = Calendar.getInstance();
        CALENDAR.set(Calendar.HOUR_OF_DAY, 0);
        CALENDAR.set(Calendar.MINUTE, 0);
        CALENDAR.set(Calendar.SECOND, 0);
        System.out.print(CALENDAR.getTime());
    }
}