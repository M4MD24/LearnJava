package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_25_sub_array;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_25_sub_array.files <h2>Question</h2>
 */

public class SubArray {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final int[] NUMBERS = getNumbers(INPUT.nextInt());
        OUTPUT.write(String.valueOf(getCountOFNegativeSubArrays(NUMBERS)));
        OUTPUT.flush();
    }

    private static int getCountOFNegativeSubArrays(final int[] NUMBERS) {
        int negativeCount = 0;
        for (int start = 0; start < NUMBERS.length; start++)
            for (int end = start, sum = 0; end < NUMBERS.length; end++)
                if ((sum += NUMBERS[end]) < 0)
                    negativeCount++;
        return negativeCount;
    }

    private static int[] getNumbers(final int COUNT_OF_NUMBERS) {
        final int[] NUMBERS = new int[COUNT_OF_NUMBERS];
        for (int indexOfNumbers = 0; indexOfNumbers < COUNT_OF_NUMBERS; indexOfNumbers++)
            NUMBERS[indexOfNumbers] = INPUT.nextInt();
        return NUMBERS;
    }
}