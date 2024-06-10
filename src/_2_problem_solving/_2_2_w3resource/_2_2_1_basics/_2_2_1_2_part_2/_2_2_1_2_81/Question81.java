package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the difference between the largest integer and the smallest integer. These integers are created by 8 numbers from 0 to 9. The number that can be rearranged starts with 0 as in 00135668.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an integer created by 8 numbers from 0 to 9:
 * <br/>
 * 56789432
 * <br/>
 * Difference between the largest and the smallest integer from the given integer:
 * <br/>
 * 75308643
 * </h2>
 */

public class Question81 {
    public static void main(final String[] ARGS) {
        System.out.println("Input an integer created by 8 numbers from 0 to 9:");
        final int NUMBER = 56789432;
        System.out.println(NUMBER);
        System.out.println("Difference between the largest and the smallest integer from the given integer:");
        int smallestNumber = getSmallestNumber(NUMBER),
                biggestNumber = getBiggestNumber(NUMBER);
        if (smallestNumber > biggestNumber) {
            smallestNumber += biggestNumber;
            biggestNumber = smallestNumber - biggestNumber;
            smallestNumber -= biggestNumber;
        }
        System.out.print(biggestNumber - smallestNumber);
    }

    private static int getBiggestNumber(final int NUMBER) {
        final ArrayList<Integer> DIGITS = new ArrayList<>();
        addNumbers(DIGITS, NUMBER);
        DIGITS.sort(Collections.reverseOrder());
        final StringBuilder NUMBERS = new StringBuilder();
        for (final int DIGIT : DIGITS)
            NUMBERS.append(DIGIT);
        return Integer.parseInt(NUMBERS.toString());
    }

    private static void addNumbers(final ArrayList<Integer> DIGITS, int number) {
        DIGITS.add(number % 10);
        number /= 10;
        DIGITS.add(number % 10);
        number /= 10;
        DIGITS.add(number % 10);
        number /= 10;
        DIGITS.add(number % 10);
        number /= 10;
        DIGITS.add(number % 10);
        number /= 10;
        DIGITS.add(number % 10);
        number /= 10;
        DIGITS.add(number % 10);
        number /= 10;
        DIGITS.add(number % 10);
    }

    private static int getSmallestNumber(final int NUMBER) {
        final char[] DIGITS = String.valueOf(NUMBER).toCharArray();
        Arrays.sort(DIGITS);
        return Integer.parseInt(new String(DIGITS));
    }
}