package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_2_selection;

import java.util.Arrays;

public class SelectionExample {
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