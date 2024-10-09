package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_o_help_koko;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>O. Help Koko</h1>
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
 * <h2>
 * Yesterday morning Koko came back from college not happy because his mentor gave him a problem and he didn't solve it.
 * <br/>
 * His mentor gave him a list of numbers and asked him to do one of two operations on each number in the list:
 * <br/>
 * 1^st operation is to check if the number is prime or not, if it's not a prime number then he should print −1, and if it's a prime number he should multiply it by 5^X then multiply it by 3^X
 * <br/>
 * and print the last digit of the result.
 * <br/>
 * 2^nd operation is multiplying the number by 2^X then multiplying it by 5^X
 * <br/>
 * and print the last digit of the result.
 * <br/>
 * Koko needs your help to solve this problem.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 2
 * <br/>
 * 1 4 3
 * <br/>
 * 2 2 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>0 0 5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 1
 * <br/>
 * 10
 * <br/>
 * 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 */

public class HelpKokoExample {
    private static int lengthNumbers;
    private static long[] numbers;
    private static byte[] operationsNumbers;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        printResultOfCalculateOperations();
    }

    private static void printResultOfCalculateOperations() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int index = 0; index < lengthNumbers; index++) {
            if (operationsNumbers[index] == 1) {
                if (isPrime(numbers[index])) {
                    if (numbers[index] % 2 == 0) OUTPUT.write("0 ");
                    else OUTPUT.write("5 ");
                } else OUTPUT.write("-1 ");
            } else OUTPUT.write("0 ");
        }
        OUTPUT.flush();
    }

    private static boolean isPrime(final long NUMBER) {
        if (NUMBER == 1) return false;
        else if (NUMBER == 2 || NUMBER == 3) return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (long index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
            return true;
        }
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(INPUT.readLine());
        lengthNumbers = Integer.parseInt(line.nextToken());
        line.nextToken();
        numbers = new long[lengthNumbers];
        operationsNumbers = new byte[lengthNumbers];
        line = new StringTokenizer(INPUT.readLine());
        for (int index = 0; index < lengthNumbers; index++) numbers[index] = Integer.parseInt(line.nextToken());
        line = new StringTokenizer(INPUT.readLine());
        for (int index = 0; index < lengthNumbers; index++) operationsNumbers[index] = Byte.parseByte(line.nextToken());
    }
}