package _1_learning._1_6_algorithms._1_6_2_sorting._1_6_2_1_bubble_sorting;

import java.util.Arrays;

public class BubbleSortingExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(bubbleSorting(numbers));
    }

    private static String bubbleSorting(int[] array) {
        final int LENGTH = array.length;
        for (int index = 0; index < LENGTH; index++) {
            for (int index2 = 0; index2 < LENGTH - 1; index2++) {
                final int FIRST_NUMBER = index2,
                        SECOND_NUMBER = index2 + 1;
                if (array[FIRST_NUMBER] > array[SECOND_NUMBER]) {
                    array[FIRST_NUMBER] += array[SECOND_NUMBER];
                    array[SECOND_NUMBER] = array[FIRST_NUMBER] - array[SECOND_NUMBER];
                    array[FIRST_NUMBER] -= array[SECOND_NUMBER];
                }
            }
        }
        return Arrays.toString(array);
    }
}