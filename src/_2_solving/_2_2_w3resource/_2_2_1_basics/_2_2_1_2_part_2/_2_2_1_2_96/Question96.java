package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_96;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Let us use the letter H to mean "hundred", the letter T to mean "ten" and “1, 2, . . . n” to represent the one digit n (<10). Using the given format, write a Java program that converts 3 digits positive numbers. For example, 234 should be output as BBSSS1234 because it has 2 "hundreds", 3 "ten", and 4 ones.
 * <br/>
 * The student name and id are all strings of no more than 10 characters. The score is an integer between 0 and 100.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a positive number(max three digits):
 * <br/>
 * 235
 * <br/>
 * Result:
 * <br/>
 * HHTTT12345
 * </h2>
 */

public class Question96 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input a positive number (max three digits): ");
        final short DIGITS = INPUT.nextShort();
        System.out.println("\nResult:");
        printText(DIGITS);
    }

    private static void printText(short digits) {
        final StringBuilder ONES = new StringBuilder();
        addOnes(digits, ONES);
        digits /= 10;
        String TENS = "T".repeat(digits % 10);
        digits /= 10;
        String HUNDREDS = "H".repeat(digits);
        System.out.print(HUNDREDS + TENS + ONES);
    }

    private static void addOnes(short digits, StringBuilder ONES) {
        for (int index = 1; index <= digits % 10; index++)
            ONES.append(index);
    }
}