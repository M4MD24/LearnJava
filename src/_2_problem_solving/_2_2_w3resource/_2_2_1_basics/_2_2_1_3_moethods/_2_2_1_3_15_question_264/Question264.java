package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_15_question_264;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to display the current date and time.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Current date and time: Wednesday January 25, 2017 7:47:43</h2>
 */
public class Question264 {
    public static void main(final String[] ARGS) {
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