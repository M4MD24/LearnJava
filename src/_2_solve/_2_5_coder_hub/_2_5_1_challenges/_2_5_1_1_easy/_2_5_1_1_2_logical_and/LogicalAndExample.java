package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_2_logical_and;

import java.util.Scanner;

public class LogicalAndExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(logicalAnd(INPUT.nextBoolean(), INPUT.nextBoolean()));
    }

    private static boolean logicalAnd(final boolean FIRST_STATUS, final boolean SECOND_STATUS) {
        return FIRST_STATUS && SECOND_STATUS;
    }
}