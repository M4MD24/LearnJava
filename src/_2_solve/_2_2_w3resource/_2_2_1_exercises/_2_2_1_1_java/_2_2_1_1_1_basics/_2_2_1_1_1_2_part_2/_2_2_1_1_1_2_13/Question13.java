package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_13;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that will accept an integer and convert it into a binary representation. Now count the number of bits equal to zero in this representation.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input first number: 25</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Binary representation of 25 is: 11001
 * <br/>
 * Number of zero bits: 2
 * </h2>
 */

public class Question13 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int FIRST_NUMBER = INPUT.nextInt();
    private static final String FIRST_NUMBER_AS_BINARY_NUMBER = Long.toBinaryString(FIRST_NUMBER);

    public static void main(final String[] ARGUMENTS) {
        printFirstNumber();
        printFirstNumberAsBinaryNumber();
        System.out.printf("Number of zero bits: %d", sumOfZeroNumbersBits());
    }

    private static long sumOfZeroNumbersBits() {
        int sumOfZeroNumbersBits = 0;
        for (int index = 0; index < FIRST_NUMBER_AS_BINARY_NUMBER.length(); index++)
            if (FIRST_NUMBER_AS_BINARY_NUMBER.charAt(index) == '0')
                sumOfZeroNumbersBits++;
        return sumOfZeroNumbersBits;
    }

    private static void printFirstNumberAsBinaryNumber() {
        System.out.printf("Binary representation of %d is: %s\n", FIRST_NUMBER, FIRST_NUMBER_AS_BINARY_NUMBER);
    }

    private static void printFirstNumber() {
        System.out.printf("Input first number: %d\n", FIRST_NUMBER);
    }
}