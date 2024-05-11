package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_83_question_233;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program that accepts an even number (n should be greater than or equal to 4 and less than or equal to 50,000, a Goldbach number) from the user and creates combinations that express the given number as a sum of two prime numbers. Print the number of combinations.
 * <br/>
 * Goldbach number: A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.[4] Since four is the only even number greater than two that requires the even prime 2 in order to be written as the sum of two primes, another form of the statement of Goldbach's conjecture is that all even integers greater than 4 are Goldbach numbers.
 * <br/>
 * The expression of a given even number as a sum of two primes is called a Goldbach partition of that number. The following are examples of Goldbach partitions for some even numbers:
 * <br/>
 * 6 = 3 + 3
 * <br/>
 * 8 = 3 + 5
 * <br/>
 * 10 = 3 + 7 = 5 + 5
 * <br/>
 * 12 = 7 + 5
 * <br/>
 * ...
 * <br/>
 * 100 = 3 + 97 = 11 + 89 = 17 + 83 = 29 + 71 = 41 + 59 = 47 + 53
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an even number: 100
 * <br/>
 * Count of two combinations: 6
 * </h2>
 */

public class Question233 {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input an even number: ");
        final int TARGET_SUM = INPUT.nextInt();
        try {
            if (TARGET_SUM % 2 == 0)
                System.out.printf("Count of two combinations: %d", getCountOfTwoCombinations(TARGET_SUM));
            else {
                System.out.println("\u001B[31mEnter even number\u001B[m");
                Question233.main(ARGS);
            }
        } catch (Exception IGNORED) {
            System.out.println("\u001B[31mEnter even number");
            Question233.main(ARGS);
        }
    }

    private static int getCountOfTwoCombinations(final int TARGET_SUM) {
        final ArrayList<Integer> PRIME_NUMBERS = new ArrayList<>();
        addPrimeNumbersLessThanEvenNumber(PRIME_NUMBERS, TARGET_SUM);
        int countOfCombinations = 0;
        for (int firstNumberIndex = 0; firstNumberIndex < PRIME_NUMBERS.size(); firstNumberIndex++)
            for (int secondNumberIndex = firstNumberIndex + 1; secondNumberIndex < PRIME_NUMBERS.size(); secondNumberIndex++)
                if (PRIME_NUMBERS.get(firstNumberIndex) + PRIME_NUMBERS.get(secondNumberIndex) == TARGET_SUM)
                    countOfCombinations++;
        return countOfCombinations;
    }

    private static void addPrimeNumbersLessThanEvenNumber(final ArrayList<Integer> PRIME_NUMBERS, final int EVEN_NUMBER) {
        for (int index = 2; index < EVEN_NUMBER; index++)
            if (isPrime(index))
                PRIME_NUMBERS.add(index);
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