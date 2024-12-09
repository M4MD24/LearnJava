package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_63;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Example 1:</h2>
 * <h3>
 * Input the first number : 12
 * <br/>
 * Input the second number: 13
 * </h3>
 * <h2>Example 2:</h2>
 * <h3>
 * Input the first number : 12
 * <br/>
 * Input the second number: 12
 * </h3>
 * <h2>Example 3:</h2>
 * <h3>
 * Input the first number : 6
 * <br/>
 * Input the second number: 18
 * </h3>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Example 1:</h2>
 * <h3>Result: 13</h3>
 * <h2>Example 2:</h2>
 * <h3>Result: 0</h3>
 * <h2>Example 3:</h2>
 * <h3>Result: 18</h3>
 */

public class Question63 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        final int FIRST_NUMBER = input.nextInt();

        System.out.print("Input second number: ");
        final int SECOND_NUMBER = input.nextInt();

        System.out.print(compareBetweenTwoNumbers(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static int compareBetweenTwoNumbers(int FIRST_NUMBER, int SECOND_NUMBER) {
        return (FIRST_NUMBER == SECOND_NUMBER) ? 0 : Math.max(FIRST_NUMBER, SECOND_NUMBER);
    }
}