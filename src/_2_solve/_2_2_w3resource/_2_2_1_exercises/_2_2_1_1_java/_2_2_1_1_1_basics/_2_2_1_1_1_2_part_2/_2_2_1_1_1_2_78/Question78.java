package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_78;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads n digits (given) chosen from 0 to 9 and prints the number of combinations where the sum of the digits equals another given number (s). Do not use the same digits in a combination.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * count of combination: 3
 * <br/>
 * target sum: 6
 * <br/>
 * count of combinations = 3
 * </h2>
 */

public class Question78 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static byte countOfCombination,
            targetSum;

    public static void main(final String[] ARGUMENTS) {
        if (inputCountOfCombination()) return;
        if (inputTargetSum()) return;
        System.out.printf("Count of combinations = %d", getCountOfCombinations(0, countOfCombination, targetSum, 0));
    }

    public static int getCountOfCombinations(final int INDEX, final int COUNT_OF_COMBINATION, final int TARGET_SUM, final int CURRENT_SUM) {
        if (TARGET_SUM == CURRENT_SUM && COUNT_OF_COMBINATION == 0)
            return 1;
        if (INDEX >= 10)
            return 0;
        if (CURRENT_SUM > TARGET_SUM)
            return 0;
        return getCountOfCombinations(INDEX + 1, COUNT_OF_COMBINATION - 1, TARGET_SUM, CURRENT_SUM + INDEX) +
                getCountOfCombinations(INDEX + 1, COUNT_OF_COMBINATION, TARGET_SUM, CURRENT_SUM);
    }

    private static boolean inputTargetSum() {
        System.out.print("2. Input target sum: ");
        try {
            targetSum = INPUT.nextByte();
            if (targetSum > 45 || targetSum < 0) {
                System.out.println("\u001B[31m2. Enter target sum between 0:45\u001B[0m\n");
                Question78.main(new String[]{});
                return true;
            }
        } catch (final Exception IGNORED) {
            System.out.println("\u001B[31m2. Enter target sum between 0:45]\u001B[0m\n");
        }
        return false;
    }

    private static boolean inputCountOfCombination() {
        System.out.print("1. Input count of combination: ");
        try {
            countOfCombination = INPUT.nextByte();
            if (countOfCombination > 9 || countOfCombination < 1) {
                System.out.println("\u001B[31m1. Enter count of combination between 0:9\u001B[0m\n");
                Question78.main(new String[]{});
                return true;
            }
        } catch (final Exception IGNORED) {
            System.out.println("\u001B[31m1. Enter count of combination between 0:9]\u001B[0m\n");
        }
        return false;
    }
}