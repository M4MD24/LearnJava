package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_29;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a hexadecimal number into a binary number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Enter Hexadecimal Number: 37</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Equivalent Binary Number is: 110111</h2>
 */

public class Question29 {
    public static void main(final String[] ARGS) {
        int i = 1, j;
        int[] binaryNumber = new int[100];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number: ");
        String hexadecimalNumber = input.nextLine();

        int decimalNumber = hexadecimalToDecimal(hexadecimalNumber);

        while (decimalNumber != 0) {
            binaryNumber[i++] = decimalNumber % 2;
            decimalNumber /= 2;
        }

        System.out.print("Equivalent Binary Number is: ");
        for (j = i - 1; j > 0; j--) System.out.print(binaryNumber[j]);
    }

    public static int hexadecimalToDecimal(String stringValue) {
        String digits = "0123456789ABCDEF";
        stringValue = stringValue.toUpperCase();
        int val = 0;

        for (int i = 0; i < stringValue.length(); i++) {
            char c = stringValue.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        return val;
    }
}