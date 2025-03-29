package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_26;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print all the prime factors of a given number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 78
 * <br/>
 * 2 3 13
 * </h2>
 */

public class Question26 {
    public static void main(final String[] ARGUMENTS) {
        final int TARGET_NUMBER = 78;
        System.out.printf("Input a number: %d\n", TARGET_NUMBER);
        printAllPrimeFactors(TARGET_NUMBER);
    }

    private static void printAllPrimeFactors(int targetNumber) {
        for (int primeFactorial = 2; primeFactorial <= targetNumber; primeFactorial++)
            while (targetNumber % primeFactorial == 0) {
                System.out.printf("%d ", primeFactorial);
                targetNumber /= primeFactorial;
            }
    }
}