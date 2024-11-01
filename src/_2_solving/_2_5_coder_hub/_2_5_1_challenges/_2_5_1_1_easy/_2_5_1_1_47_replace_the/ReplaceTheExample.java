package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_47_replace_the;

import java.util.Scanner;

public class ReplaceTheExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(replaceThe(INPUT.nextLine()));
    }

    private static String replaceThe(final String TEXT) {
        return TEXT.replaceAll(
                "the",
                String.valueOf(TEXT.substring(TEXT.indexOf("the") + 4).charAt(0))
                        .matches(".*[aAeEiIoOuU].*")
                        ? "an"
                        : "a"
        );
    }
}