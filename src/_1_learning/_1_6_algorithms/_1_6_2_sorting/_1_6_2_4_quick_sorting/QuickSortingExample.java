package _1_learning._1_6_algorithms._1_6_2_sorting._1_6_2_4_quick_sorting;

import java.util.Arrays;

public class QuickSortingExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(quickSorting(numbers, 0, numbers.length - 1));
    }

    private static String quickSorting(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSorting(array, low, pivot - 1);
            quickSorting(array, pivot + 1, high);
        }
        return Arrays.toString(array);
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high],
                index = low - 1;
        for (int index2 = low; index2 < high; index2++)
            if (array[index2] < pivot) {
                index++;
                int temp = array[index];
                array[index] = array[index2];
                array[index2] = temp;
            }
        int temp = array[index + 1];
        array[index + 1] = array[high];
        array[high] = temp;
        return index + 1;
    }
}