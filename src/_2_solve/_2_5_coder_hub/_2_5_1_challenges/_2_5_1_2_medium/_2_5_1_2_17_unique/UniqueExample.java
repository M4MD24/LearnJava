package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_17_unique;

import java.util.Arrays;

public class UniqueExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getMaximumUnique(new int[]{1, 1, 1, 2, 1, 1})));
        System.out.println(Arrays.toString(getMaximumUnique(new int[]{3, -4, 3, 3, 3})));
        System.out.println(Arrays.toString(getMaximumUnique(new int[]{2, 4, -2})));
        System.out.print(Arrays.toString(getMaximumUnique(new int[]{2, 3, 2, 6, 2})));
    }

    private static int[] getMaximumUnique(final int[] NUMBERS) {
        return java.util.Arrays.stream(NUMBERS)
                .filter(currentNumber ->
                        java.util.Arrays.stream(NUMBERS)
                                .filter(anotherNumber ->
                                        anotherNumber == currentNumber)
                                .count() == 1)
                .toArray();
    }
}