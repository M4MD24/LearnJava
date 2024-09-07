package _2_solving._2_5_coder_hub._2_5_2_medium._2_5_2_1_coder_hub_team._2_5_2_1_16_longest_zero;

import java.util.Scanner;

public class LongestZeroExample {
    public static void main(final String[] PARAMETERS) {
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