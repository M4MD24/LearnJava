package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_45_exponent_x;

import java.util.Scanner;

public class ExponentXExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(exponentX(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static int exponentX(final int NUMBER, final int EXPONENT) {
        return (int) Math.pow(NUMBER, EXPONENT);
    }
}