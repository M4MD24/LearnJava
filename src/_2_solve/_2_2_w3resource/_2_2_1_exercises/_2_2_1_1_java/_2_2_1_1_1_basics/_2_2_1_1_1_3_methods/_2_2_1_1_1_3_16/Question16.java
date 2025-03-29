package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_3_methods._2_2_1_1_1_3_16;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method to find all twin prime numbers less than 100.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * (3, 5)
 * <br/>
 * (5, 7)
 * <br/>
 * (11, 13)
 * <br/>
 * (17, 19)
 * <br/>
 * (29, 31)
 * <br/>
 * (41, 43)
 * <br/>
 * (59, 61)
 * <br/>
 * (71, 73)
 * </h2>
 */
public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        printAllTwinPrimeNumbersLessThan100();
    }

    private static void printAllTwinPrimeNumbersLessThan100() {
        for (int number = 3; number < 100; number++)
            if (isPrime(number) && isPrime(number + 2))
                System.out.printf("(%d, %d)\n",
                        number,
                        number + 2);
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 3) return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
            return true;
        }
    }
}