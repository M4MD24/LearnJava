package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_3_insertion;

import java.util.Arrays;

public class InsertionExample {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(insertionSort(NUMBERS));
    }

    private static String insertionSort(final int[] ARRAY) {
        for (int firstIndex = 0; firstIndex < ARRAY.length; firstIndex++) {
            final int KEY = ARRAY[firstIndex];
            int secondIndex = firstIndex - 1;
            while (secondIndex >= 0 && ARRAY[secondIndex] > KEY) {
                ARRAY[secondIndex + 1] = ARRAY[secondIndex];
                secondIndex -= 1;
            }
            ARRAY[secondIndex + 1] = KEY;
        }
        return Arrays.toString(ARRAY);
    }
}