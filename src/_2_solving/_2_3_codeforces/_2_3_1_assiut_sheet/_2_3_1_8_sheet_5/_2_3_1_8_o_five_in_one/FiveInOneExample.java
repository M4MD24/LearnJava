package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_o_five_in_one;

import java.util.Scanner;

/**
 * <h1>O. Five in One</h1>
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
 * <h1>Question:</h1>
 * <h2>Given an array A of size N. write five functions that do the following:</h2>
 * <ol>
 *     <li>Get the value of the maximum number in the array.</li>
 *     <li>Get the value of the minimum number in the array.</li>
 *     <li>Count the prime numbers in the array.</li>
 *     <li>Count the palindrome numbers in the array.</li>
 *     <li>Get the number that has the maximum number of divisors, and if there are more than one number that has the maximum number of divisors , print the maximum of them.</li>
 * </ol>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using functions</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1 2 5 8
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * The maximum number : 8
 * <br/>
 * The minimum number : 1
 * <br/>
 * The number of prime numbers : 2
 * <br/>
 * The number of palindrome numbers : 4
 * <br/>
 * The number that has the maximum number of divisors : 8
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 8 2 14 1 83
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * The maximum number : 83
 * <br/>
 * The minimum number : 1
 * <br/>
 * The number of prime numbers : 2
 * <br/>
 * The number of palindrome numbers : 3
 * <br/>
 * The number that has the maximum number of divisors : 14
 * </h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_o_five_in_one.images <h2>Notes</h2>
 */

public class FiveInOneExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static byte maximumNumber = 1,
            minimumNumber = 100,
            primeNumbers = 0,
            palindromeNumbers = 0,
            maximumNumberOfDivisors = 1,
            countOfDivisors = 1;

    public static void main(final String[] PARAMETERS) {
        inputValues();
        printValues();
    }

    private static void printValues() {
        System.out.printf("""
                        The maximum number : %d
                        The minimum number : %d
                        The number of prime numbers : %d
                        The number of palindrome numbers : %d
                        The number that has the maximum number of divisors : %d""",
                maximumNumber,
                minimumNumber,
                primeNumbers,
                palindromeNumbers,
                maximumNumberOfDivisors);
    }

    private static void inputValues() {
        for (byte index = 0; index < LENGTH; index++) {
            final byte CURRENT_NUMBER = INPUT.nextByte();
            if (CURRENT_NUMBER > maximumNumber) maximumNumber = CURRENT_NUMBER;
            if (CURRENT_NUMBER < minimumNumber) minimumNumber = CURRENT_NUMBER;
            if (isPrime(CURRENT_NUMBER)) primeNumbers++;
            if (isPalindrome(CURRENT_NUMBER)) palindromeNumbers++;
            calculateMaximumCountDivisors(CURRENT_NUMBER);
        }
    }

    private static void calculateMaximumCountDivisors(final byte CURRENT_NUMBER) {
        byte currentCountOfDivisors = countDivisors(CURRENT_NUMBER);
        if (currentCountOfDivisors > countOfDivisors ||
                (currentCountOfDivisors == countOfDivisors && CURRENT_NUMBER > maximumNumberOfDivisors))
            setMaximumCountOfDivisors(CURRENT_NUMBER, currentCountOfDivisors);
    }

    private static void setMaximumCountOfDivisors(byte CURRENT_NUMBER, byte currentCountOfDivisors) {
        maximumNumberOfDivisors = CURRENT_NUMBER;
        countOfDivisors = currentCountOfDivisors;
    }

    private static byte countDivisors(byte currentNumber) {
        byte countOfDivisors = 2;
        for (byte index = 2; index < currentNumber; index++)
            if (currentNumber % index == 0)
                countOfDivisors++;
        return countOfDivisors;
    }

    private static boolean isPalindrome(final byte CURRENT_NUMBER) {
        if (CURRENT_NUMBER < 10) return true;
        else if (CURRENT_NUMBER < 100) return (CURRENT_NUMBER % 10 == CURRENT_NUMBER / 10);
        else return (CURRENT_NUMBER % 10 == CURRENT_NUMBER / 100);
    }

    private static boolean isPrime(final byte CURRENT_NUMBER) {
        if (CURRENT_NUMBER == 1) return false;
        for (byte index = 2; index < CURRENT_NUMBER; index++)
            if (CURRENT_NUMBER % index == 0) return false;
        return true;
    }
}