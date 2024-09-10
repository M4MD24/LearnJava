package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_62_con_volume;

import java.util.Scanner;

public class ConVolumeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getConeVolume(INPUT.nextDouble(), INPUT.nextDouble()));
    }

    private static double getConeVolume(final double RADIUS, final double HEIGHT) {
        final double PI = 3.14;
        return 1.0 /
                3.0 *
                HEIGHT *
                PI *
                RADIUS *
                RADIUS;
    }
}