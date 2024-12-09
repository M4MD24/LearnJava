package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_65;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write java program to solve problem, Suppose the population of the city increases by 4% each month, and we want to write a Java program to calculate the population of the city after n months.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Enter the initial population: 100000
 * <br/>
 * Enter percentage increase every month: %4
 * <br/>
 * Enter the number of months: 6
 * <br/>
 * Population after 6 months: 126531
 * </h2>
 */

public class Question65 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int POPULATION,
                MONTHS;
        final double PERCENTAGE_INCREASE_EVERY_MONTH;
        System.out.print("Enter the initial population: ");
        POPULATION = INPUT.nextInt();
        System.out.print("Enter percentage increase every month: %");
        PERCENTAGE_INCREASE_EVERY_MONTH = (double) INPUT.nextInt() / 100;
        System.out.print("Enter the number of months: ");
        MONTHS = INPUT.nextInt();
        printPopulationAfterIncrease(POPULATION, MONTHS, PERCENTAGE_INCREASE_EVERY_MONTH);
    }

    private static void printPopulationAfterIncrease(final int POPULATION, final int MONTHS, final double PERCENTAGE_INCREASE_EVERY_MONTH) {
        int populationAfterIncrease = POPULATION;
        for (int index = 0; index < MONTHS; index++)
            populationAfterIncrease += (int) Math.round(populationAfterIncrease * PERCENTAGE_INCREASE_EVERY_MONTH);
        System.out.printf("Population after %d months: %d\n", MONTHS, populationAfterIncrease);
    }
}