package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_26;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert a octal number to a binary number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input any octal number: 7</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Equivalent binary number: 111</h2>
 */

public class Question26 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        int[] octalNumberValue = {0, 1, 10, 11, 100, 101, 110, 111};
        long octalNumber, tempOctalNumber, binaryNumber, place;
        int remainder;

        System.out.print("Input any octal number: ");
        octalNumber = input.nextLong();
        tempOctalNumber = octalNumber;
        binaryNumber = 0;
        place = 1;

        while (tempOctalNumber != 0) {
            remainder = (int)(tempOctalNumber % 10);
            binaryNumber = octalNumberValue[remainder] * place + binaryNumber;
            tempOctalNumber /= 10;
            place *= 1000;
        }

        System.out.print("Equivalent binary number: " + binaryNumber);
    }
}