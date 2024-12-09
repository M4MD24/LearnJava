package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_interface._2_2_5_6_11;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending order. Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method.</h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        quickSort();
        mergeSort();
    }

    private static void mergeSort() {
        final int[] NUMBERS = {68, 34, 31, 14, 66, 100, 85, 20, 81, 14, 0};
        final Sortable MERGE_SORT = new MergeSort();
        MERGE_SORT.sort(NUMBERS);
        System.out.print("Merge Sort: " + Arrays.toString(NUMBERS));
    }

    private static void quickSort() {
        final int[] NUMBERS = {68, 34, 31, 14, 66, 100, 85, 20, 81, 14, 0};
        final Sortable QUICK_SORT = new QuickSort();
        QUICK_SORT.sort(NUMBERS);
        System.out.println("Quick Sort: " + Arrays.toString(NUMBERS));
    }
}

interface Sortable {
    void sort(final int[] ARRAY);
}

class QuickSort implements Sortable {
    @Override
    public void sort(final int[] ARRAY) {
        quickSorting(ARRAY, 0, ARRAY.length - 1);
    }

    private static void quickSorting(final int[] ARRAY, final int LOW, final int HIGH) {
        if (LOW < HIGH) {
            final int PIVOT = partition(ARRAY, LOW, HIGH);
            quickSorting(ARRAY, LOW, PIVOT - 1);
            quickSorting(ARRAY, PIVOT + 1, HIGH);
        }
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

class MergeSort implements Sortable {
    @Override
    public void sort(final int[] ARRAY) {
        mergeSorting(ARRAY, 0, ARRAY.length - 1);
    }

    private static void mergeSorting(final int[] ARRAY, final int LEFT, final int RIGHT) {
        if (LEFT < RIGHT) {
            final int MIDDLE = (LEFT + RIGHT) / 2;
            mergeSorting(ARRAY, LEFT, MIDDLE);
            mergeSorting(ARRAY, MIDDLE + 1, RIGHT);
            merge(ARRAY, LEFT, MIDDLE, RIGHT);
        }
    }

    private static void merge(final int[] ARRAY, final int LEFT, final int MIDDLE, final int RIGHT) {
        final int NUMBER_1 = MIDDLE - LEFT + 1,
                NUMBER_2 = RIGHT - MIDDLE;
        final int[] LEFT_ARRAY = new int[NUMBER_1],
                RIGHT_ARRAY = new int[NUMBER_2];
        System.arraycopy(ARRAY, LEFT, LEFT_ARRAY, 0, NUMBER_1);
        for (int index = 0; index < NUMBER_2; index++)
            RIGHT_ARRAY[index] = ARRAY[MIDDLE + 1 + index];
        int index1 = 0,
                index2 = 0,
                index3 = LEFT;
        while (index1 < NUMBER_1 && index2 < NUMBER_2) {
            if (LEFT_ARRAY[index1] <= RIGHT_ARRAY[index2])
                ARRAY[index3] = LEFT_ARRAY[index1++];
            else
                ARRAY[index3] = RIGHT_ARRAY[index2++];
            index3++;
        }
        while (index1 < NUMBER_1)
            ARRAY[index3++] = LEFT_ARRAY[index1++];
        while (index2 < NUMBER_2)
            ARRAY[index3++] = RIGHT_ARRAY[index2++];
    }
}