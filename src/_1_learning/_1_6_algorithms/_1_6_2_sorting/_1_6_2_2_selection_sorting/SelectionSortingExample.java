package _1_learning._1_6_algorithms._1_6_2_sorting._1_6_2_2_selection_sorting;

import java.util.Arrays;

public class SelectionSortingExample {
    public static void main(final String[] ARGS) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(selectionSorting(numbers));
    }

    private static String selectionSorting(int[] array) {
        final int LENGTH = array.length;
        int minimumIndex,
                temporaryVariable;
        for (int index = 0; index < LENGTH - 1; index++) {
            minimumIndex = index;
            for (int index2 = index + 1; index2 < LENGTH; index2++)
                if (array[minimumIndex] > array[index2]) minimumIndex = index2;
            temporaryVariable = array[minimumIndex];
            array[minimumIndex] = array[index];
            array[index] = temporaryVariable;
        }
        return Arrays.toString(array);
    }
}