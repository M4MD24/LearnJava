package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_67_question_217;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print the number of prime numbers less than or equal to a given integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the number: 1235
 * <br/>
 * Number of prime numbers which are less than or equal to n: 202
 * </h2>
 */

public class Question217 {
    public static void main(final String[] ARGS) {
        final int TARGET_NUMBER = 1235;
        System.out.println(STR."Input the target number: \{TARGET_NUMBER}");
        System.out.println(STR."Number of prime numbers which are less than or equal to target number: \{getCountOfPrimeNumbersLessThanOrEqualToTargetNumber(TARGET_NUMBER)}");
    }

    private static int getCountOfPrimeNumbersLessThanOrEqualToTargetNumber(final int TARGET_NUMBER) {
        int countOFPrimeNumbersLessThanOrEqualToTargetNumber = 2;
        for (int index = 5; index <= TARGET_NUMBER; index++)
            if (isPrime(index))
                countOFPrimeNumbersLessThanOrEqualToTargetNumber++;
        return countOFPrimeNumbersLessThanOrEqualToTargetNumber;
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0)
                    return false;
            return true;
        }
    }
}