package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_55;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert seconds to hours, minutes and seconds.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input seconds: 86399</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>23:59:59</h2>
 */

public class Question55 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int SECONDS = input.nextInt();

        int SECONDS_COUNT = SECONDS % 60;
        int MINUTES_COUNT = (SECONDS / 60) % 60;
        int HOURS_COUNT = (SECONDS / 60) / 60;

        System.out.printf("%d:%d:%d", HOURS_COUNT, MINUTES_COUNT, SECONDS_COUNT);
    }
}