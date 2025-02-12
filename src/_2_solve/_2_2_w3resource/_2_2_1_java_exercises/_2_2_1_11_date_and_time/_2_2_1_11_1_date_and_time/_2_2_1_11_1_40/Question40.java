package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_40;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display current date without time and current time without date.</h2>
 */

public class Question40 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("Date: " + LocalDate.now());
        System.out.print("Time: " + LocalTime.now());
    }
}