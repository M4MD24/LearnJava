package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_75;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads a date (from 2004/1/1 to 2004/12/31) and prints the day of the date. Jan. 1, 2004, was Thursday. Note that 2004 is a leap year.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input month: 9
 * <br/>
 * Input day: 15
 * <br/>
 * Day of week: Wednesday
 * </h2>
 */

public class Question75 {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input month: ");
        final byte MONTH_NUMBER = INPUT.nextByte();
        System.out.print("Input day: ");
        final byte DAY_NUMBER = INPUT.nextByte();
        System.out.printf("Day of week: %s", LocalDate.of(2004, MONTH_NUMBER, DAY_NUMBER).getDayOfWeek());
    }
}