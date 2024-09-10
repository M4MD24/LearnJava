package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_38_concat_names;

import java.util.Scanner;

public class ConcatNamesExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(areAllSameCase(INPUT.nextLine()));
    }

    private static boolean areAllSameCase(final String TEXT) {
        return TEXT.equals(TEXT.toLowerCase()) || TEXT.equals(TEXT.toUpperCase());
    }
}