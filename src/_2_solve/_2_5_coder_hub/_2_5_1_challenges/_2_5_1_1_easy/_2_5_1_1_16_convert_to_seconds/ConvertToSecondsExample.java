package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_16_convert_to_seconds;

import java.util.Scanner;

public class ConvertToSecondsExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getSecondsFromHours(INPUT.nextInt()));
    }

    private static int getSecondsFromHours(final int HOURS) {
        return HOURS * 60 * 60;
    }
}