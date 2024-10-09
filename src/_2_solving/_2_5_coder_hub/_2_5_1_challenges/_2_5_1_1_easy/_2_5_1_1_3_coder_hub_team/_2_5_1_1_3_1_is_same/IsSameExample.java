package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_1_is_same;

import java.util.Scanner;

public class IsSameExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isSame(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static String isSame(final String FIRST_TEXT, final String SECOND_TEXT) {
        return FIRST_TEXT.equals(SECOND_TEXT)
                ? "متشابهين"
                : "غير متشابهين";
    }
}