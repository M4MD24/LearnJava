package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_54_question_54;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 5
 * <br/>
 * Input second number: 5
 * <br/>
 * Input third number: 15
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>The result is: true</h2>
 */

public class Question54 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int NUMBER_1 = input.nextInt();

        System.out.print("Input second number: ");
        final int NUMBER_2 = input.nextInt();

        System.out.print("Input third number: ");
        final int NUMBER_3 = input.nextInt();

        boolean result = (NUMBER_1 % 10 == NUMBER_2 % 10 || NUMBER_2 % 10 == NUMBER_3 % 10 || NUMBER_3 % 10 == NUMBER_1 % 10);
        System.out.print("The result is: " + result);
    }
}