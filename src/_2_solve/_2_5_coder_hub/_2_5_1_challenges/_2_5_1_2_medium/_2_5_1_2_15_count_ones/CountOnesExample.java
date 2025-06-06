package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_15_count_ones;

import java.util.Scanner;

public class CountOnesExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(countOfOnes(INPUT.nextInt()));
    }

    private static int countOfOnes(final int NUMBER) {
        int countOfOnes = 0;
        final String NUMBER_AFTER_CONVERTED_TO_BINARY = Integer.toBinaryString(NUMBER);
        for (int index = 0; index < NUMBER_AFTER_CONVERTED_TO_BINARY.length(); index++)
            if (NUMBER_AFTER_CONVERTED_TO_BINARY.charAt(index) - '0' == 1)
                countOfOnes++;
        return countOfOnes;
    }
}