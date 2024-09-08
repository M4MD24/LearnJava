package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_62;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number : 15
 * <br/>
 * Input second number: 20
 * <br/>
 * Input third number : 25
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>false</h2>
 */

public class Question62 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Input third number: ");
        int thirdNumber = input.nextInt();

        boolean ifOneIs20OrMoreCondition = Math.abs(firstNumber - secondNumber) >= 20 ||
                Math.abs(secondNumber - thirdNumber) >= 20 ||
                Math.abs(thirdNumber - firstNumber) >= 20;
        System.out.print(ifOneIs20OrMoreCondition);
    }
}