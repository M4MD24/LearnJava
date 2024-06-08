package _1_learning._1_6_algorithms._1_6_2_sort._1_6_2_4_quick;

import java.util.Arrays;

public class QuickExample {
    public static void main(final String[] ARGS) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(quickSorting(numbers, 0, numbers.length - 1));
    }

    private static String quickSorting(final int[] ARRAY, final int LOW, final int HIGH) {
        if (LOW < HIGH) {
            final int PIVOT = partition(ARRAY, LOW, HIGH);
            quickSorting(ARRAY, LOW, PIVOT - 1);
            quickSorting(ARRAY, PIVOT + 1, HIGH);
        }
        return Arrays.toString(ARRAY);
    }

    private static int partition(final int[] ARRAY, final int LOW, final int HIGH) {
        int pivot = ARRAY[HIGH],
                index = LOW - 1;
        for (int index2 = LOW; index2 < HIGH; index2++)
            if (ARRAY[index2] < pivot) {
                index++;
                final int TEMPORARY_NUMBER = ARRAY[index];
                ARRAY[index] = ARRAY[index2];
                ARRAY[index2] = TEMPORARY_NUMBER;
            }
        final int TEMPORARY_NUMBER = ARRAY[index + 1];
        ARRAY[index + 1] = ARRAY[HIGH];
        ARRAY[HIGH] = TEMPORARY_NUMBER;
        return index + 1;
    }
}