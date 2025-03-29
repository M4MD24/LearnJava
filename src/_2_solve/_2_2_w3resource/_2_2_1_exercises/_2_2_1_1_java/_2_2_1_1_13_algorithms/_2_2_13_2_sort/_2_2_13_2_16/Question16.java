package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_13_algorithms._2_2_13_2_sort._2_2_13_2_16;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers Shell Sort Algorithm.</h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(shellSort(NUMBERS));
    }

    private static String shellSort(final int[] NUMBERS) {
        final int LENGTH = NUMBERS.length;
        for (int interval = LENGTH / 2; interval > 0; interval /= 2)
            for (int currentIndex = interval; currentIndex < LENGTH; currentIndex += 1) {
                final int TEMPORARY_NUMBER = NUMBERS[currentIndex];
                int currentPosition;
                for (currentPosition = currentIndex; currentPosition >= interval && NUMBERS[currentPosition - interval] > TEMPORARY_NUMBER; currentPosition -= interval)
                    NUMBERS[currentPosition] = NUMBERS[currentPosition - interval];
                NUMBERS[currentPosition] = TEMPORARY_NUMBER;
            }
        return Arrays.toString(NUMBERS);
    }
}