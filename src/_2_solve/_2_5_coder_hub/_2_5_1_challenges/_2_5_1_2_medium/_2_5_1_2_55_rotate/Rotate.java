package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_55_rotate;

import java.util.Arrays;

public class Rotate {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(
                Arrays.toString(
                        rotate(
                                new int[] {1, 2, 3, 4, 5, 6, 7},
                                3
                        )
                )
        );
    }

    private static int[] rotate(
            final int[] NUMBERS,
            int targetLength
    ) {
        if (NUMBERS == null)
            return null;

        final int LENGTH = NUMBERS.length;

        if (LENGTH == 0)
            return NUMBERS;

        targetLength = ((targetLength % LENGTH) + LENGTH) % LENGTH;
        if (targetLength == 0)
            return NUMBERS;

        reverse(NUMBERS, 0, LENGTH - 1);
        reverse(NUMBERS, 0, targetLength - 1);
        reverse(NUMBERS, targetLength, LENGTH - 1);

        return NUMBERS;
    }

    private static void reverse(
            final int[] NUMBERS,
            int left,
            int right
    ) {
        while (left < right) {
            int TEMPORARY_NUMBER = NUMBERS[left];
            NUMBERS[left++] = NUMBERS[right];
            NUMBERS[right--] = TEMPORARY_NUMBER;
        }
    }
}