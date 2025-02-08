package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_39_all_same_case;

import java.util.Scanner;

public class AllSameCaseExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(allSameCase(INPUT.nextLine()));
    }

    private static boolean allSameCase(final String TEXT) {
        return TEXT.equals(TEXT.toLowerCase()) || TEXT.equals(TEXT.toUpperCase());
    }
}