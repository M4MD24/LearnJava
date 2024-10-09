package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_14;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to divide the two given integers using the subtraction operator.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the dividend: 625
 * <br/>
 * Input the divider: 25
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Result: 25.0</h2>
 */

public class Question14 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input the dividend: ");
        final int DIVIDEND_NUMBER = INPUT.nextInt();
        System.out.print("Input the divider: ");
        final int DIVIDER_NUMBER = INPUT.nextInt();
        System.out.printf("Result: %f", (double) DIVIDEND_NUMBER / DIVIDER_NUMBER);
    }
}