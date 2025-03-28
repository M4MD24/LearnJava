package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_30;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compute the difference between two dates (years, months, days).</h2>
 */

public class Question30 {
    public static void main(final String[] ARGUMENTS) throws ParseException {
        final LocalDate CURRENT_DATE = LocalDate.now(),
                ANOTHER_DATE = LocalDate.of(2003, 6, 9);
        final Period DIFFERENCE_BETWEEN_CURRENT_DATE_AND_ANOTHER_DATE = Period.between(CURRENT_DATE, ANOTHER_DATE);
        System.out.print(DIFFERENCE_BETWEEN_CURRENT_DATE_AND_ANOTHER_DATE);
    }
}