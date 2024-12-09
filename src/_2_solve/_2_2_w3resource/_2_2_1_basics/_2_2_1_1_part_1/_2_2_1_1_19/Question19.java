package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_19;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert an integer number to a binary number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a Decimal Number: 5</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Binary number is: 101</h2>
 */

public class Question19 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int number = input.nextInt();

        convertDecimalNumberToBinaryNumber(number);
    }

    private static void convertDecimalNumberToBinaryNumber(int integerNumber) {
        StringBuilder binaryNumber = new StringBuilder();
        while (integerNumber >= 0) {
            float number = integerNumber;
            if (number != 0) {
//                System.out.print(integerNumber + " | ");
                number /= 2;
                integerNumber /= 2;
                binaryNumber.append((number > integerNumber) ? "1" : "0");
//                System.out.printf(2 + " | " + "%s\n", (number > integerNumber) ? "1" : "0");
            } else {
                binaryNumber.reverse();
                System.out.printf("Binary number is: %s", Integer.parseInt(String.valueOf(binaryNumber)));
                break;
            }
        }
    }
}