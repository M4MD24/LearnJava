package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_50_square_root;

import java.util.Scanner;

public class SquareRootExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getSquareRoot(INPUT.nextDouble()));
    }

    private static double getSquareRoot(final double NUMBER) {
        return Math.sqrt(NUMBER);
    }
}