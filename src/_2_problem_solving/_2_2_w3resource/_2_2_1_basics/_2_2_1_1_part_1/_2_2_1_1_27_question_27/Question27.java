package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_27_question_27;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a octal number to a hexadecimal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a octal number : 100</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Equivalent hexadecimal number: 40</h2>
 */

public class Question27 {
    public static void main(final String[] ARGS) {
        String octalNumber, hexadecimalNumber;
        int decimalNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Input an octal number : ");
        octalNumber = input.nextLine();

        decimalNumber = Integer.parseInt(octalNumber, 8);

        hexadecimalNumber = Integer.toHexString(decimalNumber);

        System.out.print("Equivalent hexadecimal number: " + hexadecimalNumber);
    }
}