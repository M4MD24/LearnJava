package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_30;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a hexadecimal value into an octal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a hexadecimal number: 40</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Equivalent of octal number is: 100</h2>
 */

public class Question30 {
    public static void main(final String[] ARGUMENTS) {
        final String hexadecimalNumber;
        int decimalNumber;
        int index = 1;
        int currentIndex;
        final int[] octalDigits = new int[100];
        final Scanner INPUT = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexadecimalNumber = INPUT.nextLine();

        decimalNumber = convertHexadecimalToDecimal(hexadecimalNumber);

        while (decimalNumber != 0) {
            octalDigits[index++] = decimalNumber % 8;
            decimalNumber /= 8;
        }

        System.out.print("Equivalent of octal number is: ");
        for (currentIndex = index - 1; currentIndex > 0; currentIndex--)
            System.out.print(octalDigits[currentIndex]);
    }

    public static int convertHexadecimalToDecimal(String hexadecimalString) {
        String hexadecimalDigits = "0123456789ABCDEF";
        hexadecimalString = hexadecimalString.toUpperCase();
        int decimalValue = 0;

        for (int currentIndex = 0; currentIndex < hexadecimalString.length(); currentIndex++) {
            char currentCharacter = hexadecimalString.charAt(currentIndex);
            int digitValue = hexadecimalDigits.indexOf(currentCharacter);
            decimalValue = 16 * decimalValue + digitValue;
        }

        return decimalValue;
    }
}