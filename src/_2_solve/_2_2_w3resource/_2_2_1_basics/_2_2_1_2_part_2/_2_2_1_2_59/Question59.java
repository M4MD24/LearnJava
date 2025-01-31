package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_59;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find all unique combinations from a collection of candidate numbers. The sum of the numbers will equal a given target number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of elements of the array: 3</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Enter elements:
 * <br/>
 * 6 7 8
 * <br/>
 * Enter target sum:
 * <br/>
 * 21
 * <br/>
 * A solution set is:
 * <br/>
 * { 6 7 8 }
 * </h2>
 */

public class Question59 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int countOfNumbers;
    private static int[] numbers;
    private static int targetSum;

    public static void main(final String[] ARGUMENTS) {
        inputAndPrintCountOfNumbers();
        inputAndPrintNumbers();
        inputAndPrintTargetSum();
        printNumbersEqualsTargetSum();
    }

    private static void printNumbersEqualsTargetSum() {
        System.out.println("A solution set is:");
        getNumbersEqualsTargetSum(numbers, targetSum);
    }

    private static void inputAndPrintTargetSum() {
        System.out.println("Enter target sum:");
        targetSum = INPUT.nextInt();
    }

    private static void inputAndPrintNumbers() {
        System.out.println("Enter numbers:");
        numbers = new int[countOfNumbers];
        for (int index = 0; index < countOfNumbers; index++)
            numbers[index] = INPUT.nextInt();
    }

    private static void inputAndPrintCountOfNumbers() {
        System.out.println("Input count of numbers: ");
        countOfNumbers = INPUT.nextInt();
    }

    private static void addNumber(final Map<Integer, List<Integer>> NUMBERS, final int FIRST_NUMBER, final int SECOND_NUMBER) {
        if (!NUMBERS.containsKey(FIRST_NUMBER))
            NUMBERS.put(FIRST_NUMBER, new ArrayList<>());
        NUMBERS.get(FIRST_NUMBER).add(SECOND_NUMBER);
    }

    private static void printNumbersEqualsTargetSum(final int[] NUMBERS_EQUALS_TARGET_SUM, final int START_INDEX, final int END_INDEX) {
        System.out.print("{ ");
        for (int index = START_INDEX; index <= END_INDEX; index++)
            System.out.printf("%d ", NUMBERS_EQUALS_TARGET_SUM[index]);
        System.out.println("}");
    }

    private static void getNumbersEqualsTargetSum(final int[] NUMBERS, final int TARGET_SUM) {
        final Map<Integer, List<Integer>> THREE_NUMBERS = new HashMap<>();
        addNumber(THREE_NUMBERS, 0, -1);
        int currentSum = 0;
        for (int index = 0; index < NUMBERS.length; index++) {
            currentSum += NUMBERS[index];
            if (THREE_NUMBERS.containsKey(currentSum - TARGET_SUM)) {
                final List<Integer> LIST_OF_NUMBERS = THREE_NUMBERS.get(currentSum - TARGET_SUM);
                for (final int NUMBER : LIST_OF_NUMBERS)
                    printNumbersEqualsTargetSum(NUMBERS, NUMBER + 1, index);
            }
            addNumber(THREE_NUMBERS, currentSum, index);
        }
    }
}