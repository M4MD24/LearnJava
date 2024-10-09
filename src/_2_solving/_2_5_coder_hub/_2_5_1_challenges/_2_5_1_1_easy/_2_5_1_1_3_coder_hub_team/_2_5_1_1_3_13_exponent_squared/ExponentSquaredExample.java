package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_13_exponent_squared;

import java.util.Scanner;

public class ExponentSquaredExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(exponentSquared(INPUT.nextInt()));
    }

    private static int exponentSquared(final int NUMBER) {
        return (int) Math.pow(NUMBER, 2);
    }
}