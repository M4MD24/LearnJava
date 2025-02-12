package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_13_algorithms._2_2_13_2_sort._2_2_13_2_13;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Gnome sort algorithm.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(gnomeSort(NUMBERS));
    }

    private static String gnomeSort(final int[] NUMBERS) {
        int index = 0;
        while (index < NUMBERS.length)
            if (index == 0 || NUMBERS[index] >= NUMBERS[index - 1])
                index++;
            else {
                final int TEMPORARY_ELEMENT = NUMBERS[index];
                NUMBERS[index] = NUMBERS[index - 1];
                NUMBERS[--index] = TEMPORARY_ELEMENT;
            }
        return Arrays.toString(NUMBERS);
    }
}