package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_52_cubic_root;

import java.util.Scanner;

public class CubicRootExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getCubeRoot(INPUT.nextInt()));
    }

    private static double getCubeRoot(final int NUMBER) {
        return Math.cbrt(NUMBER);
    }
}