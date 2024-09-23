package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_21_has_space;

import java.util.Scanner;

public class HasSpaceExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(hasSpace(INPUT.nextLine()));
    }

    private static String hasSpace(final String TEXT) {
        return TEXT.replaceAll(" +", "#");
    }
}