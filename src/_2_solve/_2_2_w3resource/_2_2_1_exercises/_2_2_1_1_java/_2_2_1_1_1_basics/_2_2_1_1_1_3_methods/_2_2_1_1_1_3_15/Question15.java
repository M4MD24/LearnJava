package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_3_methods._2_2_1_1_1_3_15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method to display the current date and time.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Current date and time: Wednesday January 25, 2017 7:47:43</h2>
 */
public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        final LocalDate DATE = LocalDate.now();
        final LocalDateTime TIME = LocalDateTime.now();
        System.out.printf("Current date and time: %s %s %s, %s %s",
                DATE.getDayOfWeek(),
                DATE.getMonth(),
                DATE.getDayOfMonth(),
                DATE.getYear(),
                TIME.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}