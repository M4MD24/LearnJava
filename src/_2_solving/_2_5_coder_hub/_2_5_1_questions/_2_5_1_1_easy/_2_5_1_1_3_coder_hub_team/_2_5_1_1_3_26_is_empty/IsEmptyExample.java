package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_26_is_empty;

import java.util.Scanner;

public class IsEmptyExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isEmpty(INPUT.nextLine()));
    }

    private static boolean isEmpty(final String TEXT) {
        return TEXT.isEmpty();
    }
}