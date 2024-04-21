package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_y_spiral;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * <h1>Y. Spiral</h1>
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
 * <h2>
 * Given an n * m matrix.
 * <br/>
 * Print all it's elements in spiral order.
 * <br/>
 * See the figure below for more clarification.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4 4
 * <br/>
 * 1 2 3 4
 * <br/>
 * 12 13 14 5
 * <br/>
 * 11 16 15 6
 * <br/>
 * 10 9 8 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 </h2>
 *
 * @see _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_x_strange_addition.images <h2>Figture</h2>
 */

public class SpiralExample {
    private static byte countOfNumbers;
    private static byte[] numbers;
    private static final List<Byte> VASYA_NUMBERS = new ArrayList<>();
    private static boolean gotNumberWithDigitZero = false;

    public static void main(String[] args) throws IOException {
        inputNumbers();
        printVasyaNumbers();
    }

    private static void printVasyaNumbers() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        if (gotNumberWithDigitZero) {
            for (byte index = 0; index < countOfNumbers; index++)
                if (numbers[index] >= 10 && numbers[index] < 100 && numbers[index] % 10 == 0) {
                    VASYA_NUMBERS.add(numbers[index]);
                    break;
                }
        } else {
            for (byte index = 0; index < countOfNumbers; index++)
                if (numbers[index] >= 10 && numbers[index] < 100) {
                    VASYA_NUMBERS.add(numbers[index]);
                    break;
                }
        }

        OUTPUT.write(String.valueOf(VASYA_NUMBERS.size()));
        OUTPUT.newLine();
        for (final byte VASYA_NUMBER : VASYA_NUMBERS) OUTPUT.write(VASYA_NUMBER + " ");
        OUTPUT.flush();
    }

    private static void inputNumbers() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfNumbers = Byte.parseByte(INPUT.readLine());
        numbers = new byte[countOfNumbers];
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (byte index = 0; index < countOfNumbers; index++) {
            numbers[index] = Byte.parseByte(LINE.nextToken());
            if (numbers[index] == 0 || numbers[index] == 100) VASYA_NUMBERS.add(numbers[index]);
            else if (numbers[index] >= 1 && numbers[index] <= 9 && !gotNumberWithDigitZero) {
                VASYA_NUMBERS.add(numbers[index]);
                gotNumberWithDigitZero = true;
            }
        }
    }
}