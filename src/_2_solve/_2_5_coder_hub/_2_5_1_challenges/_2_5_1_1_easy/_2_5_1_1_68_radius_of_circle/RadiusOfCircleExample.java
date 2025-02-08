package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_68_radius_of_circle;

import java.util.Scanner;

public class RadiusOfCircleExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getRadiusOfCircle(INPUT.nextDouble()));
    }

    private static double getRadiusOfCircle(final double CIRCUMFERENCE) {
        final double PI = 3.14;
        return CIRCUMFERENCE / (2 * PI);
    }
}