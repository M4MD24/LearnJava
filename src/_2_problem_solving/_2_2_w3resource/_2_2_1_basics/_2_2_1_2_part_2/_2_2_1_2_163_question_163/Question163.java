package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_163_question_163;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
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

public class Question163 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int FIRST_NUMBER = INPUT.nextInt();
    private static final String FIRST_NUMBER_AS_BINARY_NUMBER = Long.toBinaryString(FIRST_NUMBER);

    public static void main(final String[] ARGS) {
        printFirstNumber();
        printFirstNumberAsBinaryNumber();
        System.out.print(STR."Number of zero bits: \{sumOfZeroNumbersBits()}");
    }

    private static long sumOfZeroNumbersBits() {
        int sumOfZeroNumbersBits = 0;
        for (int index = 0; index < FIRST_NUMBER_AS_BINARY_NUMBER.length(); index++)
            if (FIRST_NUMBER_AS_BINARY_NUMBER.charAt(index) == '0')
                sumOfZeroNumbersBits++;
        return sumOfZeroNumbersBits;
    }

    private static void printFirstNumberAsBinaryNumber() {
        System.out.println(STR."Binary representation of \{FIRST_NUMBER} is: \{FIRST_NUMBER_AS_BINARY_NUMBER}");
    }

    private static void printFirstNumber() {
        System.out.println(STR."Input first number: \{FIRST_NUMBER}");
    }
}