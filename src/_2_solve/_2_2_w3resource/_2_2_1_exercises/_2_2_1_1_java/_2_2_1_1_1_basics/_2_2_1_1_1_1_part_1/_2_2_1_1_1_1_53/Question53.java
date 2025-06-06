package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_53;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first number: 5
 * <br/>
 * Input second number: 5
 * <br/>
 * Input third number: 15
 * <br/>
 * Input boolean value: true
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>The result is: true</h2>
 */

public class Question53 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int NUMBER_1 = input.nextInt();

        System.out.print("Input second number: ");
        final int NUMBER_2 = input.nextInt();

        System.out.print("Input third number: ");
        final int NUMBER_3 = input.nextInt();

        System.out.print("Input a boolean value (true/false): ");
        final boolean BOOLEAN_VALUE = input.nextBoolean();

        boolean result = (BOOLEAN_VALUE) ? (NUMBER_3 > NUMBER_2) : (NUMBER_2 > NUMBER_1) && (NUMBER_3 > NUMBER_2);
        System.out.print("The result is: " + result);
    }
}