package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_71_is_same;

import java.util.Scanner;

public class IsSameExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isSame(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static String isSame(final String FIRST_TEXT, final String SECOND_TEXT) {
        return FIRST_TEXT.equals(SECOND_TEXT)
                ? "متشابهتين"
                : "غير متشابهتين";
    }
}