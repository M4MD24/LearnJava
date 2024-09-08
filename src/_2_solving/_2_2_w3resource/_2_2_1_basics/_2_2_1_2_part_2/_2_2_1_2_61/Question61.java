package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_61;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the heights of the top three buildings in descending order from eight given buildings.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the heights of eight buildings:
 * <br/>
 * 25 19 23 45 18 23 24 19
 * <br/>
 * <br/>
 * Heights of the top three buildings:
 * <br/>
 * 45
 * <br/>
 * 25
 * <br/>
 * 24
 * </h2>
 */

public class Question61 {
    public static void main(final String[] PARAMETERS) {
        final ArrayList<Integer> HEIGHT_BUILDINGS = new ArrayList<>();
        printHeightBuildings(HEIGHT_BUILDINGS);
        printTopThreeBuildings(HEIGHT_BUILDINGS);
    }

    private static void printTopThreeBuildings(final ArrayList<Integer> HEIGHT_BUILDINGS) {
        System.out.println("\nHeights of the top three buildings:");
        HEIGHT_BUILDINGS.sort(Comparator.reverseOrder());
        for (int index = 0; index < 3; index++)
            System.out.println(HEIGHT_BUILDINGS.get(index));
    }

    private static void printHeightBuildings(final ArrayList<Integer> HEIGHT_BUILDINGS) {
        System.out.println("Input the heights of eight buildings:");
        HEIGHT_BUILDINGS.add(25);
        HEIGHT_BUILDINGS.add(19);
        HEIGHT_BUILDINGS.add(23);
        HEIGHT_BUILDINGS.add(45);
        HEIGHT_BUILDINGS.add(18);
        HEIGHT_BUILDINGS.add(23);
        HEIGHT_BUILDINGS.add(24);
        HEIGHT_BUILDINGS.add(19);
        for (final int HEIGHT_BUILDING : HEIGHT_BUILDINGS)
            System.out.printf("%d ", HEIGHT_BUILDING);
    }
}