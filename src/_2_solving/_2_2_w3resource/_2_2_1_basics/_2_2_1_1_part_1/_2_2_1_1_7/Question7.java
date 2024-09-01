package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_7;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that takes a number as input and prints its multiplication table up to 10.</h2>
 * <br/>
 * <h1>Test Data:</h1>
 * <h2>Input a number: 8</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * 8 x 1 = 8
 * <br/>
 * 8 x 2 = 16
 * <br/>
 * 8 x 3 = 24
 * <br/>
 * ...
 * <br/>
 * 8 x 10 = 80
 * </h2>
 */

public class Question7 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number1 = input.nextInt();

        for (int number2 = 1; number2 < 11; number2++) {
            int multiplyOfTwoNumbers = number1 * number2;
            System.out.println(number1 + " x " + number2 + " = " + multiplyOfTwoNumbers);
        }
    }
}