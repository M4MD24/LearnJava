package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_45_exponent_x;

import java.util.Scanner;

public class ExponentXExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(exponentX(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static int exponentX(final int NUMBER, final int EXPONENT) {
        return (int) Math.pow(NUMBER, EXPONENT);
    }
}