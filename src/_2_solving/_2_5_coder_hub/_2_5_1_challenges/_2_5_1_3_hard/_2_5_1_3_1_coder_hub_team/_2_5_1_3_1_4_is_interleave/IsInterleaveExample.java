package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_1_coder_hub_team._2_5_1_3_1_4_is_interleave;

import java.util.Arrays;
import java.util.Scanner;

public class IsInterleaveExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);

        System.out.print("First Text: ");
        final String FIRST_TEXT = INPUT.nextLine();

        System.out.print("Second Text: ");
        final String SECOND_TEXT = INPUT.nextLine();

        System.out.print("Third Text: ");
        final String THIRD_TEXT = INPUT.nextLine();

        System.out.print(isInterleave(FIRST_TEXT, SECOND_TEXT, THIRD_TEXT));
    }

    private static boolean isInterleave(final String FIRST_TEXT, final String SECOND_TEXT, final String THIRD_TEXT) {
        return Arrays.equals(
                (FIRST_TEXT + SECOND_TEXT).chars()
                        .sorted()
                        .toArray(),
                THIRD_TEXT.chars()
                        .sorted()
                        .toArray()
        );
    }
}