package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_84;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>
 * If you draw a straight line on a plane, the plane is divided into two regions. For example, if you draw two straight lines in parallel, you get three areas. If you draw vertically from one to the other you get 4 areas.
 * <br/>
 * Write a Java program to create the maximum number of regions obtained by drawing n given straight lines.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input count of straight lines:
 * <br/>
 * 5
 * <br/>
 * Count of regions:
 * <br/>
 * 16
 * </h2>
 */

public class Question84 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input count of straight lines: ");
        final int COUNT_OF_STRAIGHT_LINES = INPUT.nextInt();
        System.out.printf("Count of regions: %d", getCountOfRegions(COUNT_OF_STRAIGHT_LINES));
    }

    private static int getCountOfRegions(final int COUNT_OF_STRAIGHT_LINES) {
        return (COUNT_OF_STRAIGHT_LINES * (COUNT_OF_STRAIGHT_LINES + 1) >> 1) + 1;
    }
}