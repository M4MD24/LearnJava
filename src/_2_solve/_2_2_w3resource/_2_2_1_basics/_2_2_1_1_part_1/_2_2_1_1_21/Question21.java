package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_21;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a decimal number to an octal number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a Decimal Number: 15</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Octal number is: 17</h2>
 */

public class Question21 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int number = input.nextInt();

        convertDecimalNumberToOctalNumber(number);
    }

    private static void convertDecimalNumberToOctalNumber(int integerNumber) {
        StringBuilder hexadecimalNumber = new StringBuilder(integerNumber);
        while (integerNumber != 0) {
            int subtractiveNumber = integerNumber;
//            System.out.print(integerNumber + " | " + 8 + " | (");
            integerNumber /= 8;
            int productNumber = integerNumber;
            productNumber *= 8;
//            System.out.print(integerNumber + "*" + 8 + ") | " + "(" + subtractiveNumber + "-" + productNumber + ") | ");
            productNumber = subtractiveNumber - productNumber;
//            System.out.println(productNumber);
            hexadecimalNumber.append(productNumber);
        }
        hexadecimalNumber.reverse();
        System.out.print("Octal number is : " + hexadecimalNumber);
    }
}