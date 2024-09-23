package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_15_count_ones;

import java.util.Scanner;

public class CountOnesExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getSumOfDigitsOfOne(INPUT.nextInt()));
    }

    private static int getSumOfDigitsOfOne(final int NUMBER) {
        int sumOfDigitsOfOne = 0;
        final String NUMBER_AFTER_CONVERTED_TO_BINARY = Integer.toBinaryString(NUMBER);
        for (int index = 0; index < NUMBER_AFTER_CONVERTED_TO_BINARY.length(); index++)
            if (NUMBER_AFTER_CONVERTED_TO_BINARY.charAt(index) - '0' == 1)
                sumOfDigitsOfOne++;
        return sumOfDigitsOfOne;
    }
}