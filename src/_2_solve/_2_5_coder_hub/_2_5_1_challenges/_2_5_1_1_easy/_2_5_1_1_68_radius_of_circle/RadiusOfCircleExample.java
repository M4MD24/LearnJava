package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_68_radius_of_circle;

import java.util.Scanner;

public class RadiusOfCircleExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getCircumferenceOfCircle(INPUT.nextDouble()));
    }

    private static double getCircumferenceOfCircle(final double CIRCUMFERENCE) {
        return 2 * Math.PI * CIRCUMFERENCE;
    }
}