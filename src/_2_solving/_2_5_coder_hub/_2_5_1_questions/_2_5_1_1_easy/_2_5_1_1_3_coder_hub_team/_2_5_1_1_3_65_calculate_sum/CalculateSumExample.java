package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_65_calculate_sum;

import java.util.Arrays;

public class CalculateSumExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{1, 2, 3, 4}));
        System.out.println(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{0, 7, 12, 67}));
        System.out.println(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{23, 43, 27, 87, 67}));
        System.out.print(getCumulativeAdditionNumbersAndCountOfNumbers(new int[]{84, 469}));
    }

    private static int getCumulativeAdditionNumbersAndCountOfNumbers(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .anyMatch(number -> number == 7)
                ? 0
                : Arrays.stream(NUMBERS)
                .sum();
    }
}