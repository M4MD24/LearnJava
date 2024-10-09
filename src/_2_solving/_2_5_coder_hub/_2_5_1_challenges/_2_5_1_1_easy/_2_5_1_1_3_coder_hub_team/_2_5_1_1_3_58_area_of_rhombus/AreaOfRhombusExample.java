package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_58_area_of_rhombus;

import java.util.Scanner;

public class AreaOfRhombusExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(areaOfRhombus(INPUT.nextDouble(), INPUT.nextDouble()));
    }

    private static double areaOfRhombus(final double FIRST_DIAGONAL, final double SECOND_DIAGONAL) {
        return FIRST_DIAGONAL * SECOND_DIAGONAL / 2;
    }
}