package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_60_area_of_parallelogram;

import java.util.Scanner;

public class AreaOfParallelogramExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(areaOfParallelogram(INPUT.nextDouble(), INPUT.nextDouble()));
    }

    private static double areaOfParallelogram(final double HEIGHT, final double BASE_LENGTH) {
        return HEIGHT * BASE_LENGTH;
    }
}