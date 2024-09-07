package _2_solving._2_5_coder_hub._2_5_2_medium._2_5_2_1_coder_hub_team._2_5_2_1_9_is_email;

import java.util.Scanner;

public class IsEmailExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isEmail(INPUT.nextLine()));
    }

    private static boolean isEmail(final String WORDS) {
        final String EMAIL_REGEX = "^[a-zA-Z0-9._-]+" +
                "@" +
                "[a-zA-Z0-9.-]+" +
                "\\." +
                "[a-zA-Z]{2,}$";
        return WORDS.matches(EMAIL_REGEX);
    }
}