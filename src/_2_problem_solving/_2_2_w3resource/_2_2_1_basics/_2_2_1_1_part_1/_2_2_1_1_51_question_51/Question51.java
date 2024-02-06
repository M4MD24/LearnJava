package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_51_question_51;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a string to an integer.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a number(string): 25</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>The integer value is: 25</h2>
 */

public class Question51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number(string): ");
        final String STRING_NUMBER = input.nextLine();

        final int INTEGER_NUMBER = Integer.parseInt(STRING_NUMBER);
        System.out.print("The integer value is: " + INTEGER_NUMBER);
    }
}