package _2_solving._2_6_coder_hub._2_6_3_hard._2_6_3_1_coder_hub_team._2_6_3_1_1_odd_vs_even;

import java.util.Arrays;
import java.util.Scanner;

public class OddVSEvenExample {
    public static void main(final String[] ARGS) {
        System.out.print("num= ");
        final int NUMBER = new Scanner(System.in).nextInt();
        System.out.print(oddsVsEvens(NUMBER));
    }

    public static String oddsVsEvens(final int NUMBER) {
        final String DIGITS = String.valueOf(NUMBER);
        final int LENGTH_OF_DIGITS = DIGITS.length();
        final int[] NUMBERS = new int[LENGTH_OF_DIGITS];
        for (int index = 0; index < LENGTH_OF_DIGITS; index++)
            NUMBERS[index] = DIGITS.charAt(index) - '0';
        final int SUM_OF_ODD_NUMBERS = Arrays.stream(NUMBERS)
                .filter(number -> number % 2 != 0)
                .sum(),
                SUM_OF_EVEN_NUMBERS = Arrays.stream(NUMBERS)
                        .filter(number -> number % 2 == 0)
                        .sum();
        if (SUM_OF_ODD_NUMBERS == SUM_OF_EVEN_NUMBERS)
            return CasesOfSumNumbers.equal.toString();
        else if (SUM_OF_ODD_NUMBERS > SUM_OF_EVEN_NUMBERS)
            return CasesOfSumNumbers.odd.toString();
        else
            return CasesOfSumNumbers.even.toString();
    }
}