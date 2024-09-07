package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_e_costruct_the_sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>E. Construct The Sum</h1>
 * <h2>
 * time limit per test: 5 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>You are given two integers n and s. You have to find distinct positive integers. Each of them less than or equal to n and their summation equals to s, or determine that this is impossible.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Don't print any extra spaces.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 5 3
 * <br/>
 * 7 10
 * <br/>
 * 6 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 1 2
 * <br/>
 * 2 3 7
 * <br/>
 * 1 4
 * </h2>
 */

public class ConstructTheSumExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        byte countOfTestCases = Byte.parseByte(INPUT.readLine());
        while (countOfTestCases > 0) {
            final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
            OUTPUT.write(getDistinctPositiveNumbers(Integer.parseInt(LINE.nextToken()), Long.parseLong(LINE.nextToken())));
            if (countOfTestCases-- > 1) OUTPUT.write("\n");
        }
    }

    private static String getDistinctPositiveNumbers(int number1, long number2) {
        if (number1 >= number2) return "1 " + number2;
        else {
            final StringBuffer RESULT = new StringBuffer();
            if ((long) number1 * (number1 + 1) / 2 < number2) RESULT.append(-1);
            else {
                final long[] NUMBERS = new long[number1];
                int index = 0, counterOfNumbers = 0;
                while (number2 > 0) {
                    if (number2 >= number1) {
                        NUMBERS[index] = number1;
                        number1--;
                        number2 -= NUMBERS[index];
                    } else {
                        NUMBERS[index] = number2;
                        number2 = 0;
                    }
                    index++;
                    counterOfNumbers++;
                }
                RESULT.append(counterOfNumbers).append(" ");
                index = 0;
                while (index < counterOfNumbers) {
                    if (index == counterOfNumbers - 1) RESULT.append(NUMBERS[index]);
                    else RESULT.append(NUMBERS[index]).append(" ");
                    index++;
                }
            }
            return String.valueOf(RESULT);
        }
    }
}