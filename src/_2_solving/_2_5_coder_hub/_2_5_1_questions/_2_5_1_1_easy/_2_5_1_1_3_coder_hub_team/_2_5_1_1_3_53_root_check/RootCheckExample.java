package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_53_root_check;

import java.util.Scanner;

public class RootCheckExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isSquareNumber(INPUT.nextDouble(), INPUT.nextInt()));
    }

    private static int isSquareNumber(final double SQUARE_NUMBER, final int NUMBER) {
        return Math.sqrt(SQUARE_NUMBER) == NUMBER ? NUMBER : 0;
    }
}