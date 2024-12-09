package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_12_area_of_rectangle;

import java.util.Scanner;

public class AreaOfRectangleExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(areaOfRectangle(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static int areaOfRectangle(final int WIDTH, final int LENGTH) {
        return WIDTH * LENGTH;
    }
}