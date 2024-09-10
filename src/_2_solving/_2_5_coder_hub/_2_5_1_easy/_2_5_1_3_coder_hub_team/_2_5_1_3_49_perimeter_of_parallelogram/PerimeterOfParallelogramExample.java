package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_49_perimeter_of_parallelogram;

import java.util.Scanner;

public class PerimeterOfParallelogramExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(perimeterOfParallelogram(INPUT.nextDouble(), INPUT.nextDouble()));
    }

    private static double perimeterOfParallelogram(final double BASE_LENGTH, final double SIDE_LENGTH) {
        return 2 * (BASE_LENGTH + SIDE_LENGTH);
    }
}