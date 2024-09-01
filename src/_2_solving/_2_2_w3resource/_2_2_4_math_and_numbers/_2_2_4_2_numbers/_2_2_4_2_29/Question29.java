package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_29;

import java.util.ArrayList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check whether a number is a <a href="https://en.wikipedia.org/wiki/Lucky_number">Lucky number</a> or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an integer: 25
 * <br/>
 * Is Lucky number? true
 * </h2>
 */
public class Question29 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 25;
        System.out.println("Input an integer: " + NUMBER);
        System.out.print("Is Lucky number? " + isLucky(NUMBER));
    }

    private static boolean isLucky(final int NUMBER) {
        if (NUMBER % 2 == 0)
            return false;
        else {
            final ArrayList<Integer> LUCKY_NUMBERS = new ArrayList<>();
            calculateLuckyNumbers(NUMBER, LUCKY_NUMBERS);
            return LUCKY_NUMBERS.contains(NUMBER);
        }
    }

    private static void removeSeventhNumbers(final ArrayList<Integer> LUCKY_NUMBERS) {
        for (int index = 6; index < LUCKY_NUMBERS.size(); index += 7)
            LUCKY_NUMBERS.remove(index);
    }

    private static void removeThirdNumbers(final ArrayList<Integer> LUCKY_NUMBERS) {
        for (int index = 2; index < LUCKY_NUMBERS.size(); index += 2)
            LUCKY_NUMBERS.remove(index);
    }

    private static void addOddNumbers(final int TARGET_NUMBER, final ArrayList<Integer> LUCKY_NUMBERS) {
        for (int oddNumber = 1; oddNumber <= TARGET_NUMBER; oddNumber += 2)
            LUCKY_NUMBERS.add(oddNumber);
    }

    private static void calculateLuckyNumbers(final int TARGET_NUMBER, final ArrayList<Integer> LUCKY_NUMBERS) {
        addOddNumbers(TARGET_NUMBER, LUCKY_NUMBERS);
        removeThirdNumbers(LUCKY_NUMBERS);
        removeSeventhNumbers(LUCKY_NUMBERS);
    }
}