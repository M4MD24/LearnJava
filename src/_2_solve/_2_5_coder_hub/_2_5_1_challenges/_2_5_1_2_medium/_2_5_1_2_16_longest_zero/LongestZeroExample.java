package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_16_longest_zero;

import java.util.Scanner;

public class LongestZeroExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getLongestZero(INPUT.nextLine()));
    }

    private static String getLongestZero(final String NUMBER) {
        return NUMBER.contains("0")
                ? java.util.Collections.max(
                java.util.Arrays.asList(
                        NUMBER.split("1")
                )).replaceAll("1", "")
                : "";
    }
}