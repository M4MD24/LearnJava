package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_36_flip_even_odd;

import java.util.Arrays;

public class FlipEvenOddExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(arrayRoot(new int[]{73, 221, 52, 214})));
        System.out.println(Arrays.toString(arrayRoot(new int[]{12, 9, 25, 6, 12, 19})));
        System.out.println(Arrays.toString(arrayRoot(new int[]{1, 23, 46, 2, 4})));
        System.out.print(Arrays.toString(arrayRoot(new int[]{6, 5, 100, 0})));
    }

    private static int[] arrayRoot(final int[] NUMBERS) {
        for (int index = 0; index < NUMBERS.length; index++)
            if (NUMBERS[index] % 2 == 0)
                NUMBERS[index]++;
            else
                NUMBERS[index]--;
        return NUMBERS;
    }
}