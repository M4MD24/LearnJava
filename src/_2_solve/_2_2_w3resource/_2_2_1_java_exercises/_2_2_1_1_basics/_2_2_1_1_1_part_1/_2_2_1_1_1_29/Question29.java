package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_29;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a hexadecimal number into a binary number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Enter Hexadecimal Number: 37</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Equivalent Binary Number is: 110111</h2>
 */

public class Question29 {
    public static void main(final String[] ARGUMENTS) {
        int binaryIndex = 1,
                currentIndex;
        final int[] BINARY_REPRESENTATION = new int[100];
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number: ");
        final String HEXADECIMAL_NUMBER = inputScanner.nextLine();

        int decimalEquivalent = convertHexadecimalToDecimal(HEXADECIMAL_NUMBER);

        while (decimalEquivalent != 0) {
            BINARY_REPRESENTATION[binaryIndex++] = decimalEquivalent % 2;
            decimalEquivalent /= 2;
        }

        System.out.print("Equivalent Binary Number is: ");
        for (currentIndex = binaryIndex - 1; currentIndex > 0; currentIndex--)
            System.out.print(BINARY_REPRESENTATION[currentIndex]);
    }

    public static int convertHexadecimalToDecimal(String hexadecimalValue) {
        String validHexadecimalDigits = "0123456789ABCDEF";
        hexadecimalValue = hexadecimalValue.toUpperCase();
        int decimalResult = 0;
        for (int characterIndex = 0; characterIndex < hexadecimalValue.length(); characterIndex++) {
            char currentCharacter = hexadecimalValue.charAt(characterIndex);
            int digitValue = validHexadecimalDigits.indexOf(currentCharacter);
            decimalResult = 16 * decimalResult + digitValue;
        }
        return decimalResult;
    }
}