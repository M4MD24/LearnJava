package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_10_sort_an_array;

import java.util.Arrays;

public class SortAnArray {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 5, 2, 4, 3};
        sortArray(NUMBERS);
        System.out.print(Arrays.toString(NUMBERS));
    }

    private static void sortArray(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
    }
}