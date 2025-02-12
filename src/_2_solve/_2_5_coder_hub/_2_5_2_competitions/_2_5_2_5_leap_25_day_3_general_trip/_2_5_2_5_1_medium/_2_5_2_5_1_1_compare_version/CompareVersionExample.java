package _2_solve._2_5_coder_hub._2_5_2_competitions._2_5_2_5_leap_25_day_3_general_trip._2_5_2_5_1_medium._2_5_2_5_1_1_compare_version;

import java.util.Scanner;

public class CompareVersionExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(compareVersion(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static int compareVersion(final String FIRST_VERSION, final String SECOND_VERSION) {
        final String[] FIRST_VERSION_PARTS = FIRST_VERSION.split("\\."),
                SECOND_VERSION_PARTS = SECOND_VERSION.split("\\.");
        final int LENGTH = Math.max(FIRST_VERSION_PARTS.length, SECOND_VERSION_PARTS.length);
        for (int index = 0; index < LENGTH; index++) {
            final int FIRST_NUMBER = index < FIRST_VERSION_PARTS.length
                    ? Integer.parseInt(FIRST_VERSION_PARTS[index])
                    : 0;
            final int SECOND_NUMBER = index < SECOND_VERSION_PARTS.length
                    ? Integer.parseInt(SECOND_VERSION_PARTS[index])
                    : 0;
            if (FIRST_NUMBER != SECOND_NUMBER)
                return Integer.compare(FIRST_NUMBER, SECOND_NUMBER);
        }
        return 0;
    }
}