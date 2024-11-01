package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_59_cumulative_addition;

import java.util.Arrays;

public class CumulativeAdditionExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{5, 1, 2, 4, 9, 10, 200})));
        System.out.println(Arrays.toString(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{500, 123, 52, 123, 22})));
        System.out.println(Arrays.toString(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{1, 1, 2, 5, 2, 5, 8})));
        System.out.print(Arrays.toString(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{7, 9, 12, 100, 244})));
    }

    private static int[] getCumulativeAdditionNumbersAndCountOfNumbers(final int[] NUMBERS) {
        return new int[]{Arrays.stream(NUMBERS).sum(), NUMBERS.length};
    }
}