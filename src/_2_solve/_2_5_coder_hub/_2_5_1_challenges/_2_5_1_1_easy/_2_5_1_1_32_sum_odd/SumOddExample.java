package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_32_sum_odd;

import java.util.Arrays;

public class SumOddExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(getLastElement(new int[]{2, 9, 5, 4, 0}));
        System.out.println(getLastElement(new int[]{3, 12, 6}));
        System.out.println(getLastElement(new int[]{1, 8, 5, 44}));
        System.out.print(getLastElement(new int[]{1, 7, 1}));
    }

    private static int getLastElement(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .filter(number -> number % 2 != 0)
                .sum();
    }
}