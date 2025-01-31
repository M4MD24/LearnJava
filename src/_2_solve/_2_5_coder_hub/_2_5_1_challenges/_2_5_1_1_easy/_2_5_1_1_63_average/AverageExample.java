package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_63_average;

import java.util.Arrays;

public class AverageExample {
    public static void main(final String[] ARGUMENTS) {
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