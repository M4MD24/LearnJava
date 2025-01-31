package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_22_less_or_more_than_zero;

import java.util.Scanner;

public class LessOrMoreThanZeroExample {
    public static void main(final String[] ARGUMENTS) {
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