package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_9;

import java.util.Arrays;
import java.util.Random;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of positive integers using the BogoSort Sort Algorithm.</h2>
 */

public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(BogoSort(NUMBERS));
    }

    private static String BogoSort(final int[] ARRAY) {
        final Random RANDOM = new Random();
        while (!isSorted(ARRAY))
            shuffle(ARRAY, RANDOM);
        return Arrays.toString(ARRAY);
    }

    private static boolean isSorted(final int[] ARRAY) {
        for (int index = 0; index < ARRAY.length - 1; index++)
            if (ARRAY[index] > ARRAY[index + 1])
                return false;
        return true;
    }

    private static void shuffle(final int[] array, Random random) {
        for (int index = 0; index < array.length; index++) {
            final int RANDOM_INDEX = random.nextInt(array.length);
            final int TEMPORARY_NUMBER = array[index];
            array[index] = array[RANDOM_INDEX];
            array[RANDOM_INDEX] = TEMPORARY_NUMBER;
        }
    }
}