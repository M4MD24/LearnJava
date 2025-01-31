package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_54_circumference_of_rhombus;

import java.util.Scanner;

public class CircumferenceOfRhombusExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(perimeterOfRhombus(INPUT.nextDouble()));
    }

    private static double perimeterOfRhombus(final double LENGTH) {
        return LENGTH * 4;
    }
}