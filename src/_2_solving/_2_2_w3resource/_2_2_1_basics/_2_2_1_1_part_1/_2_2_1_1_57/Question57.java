package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_57;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to accept an integer and count the factors of the number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an integer: 25</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>3</h2>
 */

public class Question57 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int FIRST_NUMBER = input.nextInt();

        System.out.print(countFactors(FIRST_NUMBER));
    }

    private static int countFactors(final int FIRST_NUMBER) {
        int factorsCount = 0;
        for (int secondNumber = 1; secondNumber <= Math.sqrt(FIRST_NUMBER); secondNumber++) {
            if (FIRST_NUMBER % secondNumber == 0 && secondNumber * secondNumber != FIRST_NUMBER) factorsCount += 2;
            else if (secondNumber * secondNumber == FIRST_NUMBER) ++factorsCount;
        }
        return factorsCount;
    }
}