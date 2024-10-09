package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_20;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a decimal number to a hexadecimal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a decimal number: 15</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Hexadecimal number is: F</h2>
 */

public class Question20 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int number = input.nextInt();

        convertDecimalNumberToHexadecimalNumber(number);
    }

    private static void convertDecimalNumberToHexadecimalNumber(int integerNumber) {
        StringBuilder hexadecimalNumber = new StringBuilder(integerNumber);
        while (integerNumber != 0) {
            int subtractiveNumber = integerNumber;
//            System.out.print(integerNumber + " | " + 16 + " | (");
            integerNumber /= 16;
            int productNumber = integerNumber;
            productNumber *= 16;
//            System.out.print(integerNumber + "*" + 16 + ") | " + "(" + subtractiveNumber + "-" + productNumber + ") | ");
            productNumber = subtractiveNumber - productNumber;
            String digit = switch (productNumber) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> String.valueOf(productNumber);
            };
//            System.out.println(digit);
            hexadecimalNumber.append(digit);
        }
        hexadecimalNumber.reverse();
        System.out.print("Hexadecimal number is : " + hexadecimalNumber);
    }
}