package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_w_hussien_and_arrays_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * <h1>W. Hussein and Arrays 2</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 3 5 4 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_w_hussien_and_arrays_2.images <h2>Question</h2>
 */

public class HusseinAndArrays2Example {
    private static int countOfNumbers;
    private static int[] numbers;

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(String.valueOf(getMaximumDifference()));
        OUTPUT.flush();
    }

    private static int getMaximumDifference() {
        final int[] MAX_DIFFERENCE_INDICES = new int[countOfNumbers];
        final Vector<Integer> GREATER_VALUES_INDICES = new Vector<>();
        int round = countOfNumbers - 1;
        GREATER_VALUES_INDICES.add(round);
        MAX_DIFFERENCE_INDICES[round] = round;
        while (round >= 0) {
            if (numbers[round] > numbers[GREATER_VALUES_INDICES.lastElement()]) {
                GREATER_VALUES_INDICES.add(round);
                MAX_DIFFERENCE_INDICES[round] = round;
            } else {
                boolean isGreaterValueFound = false;
                for (int index = GREATER_VALUES_INDICES.size() - 1; index >= 0; index--) {
                    if (numbers[round] > numbers[GREATER_VALUES_INDICES.get(index)]) {
                        MAX_DIFFERENCE_INDICES[round] = GREATER_VALUES_INDICES.get(index + 1);
                        isGreaterValueFound = true;
                        break;
                    }
                }
                if (!isGreaterValueFound) MAX_DIFFERENCE_INDICES[round] = GREATER_VALUES_INDICES.firstElement();
            }
            round--;
        }
        int maxDifference = MAX_DIFFERENCE_INDICES[0];
        for (int index = 1; index < countOfNumbers; index++) maxDifference = Math.max(maxDifference, MAX_DIFFERENCE_INDICES[index] - index);
        return maxDifference;
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfNumbers = Integer.parseInt(INPUT.readLine());
        numbers = new int[countOfNumbers];
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (int index = 0; index < countOfNumbers; index++) numbers[index] = Integer.parseInt(LINE.nextToken());
    }
}