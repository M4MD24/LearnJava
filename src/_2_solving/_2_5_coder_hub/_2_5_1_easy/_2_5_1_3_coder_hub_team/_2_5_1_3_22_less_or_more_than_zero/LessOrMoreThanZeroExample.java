package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_22_less_or_more_than_zero;

import java.util.Scanner;

public class LessOrMoreThanZeroExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(lessOrMoreThanZero(INPUT.nextInt()));
    }

    private static String lessOrMoreThanZero(final int NUMBER) {
        if (NUMBER == 0)
            return "Equal to zero";
        else if (NUMBER > 0)
            return "Greater than zero";
        else
            return "Less than zero";
    }
}