package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2601_prime_subtraction_operation;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a 0-indexed integer array nums of length n.
 * <br/>
 * <br/>
 * You can perform the following operation as many times as you want:
 * <br/>
 * <br/>
 * • Pick an index i that you haven’t picked before, and pick a prime p strictly less than nums[i], then subtract p from nums[i].
 * <br/>
 * <br/>
 * Return true if you can make nums a strictly increasing array using the above operation and false otherwise.
 * <br/>
 * <br/>
 * A strictly increasing array is an array whose each element is strictly greater than its preceding element.
 * </h2>
 */

public class PrimeSubtractionOperation {
    public static void main(final String[] PARAMETERS) {
        System.out.print(primeSubOperation(new int[]{4, 9, 6, 10}));
    }

    public static boolean primeSubOperation(final int[] NUMBERS) {
        final int MAIXMUM_ELEMENT = getMaxElement(NUMBERS);
        final boolean[] SIEVE = new boolean[MAIXMUM_ELEMENT + 1];
        Arrays.fill(SIEVE, true);
        SIEVE[1] = false;
        for (int primeCandidate = 2; primeCandidate <= Math.sqrt(MAIXMUM_ELEMENT + 1); primeCandidate++)
            if (SIEVE[primeCandidate])
                for (int multiple = primeCandidate * primeCandidate; multiple <= MAIXMUM_ELEMENT; multiple += primeCandidate)
                    SIEVE[multiple] = false;
        int currentValue = 1;
        int index = 0;
        while (index < NUMBERS.length) {
            final int DIFFERENCE = NUMBERS[index] - currentValue;
            if (DIFFERENCE < 0)
                return false;
            else if (SIEVE[DIFFERENCE] || DIFFERENCE == 0)
                index++;
            currentValue++;
        }
        return true;
    }

    private static int getMaxElement(final int[] NUMBERS) {
        int maximumElement = -1;
        for (final int NUMBER : NUMBERS)
            if (NUMBER > maximumElement)
                maximumElement = NUMBER;
        return maximumElement;
    }

// >
    /*private static boolean primeSubOperation(final int[] NUMBERS) {
        int previousValue = 0;
        for (int currentIndex = 0; currentIndex < NUMBERS.length; currentIndex++) {
            boolean foundValidPrime = false;
            for (int primeCandidate = NUMBERS[currentIndex] - 1; primeCandidate > 1; primeCandidate--)
                if (isPrime(primeCandidate) && NUMBERS[currentIndex] - primeCandidate > previousValue) {
                    NUMBERS[currentIndex] -= primeCandidate;
                    previousValue = NUMBERS[currentIndex];
                    foundValidPrime = true;
                    break;
                }
            if (!foundValidPrime && NUMBERS[currentIndex] <= previousValue)
                return false;
            else
                previousValue = NUMBERS[currentIndex];
        }
        return true;
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 0 || NUMBER == 1)
            return false;
        else if (NUMBER == 2 || NUMBER == 3)
            return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0)
            return false;
        else {
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0)
                    return false;
            return true;
        }
    }*/
}