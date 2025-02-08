package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_62_cone_volume;

import java.util.Scanner;

public class ConeVolumeExample {
    public static void main(final String[] ARGUMENTS) {
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