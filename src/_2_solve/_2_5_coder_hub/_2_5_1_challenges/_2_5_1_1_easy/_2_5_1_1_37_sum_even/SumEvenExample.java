package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_37_sum_even;

import java.util.Arrays;

public class SumEvenExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(getLastElement(new int[]{11, 0, 5, 22}));
        System.out.println(getLastElement(new int[]{16, 3, 9, 2}));
        System.out.println(getLastElement(new int[]{12, 65, 42}));
        System.out.print(getLastElement(new int[]{1, 3, 7}));
    }

    private static int getLastElement(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .filter(number -> number % 2 == 0)
                .sum();
    }
}