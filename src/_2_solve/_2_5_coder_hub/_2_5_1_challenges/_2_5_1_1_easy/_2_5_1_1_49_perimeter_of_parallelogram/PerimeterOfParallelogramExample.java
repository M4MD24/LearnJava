package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_49_perimeter_of_parallelogram;

import java.util.Scanner;

public class PerimeterOfParallelogramExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(perimeterOfParallelogram(INPUT.nextDouble(), INPUT.nextDouble()));
    }

    private static double perimeterOfParallelogram(final double BASE_LENGTH, final double SIDE_LENGTH) {
        return 2 * (BASE_LENGTH + SIDE_LENGTH);
    }
}