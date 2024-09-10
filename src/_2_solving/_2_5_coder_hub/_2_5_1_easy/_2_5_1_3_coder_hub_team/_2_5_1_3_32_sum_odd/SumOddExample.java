package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_32_sum_odd;

import java.util.Arrays;

public class SumOddExample {
    public static void main(final String[] PARAMETERS) {
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