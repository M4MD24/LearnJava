package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_60_area_of_parallelogram;

import java.util.Scanner;

public class AreaOfParallelogramExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(areaOfParallelogram(INPUT.nextDouble(), INPUT.nextDouble()));
    }

    private static double areaOfParallelogram(final double HEIGHT, final double BASE_LENGTH) {
        return HEIGHT * BASE_LENGTH;
    }
}