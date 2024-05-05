package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_20_question_359;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>
 * In mathematics, the sieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit.
 * <br/>
 * Write a Java program to print all primes smaller than or equal to any given number.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the number: 125
 * <br/>
 * Prime numbers <= 125: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113]
 * </h2>
 */

public class Question359 {
    public static void main(final String[] ARGS) {
        final int TARGET_NUMBER = 125;
        System.out.println(STR."Input the number: \{TARGET_NUMBER}");
        final boolean[] PRIME_NUMBERS = new boolean[TARGET_NUMBER + 1];
        addPrimeNumbersLessThanAndEqualsTargetNumberWithSieveOfEratosthenesAlgorithm(PRIME_NUMBERS, TARGET_NUMBER);
        printPrimeNumbers(PRIME_NUMBERS, TARGET_NUMBER);
    }

    private static void printPrimeNumbers(final boolean[] PRIME_NUMBERS_STATUS, final int TARGET_NUMBER) {
        System.out.print(STR."Prime numbers <= \{TARGET_NUMBER}: ");
        final ArrayList<Integer> PRIME_NUMBERS = new ArrayList<>();
        for (int number = 2; number <= TARGET_NUMBER; number++)
            if (PRIME_NUMBERS_STATUS[number])
                PRIME_NUMBERS.add(number);
        System.out.print(PRIME_NUMBERS);
    }

    private static void addPrimeNumbersLessThanAndEqualsTargetNumberWithSieveOfEratosthenesAlgorithm(final boolean[] PRIME_NUMBERS, final int TARGET_NUMBER) {
        Arrays.fill(PRIME_NUMBERS, false);
        for (int number = 2; number < TARGET_NUMBER; number++)
            if (isPrime(number))
                PRIME_NUMBERS[number] = true;
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 2 || NUMBER == 3) return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
            return true;
        }
    }
}