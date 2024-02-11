package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_108_question_108;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to add all the digits of a given positive integer until the result has a single digit.</h2>
 */

public class Question108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = input.nextInt();
        System.out.print("The single digit number is: " + (number == 0 ? 0 : (number % 9 == 0 ? 9 : number % 9)));
    }
}