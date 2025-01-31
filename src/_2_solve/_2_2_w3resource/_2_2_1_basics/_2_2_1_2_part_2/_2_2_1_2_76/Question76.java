package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_76;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print mode values from a given sequence of integers. The mode value is the element that occurs most frequently. If there are several mode values, print them in ascending order.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * How many integers would you like to input(Max.100?)
 * <br/>
 * 5
 * <br/>
 * Input the integers:
 * <br/>
 * 25
 * <br/>
 * 35
 * <br/>
 * 15
 * <br/>
 * 5
 * <br/>
 * 45
 * <br/>
 * Mode value(s)in ascending order:
 * <br/>
 * 5
 * <br/>
 * 15
 * <br/>
 * 25
 * <br/>
 * 35
 * <br/>
 * 45
 * </h2>
 */

public class Question76 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        System.out.print("How many numbers: ");
        final int COUNT_OF_NUMBERS = INPUT.nextInt();
        System.out.println("Input the numbers:");
        final ArrayList<Integer> NUMBERS = new ArrayList<>();
        inputNumbers(NUMBERS, COUNT_OF_NUMBERS);
        printModeValueOrSortNumbers(NUMBERS);
    }

    private static void printModeValueOrSortNumbers(final ArrayList<Integer> NUMBERS) {
        for (int index = 0; index < NUMBERS.size(); index++) {
            final int NUMBER = NUMBERS.get(index);
            if (NUMBERS.lastIndexOf(NUMBER) != index) {
                System.out.printf("Mode value: %d", NUMBER);
                return;
            }
        }
        System.out.println("Numbers after sort:");
        NUMBERS.forEach(System.out::println);
    }

    private static void inputNumbers(final ArrayList<Integer> NUMBERS, final int COUNT_OF_NUMBERS) {
        for (int index = 0; index < COUNT_OF_NUMBERS; index++)
            NUMBERS.add(INPUT.nextInt());
    }
}