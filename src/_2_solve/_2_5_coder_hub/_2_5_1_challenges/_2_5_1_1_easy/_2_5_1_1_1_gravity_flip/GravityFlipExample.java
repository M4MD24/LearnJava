package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_1_gravity_flip;

import java.util.Arrays;

public class GravityFlipExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getGravityFlip(new int[]{3, 2, 1, 2})));
        System.out.println(Arrays.toString(getGravityFlip(new int[]{2, 3, 8})));
        System.out.println(Arrays.toString(getGravityFlip(new int[]{1, 1, 1, 1})));
        System.out.print(Arrays.toString(getGravityFlip(new int[]{4, 5, 6, 3, 2})));
    }

    private static int[] getGravityFlip(final int[] NUMBERS) {
        return sortNumbersWithSelectionAlgorithm(NUMBERS);
    }

    private static int[] sortNumbersWithSelectionAlgorithm(final int[] NUMBERS) {
        final int LENGTH = NUMBERS.length;
        int minimumIndex,
                temporaryVariable;
        for (int index = 0; index < LENGTH - 1; index++) {
            minimumIndex = index;
            for (int index2 = index + 1; index2 < LENGTH; index2++)
                if (NUMBERS[minimumIndex] > NUMBERS[index2]) minimumIndex = index2;
            temporaryVariable = NUMBERS[minimumIndex];
            NUMBERS[minimumIndex] = NUMBERS[index];
            NUMBERS[index] = temporaryVariable;
        }
        return NUMBERS;
    }
}