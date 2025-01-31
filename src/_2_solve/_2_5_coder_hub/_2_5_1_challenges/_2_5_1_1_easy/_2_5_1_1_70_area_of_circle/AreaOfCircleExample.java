package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_70_area_of_circle;

import java.util.Scanner;

public class AreaOfCircleExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getAreaOfCircle(INPUT.nextDouble()));
    }

    private static double getAreaOfCircle(final double RADIUS) {
        final double PI = 3.14;
        return PI * RADIUS * RADIUS;
    }
}