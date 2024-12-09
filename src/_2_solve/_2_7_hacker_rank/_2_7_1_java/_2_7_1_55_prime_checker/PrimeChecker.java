package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_55_prime_checker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_55_prime_checker.files <h2>Question</h2>
 */

class Prime {
    public void checkPrime(final int... NUMBERS) {
        boolean foundPrime = false;
        for (final int NUMBER : NUMBERS)
            if (isPrime(NUMBER)) {
                if (foundPrime)
                    System.out.print(" ");
                System.out.print(NUMBER);
                foundPrime = true;
            }
        System.out.println();
    }

    private boolean isPrime(final int NUMBER) {
        if (NUMBER <= 1)
            return false;
        else if (NUMBER == 2)
            return true;
        else if (NUMBER % 2 == 0)
            return false;
        else {
            for (int index = 3; index <= Math.sqrt(NUMBER); index += 2)
                if (NUMBER % index == 0)
                    return false;
            return true;
        }
    }
}

public class PrimeChecker {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final int[] inputs = new int[5];
        for (int index = 0; index < 5; index++)
            inputs[index] = Integer.parseInt(INPUT.readLine().trim());
        final Prime PRIME = new Prime();
        PRIME.checkPrime(inputs[0]);
        PRIME.checkPrime(inputs[0], inputs[1]);
        PRIME.checkPrime(inputs[0], inputs[1], inputs[2]);
        PRIME.checkPrime(inputs[0], inputs[1], inputs[2], inputs[3], inputs[4]);
    }
}