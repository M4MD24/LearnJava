package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_33_sort_array;

import java.util.Arrays;

public class SortArrayExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(sortNumbers(new int[]{63, 12, 43, 56, 12})));
        System.out.println(Arrays.toString(sortNumbers(new int[]{88, 12, 23, 59, 1, 24})));
        System.out.println(Arrays.toString(sortNumbers(new int[]{100, 23, 200, 23, 1})));
        System.out.print(Arrays.toString(sortNumbers(new int[]{99, 88, 774, 2})));
    }

    private static int[] sortNumbers(final int[] NUMBERS) {
        java.util.Arrays
                .sort(NUMBERS);
        return NUMBERS;
    }
}