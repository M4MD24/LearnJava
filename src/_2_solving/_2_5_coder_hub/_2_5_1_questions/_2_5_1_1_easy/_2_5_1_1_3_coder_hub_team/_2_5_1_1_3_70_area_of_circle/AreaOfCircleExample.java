package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_70_area_of_circle;

import java.util.Scanner;

public class AreaOfCircleExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getAreaOfCircle(INPUT.nextDouble()));
    }

    private static double getAreaOfCircle(final double RADIUS) {
        final double PI = 3.14;
        return PI * RADIUS * RADIUS;
    }
}