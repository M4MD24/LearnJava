package _1_learning._1_6_algorithms._1_6_2_sort._1_6_2_5_merge;

import java.util.Arrays;

public class MergeExample {
    public static void main(final String[] ARGS) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(mergeSorting(numbers, 0, numbers.length - 1));
    }

    private static String mergeSorting(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSorting(array, left, mid);
            mergeSorting(array, mid + 1, right);
            merge(array, left, mid, right);
        }
        return Arrays.toString(array);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int number1 = mid - left + 1,
                number2 = right - mid;

        int[] leftArray = new int[number1],
                rightArray = new int[number2];

        for (int index = 0; index < number1; index++) leftArray[index] = array[left + index];
        for (int index = 0; index < number2; index++) rightArray[index] = array[mid + 1 + index];

        int index1 = 0,
                index2 = 0,
                index3 = left;

        while (index1 < number1 && index2 < number2) {
            if (leftArray[index1] <= rightArray[index2]) {
                array[index3] = leftArray[index1];
                index1++;
            } else {
                array[index3] = rightArray[index2];
                index2++;
            }
            index3++;
        }

        while (index1 < number1) {
            array[index3] = leftArray[index1];
            index1++;
            index3++;
        }
        while (index2 < number2) {
            array[index3] = rightArray[index2];
            index2++;
            index3++;
        }
    }
}