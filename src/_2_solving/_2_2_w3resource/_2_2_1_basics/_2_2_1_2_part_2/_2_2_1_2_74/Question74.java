package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_74;

/**
 * <h1>Question:</h1>
 * <h2>
 * There are two circles C1 with radius r1, central coordinate (x1, y1) and C2 with radius r2 and central coordinate (x2, y2).
 * <br/>
 * Write a Java program to test the followings -
 * <br/>
 * "C2 is in C1" if C2 is in C1
 * <br/>
 * "C1 is in C2" if C1 is in C2
 * <br/>
 * "Circumference of C1 and C2 intersect" if circumference of C1 and C2 intersect, and
 * <br/>
 * "C1 and C2 do not overlap" if C1 and C2 do not overlap.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input x1, y1, r1: (numbers are separated by a space)
 * <br/>
 * 5 6 8
 * <br/>
 * Input x2, y2, r2: (numbers are separated by a space)
 * <br/>
 * 8 9 5
 * <br/>
 * C1 and C2  do not overlap
 * </h2>
 */

public class Question74 {
    public static void main(final String[] ARGS) {
        final int FIRST_CIRCLE_FIRST_CENTER = 5,
                FIRST_CIRCLE_SECOND_CENTER = 6,
                FIRST_CIRCLE_RADIUS = 8,
                SECOND_CIRCLE_FIRST_CENTER = 8,
                SECOND_CIRCLE_SECOND_CENTER = 9,
                SECOND_CIRCLE_RADIUS = 5;
        System.out.println("Enter the radius and coordinates of first circle:");
        System.out.printf("%d %d %d\n",
                FIRST_CIRCLE_FIRST_CENTER,
                FIRST_CIRCLE_SECOND_CENTER,
                FIRST_CIRCLE_RADIUS);
        System.out.println("Enter the radius and coordinates of second circle:");
        System.out.printf("%d %d %d\n",
                SECOND_CIRCLE_FIRST_CENTER,
                SECOND_CIRCLE_SECOND_CENTER,
                SECOND_CIRCLE_RADIUS);
        System.out.print(getOverlapStatus(FIRST_CIRCLE_FIRST_CENTER,
                FIRST_CIRCLE_SECOND_CENTER,
                FIRST_CIRCLE_RADIUS,
                SECOND_CIRCLE_FIRST_CENTER,
                SECOND_CIRCLE_SECOND_CENTER,
                SECOND_CIRCLE_RADIUS));
    }

    private static String getOverlapStatus(final int FIRST_CIRCLE_FIRST_CENTER, final int FIRST_CIRCLE_SECOND_CENTER, final int FIRST_CIRCLE_RADIUS, final int SECOND_CIRCLE_FIRST_CENTER, final int SECOND_CIRCLE_SECOND_CENTER, final int SECOND_CIRCLE_RADIUS) {
        final double DISTANCE = Math.sqrt((FIRST_CIRCLE_FIRST_CENTER - SECOND_CIRCLE_FIRST_CENTER) * (FIRST_CIRCLE_FIRST_CENTER - SECOND_CIRCLE_FIRST_CENTER) + (FIRST_CIRCLE_SECOND_CENTER - SECOND_CIRCLE_SECOND_CENTER) * (FIRST_CIRCLE_SECOND_CENTER - SECOND_CIRCLE_SECOND_CENTER));
        if (DISTANCE > FIRST_CIRCLE_RADIUS + SECOND_CIRCLE_RADIUS)
            return "Circumference of first circle and second circle intersect";
        else if (FIRST_CIRCLE_RADIUS > DISTANCE + SECOND_CIRCLE_RADIUS)
            return "Second circle is in first circle";
        else if (SECOND_CIRCLE_RADIUS > DISTANCE + FIRST_CIRCLE_RADIUS)
            return "First circle is in second circle";
        else
            return "First circle and second circle don't overlap";
    }
}