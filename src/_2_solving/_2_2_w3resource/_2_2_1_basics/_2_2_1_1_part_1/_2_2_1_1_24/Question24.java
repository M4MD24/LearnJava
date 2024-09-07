package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_24;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a binary number to an octal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a Binary Number: 111</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Octal number: 7</h2>
 */

public class Question24 {
    public static void main(final String[] PARAMETERS) {
        int binaryNumber, remainder, decimalNumber = 0, quot, i = 1, j;
        int[] octalNumber = new int[100];
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Binary Number : ");
        binaryNumber = input.nextInt();

        while (binaryNumber > 0) {
            remainder = binaryNumber % 10;
            decimalNumber += remainder * i;
            i = i * 2;
            binaryNumber /= 10;
        }

        i = 1;
        quot = decimalNumber;

        while (quot > 0) {
            octalNumber[i++] = quot % 8;
            quot /= 8;
        }

        for (j = i - 1; j > 0; j--) System.out.print("Octal number is: " + octalNumber[j]);
    }
}