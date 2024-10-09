package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_8_number_sum;

import java.util.Scanner;

public class NumberSumExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(numberSum(INPUT.nextInt()));
    }

    private static int numberSum(final int NUMBER) {
        return NUMBER * (NUMBER + 1) / 2;
    }
}