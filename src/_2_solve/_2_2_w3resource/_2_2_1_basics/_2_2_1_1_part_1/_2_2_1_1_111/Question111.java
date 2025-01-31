package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_111;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to add two numbers without arithmetic operators. Given x = 10 and y = 12; result = 22</h2>
 */

public class Question111 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int FIRST_NUMBER = input.nextInt();

        System.out.print("Input second number: ");
        int SECOND_NUMBER = input.nextInt();

        while (SECOND_NUMBER != 0) {
            final int CARRY = FIRST_NUMBER & SECOND_NUMBER;
            FIRST_NUMBER ^= SECOND_NUMBER;
            SECOND_NUMBER = CARRY << 1;
        }

        System.out.print("Sum: " + FIRST_NUMBER);
    }
}