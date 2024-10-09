package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_17;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to add two binary numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first binary number: 10
 * <br/>
 * Input second binary number: 11
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Sum of two binary numbers: 101</h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        long number1 = input.nextLong();

        System.out.print("Input second binary number: ");
        long number2 = input.nextLong();

        addingTwoBinaryNumbers(number1, number2);
    }

    private static void addingTwoBinaryNumbers(long number1, long number2) {
        int index = 0, remainder = 0;
        int[] sum = new int[20];

        while (number1 != 0 || number2 != 0) {
            sum[index++] = (int) ((number1 % 10 + number2 % 10 + remainder) % 2);
            remainder = (int) ((number1 % 10 + number2 % 10 + remainder) / 2);
            number1 /= 10;
            number2 /= 10;
        }
        if (remainder != 0) sum[index++] = remainder;

        --index;

        System.out.print("Sum of two binary numbers: ");
        while (index >= 0) System.out.print(sum[index--]);
    }
}