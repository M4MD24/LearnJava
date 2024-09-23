package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_34_numbers_range;

import java.util.Scanner;

public class NumbersRangeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getNumbersToTargetNumber(INPUT.nextInt()));
    }

    private static String getNumbersToTargetNumber(final int TARGET_NUMBER) {
        final StringBuilder NUMBERS = new StringBuilder();
        for (int number = 0; number <= TARGET_NUMBER; number++) {
            NUMBERS.append(number);
            if (number != TARGET_NUMBER)
                NUMBERS.append(' ');
        }
        return NUMBERS.toString();
    }
}