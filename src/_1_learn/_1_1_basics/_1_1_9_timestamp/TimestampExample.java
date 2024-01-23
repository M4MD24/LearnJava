package _1_learn._1_1_basics._1_1_9_timestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * <ul>
 *     <li><b>LocalDate</b> - Represents a date (year, month, day (yyyy-MM-dd))</li>
 *     <li><b>LocalTime</b> - Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))</li>
 *     <li><b>LocalDateTime</b> - Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)</li>
 *     <li><b>DateTimeFormatter</b> - Formatter for displaying and parsing date-time objects</li>
 * </ul>
 */
public class TimestampExample {
    public static void main(String[] args) {
        date();
        time();
        dateAndTime();
        formattingDateAndTime();
    }

    private static void date() {
        System.out.println("■ Date:\n");
        LocalDate dateNow = LocalDate.now();
        System.out.println("Date Now        : " + dateNow);
        System.out.println("Year            : " + dateNow.getYear());
        System.out.println("Month           : " + dateNow.getMonth());
        System.out.println("DayOfYear       : " + dateNow.getDayOfYear());
        System.out.println("DayOfMonth      : " + dateNow.getDayOfMonth());
        System.out.println("DayOfWeek       : " + dateNow.getDayOfWeek() + "\n");
    }

    private static void time() {
        System.out.println("■ Time:\n");
        LocalTime timeNow = LocalTime.now();
        System.out.println("Time Now        : " + timeNow);
        System.out.println("Hours           : " + timeNow.getHour());
        System.out.println("Minutes         : " + timeNow.getMinute());
        System.out.println("Seconds         : " + timeNow.getSecond());
        System.out.println("Nano of Seconds : " + timeNow.getNano() + "\n");
    }

    private static void dateAndTime() {
        System.out.println("■ Date and Time:\n");
        LocalDateTime dateAndTimeNow = LocalDateTime.now();
        System.out.println("Date and Time Now: " + dateAndTimeNow);

        System.out.println("Date Now         : " + dateAndTimeNow.getYear());
        System.out.println("Year             : " + dateAndTimeNow.getYear());
        System.out.println("Month            : " + dateAndTimeNow.getMonth());
        System.out.println("DayOfYear        : " + dateAndTimeNow.getDayOfYear());
        System.out.println("DayOfMonth       : " + dateAndTimeNow.getDayOfMonth());
        System.out.println("DayOfWeek        : " + dateAndTimeNow.getDayOfWeek());

        System.out.println("Time Now         : " + dateAndTimeNow);
        System.out.println("Hours            : " + dateAndTimeNow.getHour());
        System.out.println("Minutes          : " + dateAndTimeNow.getMinute());
        System.out.println("Seconds          : " + dateAndTimeNow.getSecond());
        System.out.println("Nano of Seconds  : " + dateAndTimeNow.getNano() + "\n");
    }

    private static void formattingDateAndTime() {
        System.out.println("■ Formatting Date and Time:\n");
        LocalDateTime dateAndTimeNow = LocalDateTime.now();

        System.out.println("Before Formatting: " + dateAndTimeNow);

        DateTimeFormatter formattingDateAndTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateAndTime = dateAndTimeNow.format(formattingDateAndTime);
        System.out.println("After Formatting: " + formattedDateAndTime);
    }
}