package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_22_question_22;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a binary number to a decimal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a binary number: 100</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Decimal number: 4</h2>
 */

public class Question22 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        long decimalNumber = 0, productNumber = 1, remainder;

        System.out.print("Input a binary number: ");
        long binaryNumber = input.nextLong();

        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber += remainder * productNumber;
            productNumber *= 2;
            binaryNumber /= 10;
        }

        System.out.print("Decimal number: " + decimalNumber);
    }
}