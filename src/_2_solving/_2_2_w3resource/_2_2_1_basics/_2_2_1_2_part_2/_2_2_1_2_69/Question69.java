package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_69;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if a point (x, y) is in a triangle or not. A triangle is formed by three points.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input (x1, y1)
 * <br/>
 * 2
 * <br/>
 * 6
 * <br/>
 * Input (x2, y2)
 * <br/>
 * 3
 * <br/>
 * 5
 * <br/>
 * Input (x3, y3)
 * <br/>
 * 4
 * <br/>
 * 6
 * <br/>
 * Input (xp, yp)
 * <br/>
 * 5
 * <br/>
 * 6
 * <br/>
 * The point is outside the triangle.
 * </h2>
 */

public class Question69 {
    private static final int LATITUDE_COORDINATES_FIRST_POINT = 2,
            LONGITUDE_COORDINATES_FIRST_POINT = 6,
            LATITUDE_COORDINATES_SECOND_POINT = 3,
            LONGITUDE_COORDINATES_SECOND_POINT = 5,
            LATITUDE_COORDINATES_THIRD_POINT = 4,
            LONGITUDE_COORDINATES_THIRD_POINT = 6,
            FIRST_POINT = 5,
            SECOND_POINT = 6;

    public static void main(final String[] ARGS) {
        System.out.println("input longitude and latitude coordinates first point:");
        System.out.printf("%d %d\n",
                LATITUDE_COORDINATES_FIRST_POINT,
                LONGITUDE_COORDINATES_FIRST_POINT);
        System.out.println("input longitude and latitude coordinates second point:");
        System.out.printf("%d %d\n",
                LATITUDE_COORDINATES_SECOND_POINT,
                LONGITUDE_COORDINATES_SECOND_POINT);
        System.out.println("input longitude and latitude coordinates third point:");
        System.out.printf("%d %d\n",
                LATITUDE_COORDINATES_THIRD_POINT,
                LONGITUDE_COORDINATES_THIRD_POINT);
        System.out.printf("The point is %b the triangle", getPointPositionStatus() ? "inside" : "outside");
    }

    private static boolean getPointPositionStatus() {
        final double AREA_TOTAL = getTriangleArea(LATITUDE_COORDINATES_FIRST_POINT, LONGITUDE_COORDINATES_FIRST_POINT,
                LATITUDE_COORDINATES_SECOND_POINT, LONGITUDE_COORDINATES_SECOND_POINT,
                LATITUDE_COORDINATES_THIRD_POINT, LONGITUDE_COORDINATES_THIRD_POINT),
                FIRST_AREA = getTriangleArea(FIRST_POINT, SECOND_POINT, LATITUDE_COORDINATES_SECOND_POINT, LONGITUDE_COORDINATES_SECOND_POINT,
                        LATITUDE_COORDINATES_THIRD_POINT, LONGITUDE_COORDINATES_THIRD_POINT),
                SECOND_AREA = getTriangleArea(LATITUDE_COORDINATES_FIRST_POINT, LONGITUDE_COORDINATES_FIRST_POINT,
                        FIRST_POINT, SECOND_POINT, LATITUDE_COORDINATES_THIRD_POINT, LONGITUDE_COORDINATES_THIRD_POINT),
                THIRD_AREA = getTriangleArea(LATITUDE_COORDINATES_FIRST_POINT, LONGITUDE_COORDINATES_FIRST_POINT,
                        LATITUDE_COORDINATES_SECOND_POINT, LONGITUDE_COORDINATES_SECOND_POINT,
                        FIRST_POINT, SECOND_POINT);
        return AREA_TOTAL == FIRST_AREA + SECOND_AREA + THIRD_AREA;
    }

    private static double getTriangleArea(final int LATITUDE_COORDINATES_FIRST_POINT, final int LONGITUDE_COORDINATES_FIRST_POINT, final int LATITUDE_COORDINATES_SECOND_POINT, final int LONGITUDE_COORDINATES_SECOND_POINT, final int LATITUDE_COORDINATES_THIRD_POINT, final int LONGITUDE_COORDINATES_THIRD_POINT) {
        return Math.abs((LATITUDE_COORDINATES_FIRST_POINT * (LONGITUDE_COORDINATES_SECOND_POINT - LONGITUDE_COORDINATES_THIRD_POINT) + LATITUDE_COORDINATES_SECOND_POINT * (LONGITUDE_COORDINATES_THIRD_POINT - LONGITUDE_COORDINATES_FIRST_POINT) + LATITUDE_COORDINATES_THIRD_POINT * (LONGITUDE_COORDINATES_FIRST_POINT - LONGITUDE_COORDINATES_SECOND_POINT)) / 2.0);
    }
}