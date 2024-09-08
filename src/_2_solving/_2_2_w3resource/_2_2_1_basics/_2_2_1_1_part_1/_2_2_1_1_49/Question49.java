package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_49;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a number: 20</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>1</h2>
 */

public class Question49 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.print((number % 2 == 0) ? 1 : 0);
    }
}