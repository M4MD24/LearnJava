package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_52;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 5
 * <br/>
 * Input second number: 10
 * <br/>
 * Input sum of two numbers: 15
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Sum Status is: true</h2>
 */

public class Question52 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int FIRST_NUMBER = input.nextInt();

        System.out.print("Input second number: ");
        final int SECOND_NUMBER = input.nextInt();

        System.out.print("Input sum of two numbers: ");
        final int SUM_OF_TWO_NUMBERS = input.nextInt();

        final boolean SUM_STATUS = ((FIRST_NUMBER + SECOND_NUMBER) == SUM_OF_TWO_NUMBERS);
        System.out.print("Sum status is: " + SUM_STATUS);
    }
}