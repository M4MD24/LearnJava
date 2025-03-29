package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_2_data_types._2_2_1_1_2_1_data_types._2_2_1_1_2_1_5;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that prints the current time in GMT.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the time zone offset to GMT: 256</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Current time is 23:40:24</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        final long TIME_ZONE_CHANGE = INPUT.nextLong(),
                TOTAL_MILLISECONDS = System.currentTimeMillis(),
                TOTAL_SECONDS = TOTAL_MILLISECONDS / 1000,
                CURRENT_SECOND = TOTAL_SECONDS % 60,
                TOTAL_MINUTES = TOTAL_SECONDS / 60,
                CURRENT_MINUTE = TOTAL_MINUTES % 60,
                TOTAL_HOURS = TOTAL_MINUTES / 60,
                CURRENT_HOUR = (TOTAL_HOURS + TIME_ZONE_CHANGE) % 24;
        System.out.printf("Current time is %02d:%02d:%02d%n", CURRENT_HOUR, CURRENT_MINUTE, CURRENT_SECOND);
    }
}