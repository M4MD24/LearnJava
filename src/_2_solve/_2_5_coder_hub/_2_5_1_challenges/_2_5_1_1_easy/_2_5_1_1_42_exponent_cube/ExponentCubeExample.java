package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_42_exponent_cube;

import java.util.Scanner;

public class ExponentCubeExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(exponentCube(INPUT.nextInt()));
    }

    private static int exponentCube(final int NUMBER) {
        return (int) Math.pow(NUMBER, 3);
    }
}