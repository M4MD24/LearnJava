package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_2_numbers._2_2_1_4_2_23;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to find all narcissistic numbers between 1 and 1000.
 * <br/>
 * In number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
 * <br/>
 * For example:
 * <br/>
 * 153 = 13 + 53 + 33
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 4
 * <br/>
 * 5
 * <br/>
 * 6
 * <br/>
 * 7
 * <br/>
 * 8
 * <br/>
 * 9
 * <br/>
 * 153
 * <br/>
 * 370
 * <br/>
 * 371
 * <br/>
 * 407
 * </h2>
 */
public class Question23 {
    private static final ArrayList<Short> NARCISSISTIC_NUMBERS = new ArrayList<>();

    public static void main(final String[] ARGUMENTS) {
        getNarcissisticNumbersBetween1And1000();
        printNarcissisticNumbers();
    }

    private static void getNarcissisticNumbersBetween1And1000() {
        for (short originalNumber = 1; originalNumber < 1000; originalNumber++) {
            final short POWER_OF_NUMBER = (short) String.valueOf(originalNumber).length();
            if (getNumberOfProductOfPowerNumber(originalNumber, POWER_OF_NUMBER) == originalNumber)
                NARCISSISTIC_NUMBERS.add(originalNumber);
        }
    }

    private static int getNumberOfProductOfPowerNumber(short number, final short POWER_OF_NUMBER) {
        int sum = 0;
        while (number != 0) {
            sum += (int) Math.pow(number % 10, POWER_OF_NUMBER);
            number /= 10;
        }
        return sum;
    }

    private static void printNarcissisticNumbers() {
        for (final int NARCISSISTIC_NUMBER : NARCISSISTIC_NUMBERS)
            System.out.println(NARCISSISTIC_NUMBER);
    }
}