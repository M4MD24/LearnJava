package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_15_gnome;

import java.util.Arrays;

public class GnomeExample {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(gnomeSort(NUMBERS));
    }

    private static String gnomeSort(final int[] NUMBERS) {
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