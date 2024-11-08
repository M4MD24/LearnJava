package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_29_primality_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_29_primality_test.files <h2>Question</h2>
 */

public class PrimalityTest {
    public static void main(final String[] PARAMETERS) throws IOException {
        System.out.print(new BigInteger(new BufferedReader(new InputStreamReader(System.in)).readLine()).isProbablePrime(10) ? "prime" : "not prime");
    }
}