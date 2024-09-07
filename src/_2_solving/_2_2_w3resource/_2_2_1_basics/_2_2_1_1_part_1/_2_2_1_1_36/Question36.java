package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_36;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to compute the distance between two points on the earth's surface.
 * <br/>
 * Distance between the two points [ (x1,y1) & (x2,y2)]
 * <br/>
 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * <br/>
 * Radius of the earth r = 6371.01 Kilometers
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the latitude of coordinate 1: 25
 * <br/>
 * Input the longitude of coordinate 1: 35
 * <br/>
 * Input the latitude of coordinate 2: 35.5
 * <br/>
 * Input the longitude of coordinate 2: 25.5
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The distance between those points is: 1480.0848451069087 km</h2>
 */

public class Question36 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        float latitudeOfCoordinate1 = input.nextFloat();

        System.out.print("Input the longitude of coordinate 1: ");
        float longitudeOfCoordinate1 = input.nextFloat();

        System.out.print("Input the latitude of coordinate 2: ");
        float latitudeOfCoordinate2 = input.nextFloat();

        System.out.print("Input the longitude of coordinate 2: ");
        float longitudeOfCoordinate2 = input.nextFloat();

        System.out.print("The distance between those points is: " + distanceBetweenPoints(latitudeOfCoordinate1, longitudeOfCoordinate1, latitudeOfCoordinate2, longitudeOfCoordinate2) + " km");
    }

    private static double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        final float RADIUS_OF_EARTH = 6371.01F;

        return RADIUS_OF_EARTH * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }
}