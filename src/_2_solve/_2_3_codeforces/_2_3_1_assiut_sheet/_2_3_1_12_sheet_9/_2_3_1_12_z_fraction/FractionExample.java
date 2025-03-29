package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_z_fraction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>Z. Fraction</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given two fractions , find the smallest fraction that when divided by each of the two fractions, the result is an integer number.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1/2 3/4</h2>
 * <h1>Output</h1>
 * <h2>3/2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2/3 4/5</h2>
 * <h1>Output</h1>
 * <h2>4/1</h2>
 */

public class FractionExample {
    private static short firstNumber, thirdNumber;
    private static int secondNumber, fourthNumber;

    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(getSmallestFraction());
        OUTPUT.flush();
    }

    private static String getSmallestFraction() {
        return getLeastCommonMultiple(firstNumber, thirdNumber) + "/" + getGreatestCommonDivisor(secondNumber, fourthNumber);
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        String FIRST_FRACTION = LINE.nextToken(), SECOND_FRACTION = LINE.nextToken();
        firstNumber = Short.parseShort(FIRST_FRACTION.substring(0, FIRST_FRACTION.indexOf('/')));
        secondNumber = Integer.parseInt(FIRST_FRACTION.substring(FIRST_FRACTION.indexOf('/') + 1));
        thirdNumber = Short.parseShort(SECOND_FRACTION.substring(0, SECOND_FRACTION.indexOf('/')));
        fourthNumber = Integer.parseInt(SECOND_FRACTION.substring(SECOND_FRACTION.indexOf('/') + 1));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        while (number2 != 0) {
            number1 += number2;
            number2 = number1 - number2;
            number1 -= number2;
            number2 %= number1;
        }
        return number1;
    }

    public static int getLeastCommonMultiple(final short NUMBER_1, final short NUMBER_2) {
        return (NUMBER_1 / getGreatestCommonDivisor(NUMBER_1, NUMBER_2)) * NUMBER_2;
    }
}