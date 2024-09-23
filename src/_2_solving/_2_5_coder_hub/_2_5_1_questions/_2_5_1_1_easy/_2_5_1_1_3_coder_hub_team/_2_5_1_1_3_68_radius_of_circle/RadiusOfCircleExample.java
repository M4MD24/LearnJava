package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_68_radius_of_circle;

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