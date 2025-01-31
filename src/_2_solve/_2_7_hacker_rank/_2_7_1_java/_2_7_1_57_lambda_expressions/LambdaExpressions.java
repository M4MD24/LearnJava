package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_57_lambda_expressions;

import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_57_lambda_expressions.files <h2>Question</h2>
 */

public class LambdaExpressions {
    interface PerformOperation {
        boolean check(final int NUMBER);
    }

    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final int COUNT_OF_TEST_CASES = INPUT.nextInt();
        final PerformOperation
                IS_ODD = number -> number % 2 != 0,
                IS_PRIME = number -> {
                    if (number == 0 || number == 1)
                        return false;
                    else if (number == 2 || number == 3)
                        return true;
                    else if (number % 2 == 0 || number % 3 == 0)
                        return false;
                    else {
                        for (int index = 5; index * index <= number; index += 2)
                            if (number % index == 0 || (number % (index + 2)) == 0)
                                return false;
                        return true;
                    }
                },
                IS_PALINDROME = number -> {
                    if (number < 0 || (number % 10 == 0 && number != 0))
                        return false;
                    else {
                        int reversedNumber = 0;
                        while (number > reversedNumber) {
                            reversedNumber = reversedNumber * 10 + number % 10;
                            number /= 10;
                        }
                        return number == reversedNumber || number == reversedNumber / 10;
                    }
                };
        for (int index = 0; index < COUNT_OF_TEST_CASES; index++) {
            final int OPERATION_TYPE = INPUT.nextInt(),
                    NUMBER = INPUT.nextInt();
            switch (OPERATION_TYPE) {
                case 1 -> System.out.println(
                        IS_ODD.check(NUMBER)
                                ? "ODD"
                                : "EVEN"
                );
                case 2 -> System.out.println(
                        IS_PRIME.check(NUMBER)
                                ? "PRIME"
                                : "COMPOSITE"
                );
                case 3 -> System.out.println(
                        IS_PALINDROME.check(NUMBER)
                                ? "PALINDROME"
                                : "NOT PALINDROME"
                );
            }
        }
    }
}