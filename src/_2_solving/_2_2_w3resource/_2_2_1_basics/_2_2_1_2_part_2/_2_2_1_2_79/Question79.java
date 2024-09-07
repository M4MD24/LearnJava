package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_79;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program that reads the two adjoining sides and the diagonal of a parallelogram. It will check whether the parallelogram is a rectangle or a rhombus.
 * <br/>
 * According to Wikipedia - parallelograms: In Euclidean geometry, a parallelogram is a simple (non-self-intersecting) quadrilateral with two pairs of parallel sides. The opposite or facing sides of a parallelogram are of equal length and the opposite angles of a parallelogram are of equal measure.
 * <br/>
 * rectangles: In Euclidean plane geometry, a rectangle is a quadrilateral with four right angles. It can also be defined as an equiangular quadrilateral, since equiangular means that all of its angles are equal (360°/4 = 90°). It can also be defined as a parallelogram containing a right angle.
 * <br/>
 * rhombus: In plane Euclidean geometry, a rhombus (plural rhombi or rhombuses) is a simple (non-self-intersecting) quadrilateral whose four sides all have the same length. Another name is equilateral quadrilateral, since equilateral means that all of its sides are equal in length. The rhombus is often called a diamond, after the diamonds suit in playing cards which resembles the projection of an octahedral diamond, or a lozenge, though the former sometimes refers specifically to a rhombus with a 60° angle (see Polyiamond), and the latter sometimes refers specifically to a rhombus with a 45° angle.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input two adjoined sides and the diagonal of a parallelogram (comma separated):
 * <br/>
 * 8,8,8
 * <br/>
 * This is a rhombus.
 * </h2>
 */

public class Question79 {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.println("Enter the lengths of two adjoining sides and the diagonal of the parallelogram (comma separated):");
        final String[] SIDES = INPUT.nextLine().split(",");
        if (SIDES.length != 3) {
            System.out.println("\u001B[31mInvalid input format. Please provide two adjoining sides and the diagonal separated by commas.");
            return;
        }
        System.out.print(getPolygonStatus(Double.parseDouble(SIDES[0]), Double.parseDouble(SIDES[1]), Double.parseDouble(SIDES[2])));
    }

    private static String getPolygonStatus(final double FIRST_SIDE, final double SECOND_SIDE, final double DIAGONAL) {
        if (isRectangle(FIRST_SIDE, SECOND_SIDE, DIAGONAL))
            return "This is a rectangle.";
        else if (isRhombus(FIRST_SIDE, SECOND_SIDE))
            return "This is a rhombus.";
        else
            return "This is neither a rectangle nor a rhombus.";
    }

    private static boolean isRectangle(final double FIRST_SIDE, final double SECOND_SIDE, final double DIAGONAL) {
        return DIAGONAL * DIAGONAL == FIRST_SIDE * FIRST_SIDE + SECOND_SIDE * SECOND_SIDE;
    }

    private static boolean isRhombus(final double FIRST_SIDE, final double SECOND_SIDE) {
        return FIRST_SIDE == SECOND_SIDE;
    }
}