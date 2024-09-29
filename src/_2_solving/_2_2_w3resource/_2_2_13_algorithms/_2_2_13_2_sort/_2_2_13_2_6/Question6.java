package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_6;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Selection Sort Algorithm.</h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(selectionSorting(NUMBERS));
    }

    private static String selectionSorting(final int[] ARRAY) {
        final int LENGTH = ARRAY.length;
        int minimumIndex,
                temporaryVariable;
        for (int index = 0; index < LENGTH - 1; index++) {
            minimumIndex = index;
            for (int index2 = index + 1; index2 < LENGTH; index2++)
                if (ARRAY[minimumIndex] > ARRAY[index2]) minimumIndex = index2;
            temporaryVariable = ARRAY[minimumIndex];
            ARRAY[minimumIndex] = ARRAY[index];
            ARRAY[index] = temporaryVariable;
        }
        return Arrays.toString(ARRAY);
    }
}