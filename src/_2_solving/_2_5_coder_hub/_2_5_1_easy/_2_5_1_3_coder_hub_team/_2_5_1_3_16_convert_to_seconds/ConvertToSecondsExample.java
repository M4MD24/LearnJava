package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_16_convert_to_seconds;

import java.util.Scanner;

public class ConvertToSecondsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getSecondsFromHours(INPUT.nextInt()));
    }

    private static int getSecondsFromHours(final int HOURS) {
        return HOURS * 60 * 60;
    }
}