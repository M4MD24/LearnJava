package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_5_cap_space;

import java.util.Scanner;

public class CapSpaceExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Text: ");
        final String TEXT = INPUT.nextLine();
        System.out.print(capSpace(TEXT));
    }

    private static String capSpace(final String TEXT) {
        return TEXT.replaceAll("([A-Z])", " $1")
                .toLowerCase()
                .trim();
    }
}