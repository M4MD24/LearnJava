package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_28;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a hexadecimal value into a decimal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a hexadecimal number: 25</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Equivalent decimal number is: 37</h2>
 */

public class Question28 {
    public static void main(final String[] ARGUMENTS) {
        String hexadecimalNumber;
        int decimalNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexadecimalNumber = input.nextLine();

        decimalNumber = hexadecimalToDecimal(hexadecimalNumber);

        System.out.print("Equivalent decimal number is: " + decimalNumber);
    }

    public static int hexadecimalToDecimal(String stringValue) {
        String digits = "0123456789ABCDEF";
        stringValue = stringValue.toUpperCase();
        int val = 0;

        for (int i = 0; i < stringValue.length(); i++) {
            char c = stringValue.charAt(i);
            int d = digits.indexOf(c);
            val = val * 16 + d;
        }

        return val;
    }
}