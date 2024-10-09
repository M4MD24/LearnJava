package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_21;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the number with the maximum number of distinct prime factors in a given range.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input first integer: 5
 * <br/>
 * Input second integer: 25
 * <br/>
 * Maximum number of distinct prime factors of the said range: 6
 * </h2>
 */

public class Question21 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = 5,
                SECOND_NUMBER = 25;
        System.out.printf("""
                        Input first integer:\s%d
                        Input first integer:\s%d
                        Maximum number of distinct prime factors of the said range:\s%d""",
                FIRST_NUMBER,
                SECOND_NUMBER,
                getCountMaximumNumberOfDistinctPrimeFactors(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static int getCountMaximumNumberOfDistinctPrimeFactors(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        int currentCountMaximumNumberOfDistinctPrimeFactors = 0,
                countMaximumNumberOfDistinctPrimeFactors = 0;
        for (int number = FIRST_NUMBER; number <= SECOND_NUMBER; number++) {
            final int COUNT = countDistinctPrimeFactors(number);
            if (COUNT > currentCountMaximumNumberOfDistinctPrimeFactors) {
                currentCountMaximumNumberOfDistinctPrimeFactors = COUNT;
                countMaximumNumberOfDistinctPrimeFactors = number;
            }
        }
        return countMaximumNumberOfDistinctPrimeFactors;
    }

    private static int countDistinctPrimeFactors(int number) {
        final Set<Integer> PRIME_FACTORS = new HashSet<>();
        while (number % 2 == 0) {
            PRIME_FACTORS.add(2);
            number /= 2;
        }
        for (int index = 3; index <= Math.sqrt(number); index += 2)
            while (number % index == 0) {
                PRIME_FACTORS.add(index);
                number /= index;
            }
        if (number > 2)
            PRIME_FACTORS.add(number);
        return PRIME_FACTORS.size();
    }
}