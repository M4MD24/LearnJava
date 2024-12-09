package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_1_bubble;

import java.util.Arrays;

public class BubbleExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(bubbleSorting(NUMBERS));
    }

    private static String bubbleSorting(final int[] ARRAY) {
        final int MAXIMUM_LENGTH = ARRAY.length;
        for (int round = 0; round < MAXIMUM_LENGTH; round++)
            for (int index = 0; index < MAXIMUM_LENGTH - 1; index++)
                if (ARRAY[index] > ARRAY[index + 1]) {
                    ARRAY[index] += ARRAY[index + 1];
                    ARRAY[index + 1] = ARRAY[index] - ARRAY[index + 1];
                    ARRAY[index] -= ARRAY[index + 1];
                }
        return Arrays.toString(ARRAY);
    }
}