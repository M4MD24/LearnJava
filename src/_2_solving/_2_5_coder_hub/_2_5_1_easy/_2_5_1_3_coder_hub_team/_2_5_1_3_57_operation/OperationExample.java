package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_57_operation;

import java.util.Scanner;

public class OperationExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(operation(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static String operation(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        if (FIRST_NUMBER / SECOND_NUMBER == 24)
            return "divided";
        else if (FIRST_NUMBER * SECOND_NUMBER == 24)
            return "multiplied";
        else if (FIRST_NUMBER + SECOND_NUMBER == 24)
            return "added";
        else if (FIRST_NUMBER - SECOND_NUMBER == 24)
            return "subtracted";
        else
            return "None";
    }
}