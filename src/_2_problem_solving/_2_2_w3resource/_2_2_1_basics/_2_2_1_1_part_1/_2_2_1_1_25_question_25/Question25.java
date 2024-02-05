package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_25_question_25;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a octal number to a decimal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input octal number: 10</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Decimal number: 8</h2>
 */

public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long octalNumber, decimalNumber = 0;
        int i = 0;

        System.out.print("Input octal number: ");
        octalNumber = input.nextLong();

        while (octalNumber != 0) {
            decimalNumber = (long) (decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber /= 10;
        }

        System.out.print("Decimal number: " + decimalNumber);
    }
}