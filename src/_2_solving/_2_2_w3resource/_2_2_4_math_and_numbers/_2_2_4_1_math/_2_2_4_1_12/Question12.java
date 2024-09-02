package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_12;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the number of prime numbers less than a given positive number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an integer: 25
 * <br/>
 * The number of prime numbers: 9
 * </h2>
 */

public class Question12 {
    public static void main(final String[] ARGS) {
        final int TARGET_NUMBER = 25;
        System.out.printf("""
                        Input an integer:\s%d
                        The number of prime numbers:\s%d""",
                TARGET_NUMBER,
                getCountPrimeNumbersToTargetNumber(TARGET_NUMBER));
    }

    private static int getCountPrimeNumbersToTargetNumber(final int TARGET_NUMBER) {
        int countPrimeNumbersToTargetNumber = 0;
        for (int number = 2; number < TARGET_NUMBER; number++)
            if (isPrime(number))
                countPrimeNumbersToTargetNumber++;
        return countPrimeNumbersToTargetNumber;
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