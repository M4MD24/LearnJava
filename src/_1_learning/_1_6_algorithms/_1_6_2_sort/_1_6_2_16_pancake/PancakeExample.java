package _1_learning._1_6_algorithms._1_6_2_sort._1_6_2_16_pancake;

import java.util.Arrays;

public class PancakeExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(pancakeSort(NUMBERS));
    }

    private static String pancakeSort(final int[] NUMBERS) {
        int index = 0;
        while (index < NUMBERS.length)
            if (index == 0 || NUMBERS[index] >= NUMBERS[index - 1])
                index++;
            else {
                final int TEMPORARY_ELEMENT = NUMBERS[index];
                NUMBERS[index] = NUMBERS[index - 1];
                NUMBERS[--index] = TEMPORARY_ELEMENT;
            }
        return Arrays.toString(NUMBERS);
    }
}