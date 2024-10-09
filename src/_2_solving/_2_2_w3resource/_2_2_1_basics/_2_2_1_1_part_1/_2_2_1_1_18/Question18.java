package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_18;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to multiply two binary numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first binary number: 10
 * <br/>
 * Input second binary number: 11
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Product of two binary numbers: 101</h2>
 */

public class Question18 {
    public static void main(final String[] PARAMETERS) {
        long multiply = 0;
        int digit, factor = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        long number1 = input.nextLong();

        System.out.print("Input the second binary number: ");
        long number2 = input.nextLong();

        while (number2 != 0) {
            digit = (int) (number2 % 10);
            if (digit == 1) {
                number1 *= factor;
                multiply = productTwoBinaryNumbers((int) number1, (int) multiply);
            } else number1 *= factor;
            number2 /= 10;
            factor = 10;
        }

        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }

    static int productTwoBinaryNumbers(int number1, int number2) {
        int index = 0, remainder = 0, productResult = 0;
        int[] sum = new int[20];

        while (number1 != 0 || number2 != 0) {
            sum[index++] = (number1 % 10 + number2 % 10 + remainder) % 2;
            remainder = (number1 % 10 + number2 % 10 + remainder) / 2;
            number1 = number1 / 10;
            number2 = number2 / 10;
        }

        if (remainder != 0) sum[index++] = remainder;

        --index;

        while (index >= 0) productResult = productResult * 10 + sum[index--];

        return productResult;
    }
}