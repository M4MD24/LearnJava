package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_54_circumference_of_rhombus;

import java.util.Scanner;

public class CircumferenceOfRhombusExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(perimeterOfRhombus(INPUT.nextDouble()));
    }

    private static double perimeterOfRhombus(final double LENGTH) {
        return LENGTH * 4;
    }
}