package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_48;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the position of a given prime number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a positive integer: 15
 * <br/>
 * Position of the said Prime number: 6
 * </h2>
 */

public class Question48 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 15;
        System.out.printf("Input a positive integer: %d\n", NUMBER);
        System.out.printf("Positive of the said prime number: %d", getNumberOfPositionsPrimeNumber(NUMBER));
    }

    private static int getNumberOfPositionsPrimeNumber(final int NUMBER) {
        int numberOfPositionsPrimeNumber = 0;
        for (int index = 2; index < NUMBER; index++)
            if (isPrime(index))
                numberOfPositionsPrimeNumber++;
        return numberOfPositionsPrimeNumber;
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