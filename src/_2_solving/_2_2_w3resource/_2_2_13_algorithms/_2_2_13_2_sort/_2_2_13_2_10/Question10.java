package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_10;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to sort an array of positive integers using the Cocktail sort algorithm.</h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(cocktailSort(NUMBERS));
    }

    private static String cocktailSort(final int[] ARRAY) {
        boolean isSwapped = true;
        int start = 0,
                end = ARRAY.length - 1;
        while (isSwapped) {
            isSwapped = false;
            for (int index = start; index < end; index++)
                if (ARRAY[index] > ARRAY[index + 1]) {
                    final int TEMPORARY_ELEMENT = ARRAY[index];
                    ARRAY[index] = ARRAY[index + 1];
                    ARRAY[index + 1] = TEMPORARY_ELEMENT;
                    isSwapped = true;
                }
            if (!isSwapped)
                break;
            else {
                isSwapped = false;
                end--;
                for (int index = end; index > start; index--)
                    if (ARRAY[index] < ARRAY[index - 1]) {
                        final int TEMPORARY_ELEMENT = ARRAY[index];
                        ARRAY[index] = ARRAY[index - 1];
                        ARRAY[index - 1] = TEMPORARY_ELEMENT;
                        isSwapped = true;
                    }
                start++;
            }
        }
        return Arrays.toString(ARRAY);
    }
}