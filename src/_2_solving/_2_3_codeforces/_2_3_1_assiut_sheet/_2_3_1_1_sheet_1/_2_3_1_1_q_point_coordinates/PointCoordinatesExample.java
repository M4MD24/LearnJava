package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_q_point_coordinates;

import java.util.Scanner;

/**
 * <h1>Q. Coordinates of a Point</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given two numbers X, Y which donate coordinates of a point in 2D plan. Determine in which quarter does it belong.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * Print Q1, Q2, Q3, Q4 according to the quarter in which the point belongs to.
 * <br/>
 * Print "Origem" If the point is at the origin.
 * <br/>
 * Print "Eixo X" If the point is over X axis.
 * <br/>
 * Print "Eixo Y" if the point is over Y axis.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4.5 -2.2</h2>
 * <h1>Output:</h1>
 * <h2>Q4</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>0.1 0.1</h2>
 * <h1>Output:</h1>
 * <h2>Q1</h2>
 */

public class PointCoordinatesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final float LATITUDE = Float.parseFloat(INPUT.next()),
            LONGITUDE = Float.parseFloat(INPUT.next());

    public static void main(final String[] PARAMETERS) {
        System.out.print(coordinatesPoint());
    }

    private static String coordinatesPoint() {
        String coordinatesPoint = "Q";
        if (LATITUDE > 0 && LONGITUDE > 0) coordinatesPoint += 1;
        else if (LATITUDE < 0 && LONGITUDE > 0) coordinatesPoint += 2;
        else if (LATITUDE < 0 && LONGITUDE < 0) coordinatesPoint += 3;
        else if (LATITUDE > 0 && LONGITUDE < 0) coordinatesPoint += 4;
        else if (LATITUDE == 0 && LONGITUDE == 0) coordinatesPoint = "Origem";
        else if (LATITUDE != 0) coordinatesPoint = "Eixo X";
        else coordinatesPoint = "Eixo Y";
        return coordinatesPoint;
    }
}