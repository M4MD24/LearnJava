package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_35;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to compute the area of a polygon.
 * <br/>
 * Area of a polygon = (n*sideLength^2)/(4*tan(PI/n))
 * <br/>
 * where n is n-sided polygon and s is the length of a side
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the number of sides on the polygon: 7
 * <br/>
 * Input the length of one of the sides: 6
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The area is: 130.82084798405722</h2>
 */

public class Question35 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of sides on the polygon: ");
        int numberSide = input.nextInt();

        System.out.print("Input the length of one of the sides: ");
        int lengthSide = input.nextInt();

        double areaOfPolygon = (numberSide * Math.pow(lengthSide, 2)) / (4 * Math.tan(Math.PI / numberSide));
        System.out.println("The area is: " + areaOfPolygon);
    }
}