package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_56_get_mean;

import java.util.Arrays;

public class GetMeanExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getMean(new int[]{4, 1}));
        System.out.println(getMean(new int[]{6, 7, 8, 9}));
        System.out.println(getMean(new int[]{10, 15}));
        System.out.print(getMean(new int[]{1, 5, 3, 6, 6}));
    }

    private static double getMean(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .average()
                .getAsDouble();
    }
}