package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_14_question_164;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
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

public class Question164 {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input the dividend: ");
        final int DIVIDEND_NUMBER = INPUT.nextInt();
        System.out.print("Input the divider: ");
        final int DIVIDER_NUMBER = INPUT.nextInt();
        System.out.print(STR."Result: \{(double) DIVIDEND_NUMBER / DIVIDER_NUMBER}");
    }
}