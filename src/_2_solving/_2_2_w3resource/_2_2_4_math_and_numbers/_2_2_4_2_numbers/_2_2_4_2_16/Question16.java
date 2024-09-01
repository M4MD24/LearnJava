package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_16;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to check two numbers are Amicable numbers or not.
 * <br/>
 * Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.
 * <br/>
 * The first ten amicable pairs are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the first number: 220
 * <br/>
 * Input the second number: 284
 * <br/>
 * These numbers are amicable.
 * </h2>
 */
public class Question16 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 220;
        System.out.println("Input the first number: " + FIRST_NUMBER);
        final int SECOND_NUMBER = 285;
        System.out.println("Input the second number: " + SECOND_NUMBER);
        System.out.printf("These numbers are%s amicable",
                areAmicableNumbers(FIRST_NUMBER, SECOND_NUMBER)
                        ? ""
                        : "n't");
    }

    private static boolean areAmicableNumbers(final int FIRST_NUBMER, final int SECOND_NUBMER) {
        return (sumOfProperDivisors(FIRST_NUBMER) == SECOND_NUBMER) && (sumOfProperDivisors(SECOND_NUBMER) == FIRST_NUBMER);
    }

    private static int sumOfProperDivisors(final int NUMBER) {
        int sum = 0;
        for (int number = 1; number <= NUMBER / 2; number++)
            if (NUMBER % number == 0)
                sum += number;
        return sum;
    }
}