package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_30_1d_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_30_1d_array.files <h2>Question</h2>
 */

public class OneDimensionalArray {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final int COUNT_OF_NUMBERS = Integer.parseInt(INPUT.readLine());
        final int[] NUMBERS = new int[COUNT_OF_NUMBERS];
        for (int index = 0; index < NUMBERS.length; index++)
            NUMBERS[index] = Integer.parseInt(INPUT.readLine());
        for (final int NUMBER : NUMBERS)
            OUTPUT.write(NUMBER + "\n");
        OUTPUT.flush();
    }
}