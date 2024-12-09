package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_14_comb;

import java.util.Arrays;

public class CombExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(combSort(NUMBERS));
    }

    private static String combSort(final int[] ARRAY) {
        final int MAXIMUM_LENGTH = ARRAY.length;
        int gap = MAXIMUM_LENGTH;
        boolean swapped = true;
        final double SHRINK = 1.3;
        while (gap > 1 || swapped) {
            gap = (int) (gap / SHRINK);
            if (gap < 1)
                gap = 1;
            swapped = false;
            for (int index = 0; index + gap < MAXIMUM_LENGTH; index++)
                if (ARRAY[index] > ARRAY[index + gap]) {
                    final int TEMPORARY_ELEMENT = ARRAY[index];
                    ARRAY[index] = ARRAY[index + gap];
                    ARRAY[index + gap] = TEMPORARY_ELEMENT;
                    swapped = true;
                }
        }
        return Arrays.toString(ARRAY);
    }
}