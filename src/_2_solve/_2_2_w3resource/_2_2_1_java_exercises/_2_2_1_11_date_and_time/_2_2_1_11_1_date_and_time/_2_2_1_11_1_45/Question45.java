package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_45;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print (dd-MM-yyyy\nHH:mm:ss:SSS) format pattern for date and time.</h2>
 */

public class Question45 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(new SimpleDateFormat("dd-MM-yyyy\nHH:mm:ss:SSS").format(new Date()));
    }
}