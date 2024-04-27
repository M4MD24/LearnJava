package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_86_question_86;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.</h2>
 */

public class Question86 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();
        while (number != 1) {
            if (number % 2 == 0) {
                System.out.println(number + " / " + 2 + " = " + (number / 2));
                number = number / 2;
            } else {
                System.out.println(number + " * " + 3 + " + " + 1 + " = " + (number * 3 + 1));
                number = number * 3 + 1;
            }
        }
        System.out.print("Number = " + number);
        input.close();
    }
}