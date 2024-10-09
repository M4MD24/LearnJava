package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_8;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of positive integers using the Bead Sort Algorithm.</h2>
 */

public class Question8 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(beadSort(NUMBERS));
    }

    private static String beadSort(final int[] ARRAY) {
        final int MAXIMUM_NUMBER = Arrays.stream(ARRAY)
                .max()
                .getAsInt();
        final int[][] BEADS = new int[ARRAY.length][MAXIMUM_NUMBER];
        for (int row = 0; row < ARRAY.length; row++)
            for (int column = 0; column < ARRAY[row]; column++)
                BEADS[row][column] = 1;
        for (int column = 0; column < MAXIMUM_NUMBER; column++) {
            int sum = 0;
            for (int row = 0; row < ARRAY.length; row++) {
                sum += BEADS[row][column];
                BEADS[row][column] = 0;
            }
            for (int row = ARRAY.length - 1; row >= ARRAY.length - sum; row--)
                ARRAY[row] = column + 1;
        }
        return Arrays.toString(ARRAY);
    }
}