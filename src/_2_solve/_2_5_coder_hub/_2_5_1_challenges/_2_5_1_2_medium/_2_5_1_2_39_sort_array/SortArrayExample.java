package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_39_sort_array;

import java.util.Arrays;

public class SortArrayExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getSortArray(new int[]{63, 12, 43, 56, 12}, "B")));
        System.out.println(Arrays.toString(getSortArray(new int[]{88, 12, 23, 59, 1, 24}, "S")));
        System.out.println(Arrays.toString(getSortArray(new int[]{100, 23, 200, 23, 1}, "B")));
        System.out.print(Arrays.toString(getSortArray(new int[]{99, 88, 774, 2}, "S")));
    }

    private static int[] getSortArray(final int[] NUMBERS, final String CHARACTER_OPERATOR_FOR_SORT) {
        Arrays.sort(NUMBERS);
        if (CHARACTER_OPERATOR_FOR_SORT.equals("B"))
            for (int index = 0; index < NUMBERS.length / 2; index++) {
                final int TEMPORARY_NUMBER = NUMBERS[index];
                NUMBERS[index] = NUMBERS[NUMBERS.length - 1 - index];
                NUMBERS[NUMBERS.length - 1 - index] = TEMPORARY_NUMBER;
            }
        return NUMBERS;
    }
}