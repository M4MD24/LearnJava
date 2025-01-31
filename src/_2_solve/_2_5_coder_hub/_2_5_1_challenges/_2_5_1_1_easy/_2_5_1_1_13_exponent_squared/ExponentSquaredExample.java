package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_13_exponent_squared;

import java.util.Scanner;

public class ExponentSquaredExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(exponentSquared(INPUT.nextInt()));
    }

    private static int exponentSquared(final int NUMBER) {
        return (int) Math.pow(NUMBER, 2);
    }
}