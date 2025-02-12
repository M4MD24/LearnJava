package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_23;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a binary number to a hexadecimal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a Binary Number: 1101</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Hexadecimal value: D</h2>
 */

public class Question23 {
    public static void main(final String[] ARGUMENTS) {
        int[] hexadecimalNumber = new int[1000];
        Scanner input = new Scanner(System.in);
        int i = 1, j = 0, remainder, decimal = 0, binary;

        System.out.print("Input a Binary Number: ");
        binary = input.nextInt();

        while (binary > 0) {
            remainder = binary % 2;
            decimal += remainder * i;
            i *= 2;
            binary /= 10;
        }
        i = 0;

        while (decimal != 0) {
            hexadecimalNumber[i] = decimal % 16;
            decimal /= 16;
            i++;
        }

        System.out.print("Hexadecimal value: ");
        for (j = i - 1; j >= 0; j--) {
            if (hexadecimalNumber[j] > 9) System.out.print((char) (hexadecimalNumber[j] + 55));
            else System.out.print(hexadecimalNumber[j]);
        }
    }
}