package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_34;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to compute hexagon area.
 * <br/>
 * Area of a hexagon = (6 * s^2)/(4*tan(PI/6))
 * <br/>
 * where s is the length of a side
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the length of a side of the hexagon: 6</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The area of the hexagon is: 93.53074360871938</h2>
 */

public class Question34 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the length of a side of the hexagon: ");
        int lengthSide = input.nextInt();

        double areaOfHexagon = ((6 * Math.pow(lengthSide, 2)) / (4 * Math.tan(Math.PI / 6)));
        System.out.print("The area of the hexagon is: " + areaOfHexagon);
    }
}