package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_28_big_decimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_28_big_decimal.files <h2>Question</h2>
 */

public class BigDecimalExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final int COUNT_OF_NUMBERS = INPUT.nextInt();
        INPUT.nextLine();
        final String[] NUMBERS = new String[COUNT_OF_NUMBERS];
        for (int index = 0; index < COUNT_OF_NUMBERS; index++)
            NUMBERS[index] = INPUT.nextLine();
        Arrays.sort(NUMBERS, (firstNumber, secondNumber) -> new BigDecimal(secondNumber).compareTo(new BigDecimal(firstNumber)));
        for (final String NUMBER : NUMBERS)
            System.out.println(NUMBER);
    }
}