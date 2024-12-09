package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_25_sub;

import java.util.Scanner;

public class SubExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(sub(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static int sub(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER - SECOND_NUMBER;
    }
}