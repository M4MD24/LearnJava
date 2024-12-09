package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_15;

import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the current date and time in the specified format.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * Hijri    : 10, 03 (Rabiʻ I), 1446
 * <br/>
 * Gregorian: 13, 09 (September), 2024
 * <br/>
 * Time     : 03:42:25 PM
 * </h2>
 */

public class Question15 {
    private static final Calendar TIME_NOW = Calendar.getInstance();

    public static void main(final String[] PARAMETERS) {
        System.out.format("""
                        Hijri    : %s
                        Gregorian: %02d, %02d (%s), %d
                        Time     : %02d:%02d:%02d %s""",
                getHijrahData(),
                getDay(), getMonth(), getMonthName(), getYear(),
                getHour(), getMinute(), getSecond(), getAaOrPm());
    }

    private static String getHijrahData() {
        final HijrahDate HIJRAH_DATE = HijrahDate.now();
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(
                "dd, MM (MMMM), yyyy",
                java.util.Locale.ENGLISH
        );
        return HIJRAH_DATE.format(FORMATTER);
    }

    private static String getAaOrPm() {
        return TIME_NOW.get(Calendar.AM_PM) == Calendar.AM
                ? "AM"
                : "PM";
    }

    private static int getSecond() {
        return TIME_NOW.get(Calendar.SECOND);
    }

    private static int getMinute() {
        return TIME_NOW.get(Calendar.MINUTE);
    }

    private static int getHour() {
        int hour = TIME_NOW.get(Calendar.HOUR);
        if (hour == 0)
            return 12;
        else
            return hour;
    }

    private static int getYear() {
        return TIME_NOW.get(Calendar.YEAR);
    }

    private static String getMonthName() {
        return TIME_NOW.getDisplayName(
                Calendar.MONTH,
                Calendar.LONG,
                java.util.Locale.ENGLISH
        );
    }

    private static int getMonth() {
        return TIME_NOW.get(Calendar.MONTH) + 1;
    }

    private static int getDay() {
        return TIME_NOW.get(Calendar.DAY_OF_MONTH);
    }
}