package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_63_average;

import java.util.Arrays;

public class AverageExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getAverage(new int[]{2, 4, 9, 23, 435}));
        System.out.println(getAverage(new int[]{3, 5, 67, 1}));
        System.out.println(getAverage(new int[]{99, 314, 8, 200, 1}));
        System.out.print(getAverage(new int[]{72, 0, 23, 70, 1}));
    }

    private static double getAverage(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .average()
                .getAsDouble();
    }
}