package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_20_sorted_squares;

import java.util.Arrays;

public class SortedSquares {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[] {-7, -3, 2, 3, 11})));
        System.out.println(Arrays.toString(sortedSquares(new int[] {0, 1, 2, 3, 4})));
        System.out.print(Arrays.toString(sortedSquares(new int[] {-5, -3, -2, -1, 0})));
    }

    public static int[] sortedSquares(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                     .map(number -> number * number)
                     .sorted()
                     .toArray();
    }
}