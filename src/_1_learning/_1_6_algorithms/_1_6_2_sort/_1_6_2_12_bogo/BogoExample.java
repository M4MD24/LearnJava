package _1_learning._1_6_algorithms._1_6_2_sort._1_6_2_12_bogo;

import java.util.Arrays;

public class BogoExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {30, 28, 37, 5, 28, 9, 14, 14, 22, 39};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        System.out.print("After Shell Sort: " + beadSort(NUMBERS));
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