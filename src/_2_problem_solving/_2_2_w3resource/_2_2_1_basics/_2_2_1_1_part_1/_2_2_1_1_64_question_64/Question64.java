package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_64_question_64;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the first number: 35
 * <br/>
 * Input the second number: 45
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Result: true</h2>
 */

public class Question64 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        System.out.println("Note: enter values between 25:75");
        while (true) {
            System.out.print("Input first number: ");
            byte FIRST_NUMBER = input.nextByte();
            System.out.print("Input second number: ");
            byte SECOND_NUMBER = input.nextByte();
            if ((FIRST_NUMBER >= 25 && FIRST_NUMBER <= 75) && (SECOND_NUMBER >= 25 && SECOND_NUMBER <= 75)) {
                System.out.print("Result: " + ifCommonDigitInBothNumbers(FIRST_NUMBER, SECOND_NUMBER));
                break;
            } else System.out.println("\nNote: enter values between 25:75");
        }
    }

    private static boolean ifCommonDigitInBothNumbers(final byte FIRST_NUMBER, byte SECOND_NUMBER) {
        byte firstDigitOfFirstNumber = (byte) (FIRST_NUMBER / 10),
                lastDigitOfFirstNumber = (byte) (FIRST_NUMBER % 10),
                firstDigitOfSecondNumber = (byte) (SECOND_NUMBER / 10),
                lastDigitOfSecondNumber = (byte) (SECOND_NUMBER % 10);

        return ((firstDigitOfFirstNumber == firstDigitOfSecondNumber) ||
                (firstDigitOfFirstNumber == lastDigitOfSecondNumber) ||
                (lastDigitOfFirstNumber == firstDigitOfSecondNumber) ||
                (lastDigitOfFirstNumber == lastDigitOfSecondNumber));
    }
}