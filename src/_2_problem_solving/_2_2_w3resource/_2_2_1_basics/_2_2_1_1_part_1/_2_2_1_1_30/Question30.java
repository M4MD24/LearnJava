package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_30;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a hexadecimal value into an octal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a hexadecimal number: 40</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Equivalent of octal number is: 100</h2>
 */

public class Question30 {
    public static void main(String args[]) {
        String hexadecimalNumber;
        int decimalNumber, i = 1, j;
        int[] octalNumber = new int[100];
        Scanner input = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexadecimalNumber = input.nextLine();

        decimalNumber = hexadecimalToOctal(hexadecimalNumber);

        while (decimalNumber != 0) {
            octalNumber[i++] = decimalNumber % 8;
            decimalNumber /= 8;
        }

        System.out.print("Equivalent of octal number is: ");
        for (j = i - 1; j > 0; j--) System.out.print(octalNumber[j]);
    }

    public static int hexadecimalToOctal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        return val;
    }
}