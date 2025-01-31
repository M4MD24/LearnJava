package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_14_area_of_square;

import java.util.Scanner;

public class AreaOfSquareExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(areaOfSquare(INPUT.nextInt()));
    }

    private static int areaOfSquare(final int LENGTH) {
        return LENGTH * LENGTH;
    }
}