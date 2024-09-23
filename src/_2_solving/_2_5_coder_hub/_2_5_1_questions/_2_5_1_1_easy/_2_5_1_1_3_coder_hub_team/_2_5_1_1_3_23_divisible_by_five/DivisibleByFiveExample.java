package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_23_divisible_by_five;

import java.util.Scanner;

public class DivisibleByFiveExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(lessOrMoreThanZero(INPUT.nextInt()));
    }

    private static boolean lessOrMoreThanZero(final int NUMBER) {
        return NUMBER % 5 == 0;
    }
}