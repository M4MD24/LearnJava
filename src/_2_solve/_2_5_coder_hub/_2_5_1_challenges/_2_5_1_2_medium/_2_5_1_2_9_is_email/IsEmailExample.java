package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_9_is_email;

import java.util.Scanner;

public class IsEmailExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isEmail(INPUT.nextLine()));
    }

    private static boolean isEmail(final String TEXT) {
        final String EMAIL_REGEX = "^[a-zA-Z0-9._-]+" +
                "@" +
                "[a-zA-Z0-9.-]+" +
                "\\." +
                "[a-zA-Z]{2,}$";
        return TEXT.matches(EMAIL_REGEX);
    }
}