package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_12;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that finds numbers greater than the average of an array.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array:
 * <br/>
 * [1, 4, 17, 7, 25, 3, 100]
 * <br/>
 * The average of the said array is: 22.428571428571427
 * <br/>
 * The numbers in the said array that are greater than the average are:
 * <br/>
 * 25
 * <br/>
 * 100
 * </h2>
 */

public class Question12 {
    private static final int[] NUMBERS = {1, 4, 17, 7, 25, 3, 100};
    private static long sumNumbers = 0;
    private static double average = 0;

    public static void main(final String[] ARGUMENTS) {
        System.out.printf("Original Array:\n%s\n", Arrays.toString(NUMBERS));
        printAverageNumbers();
        printNumbersGreaterThanAverage();
    }

    private static void printNumbersGreaterThanAverage() {
        Arrays.sort(NUMBERS);
        System.out.println("The numbers in the said array that are greater than the average are:");
        for (final int NUMBER : NUMBERS)
            if (NUMBER > average)
                System.out.println(NUMBER);
    }

    private static void printAverageNumbers() {
        for (final int NUMBER : NUMBERS)
            sumNumbers += NUMBER;
        average = (double) sumNumbers / NUMBERS.length;
        System.out.printf("The average of the said array is: %f\n", average);
    }
}