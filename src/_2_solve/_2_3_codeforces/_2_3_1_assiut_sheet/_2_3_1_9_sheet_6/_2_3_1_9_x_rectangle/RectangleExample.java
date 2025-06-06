package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_x_rectangle;

import java.util.Scanner;

/**
 * <h1>X. Rectangle</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given a rectangle represented by four distinct points: (x1,y1),(x2,y2),(x3,y3) and (x4,y4),With two sides parallel to the Y-axis and the other two parallel to the X-axis and N points, for each point check whether it belongs to the rectangle or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 0 0 0 2 2 0 2 2
 * <br/>
 * 3
 * <br/>
 * 1 1
 * <br/>
 * 1 5
 * <br/>
 * 0 0
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * YES
 * <br/>
 * NO
 * <br/>
 * YES
 * </h2>
 */

public class RectangleExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int FIRST_POINT_FIRST_RECTANGLE = INPUT.nextInt(),
            FIRST_POINT_SECOND_RECTANGLE = INPUT.nextInt(),
            SECOND_POINT_FIRST_RECTANGLE = INPUT.nextInt(),
            SECOND_POINT_SECOND_RECTANGLE = INPUT.nextInt(),
            THIRD_POINT_FIRST_RECTANGLE = INPUT.nextInt(),
            THIRD_POINT_SECOND_RECTANGLE = INPUT.nextInt(),
            FOURTH_POINT_FIRST_RECTANGLE = INPUT.nextInt(),
            FOURTH_POINT_SECOND_RECTANGLE = INPUT.nextInt();

    public static void main(final String[] ARGUMENTS) {
        inputPoints();
    }

    private static void inputPoints() {
        byte countOfTestCases = INPUT.nextByte();
        while (countOfTestCases-- > 0) {
            final int FIRST_POINT = INPUT.nextInt(),
                    SECOND_POINT = INPUT.nextInt();
            System.out.println(isBelongToRectangle(FIRST_POINT, SECOND_POINT)
                    ? "YES"
                    : "NO");
        }
    }

    private static boolean isBelongToRectangle(final int FIRST_POINT, final int SECOND_POINT) {
        final int MINIMUM_POINT_NUMBER_FIRST_RECTANGLE = Math.min(Math.min(FIRST_POINT_FIRST_RECTANGLE, SECOND_POINT_FIRST_RECTANGLE), Math.min(THIRD_POINT_FIRST_RECTANGLE, FOURTH_POINT_FIRST_RECTANGLE)),
                MAXIMUM_POINT_NUMBER_FIRST_RECTANGLE = Math.max(Math.max(FIRST_POINT_FIRST_RECTANGLE, SECOND_POINT_FIRST_RECTANGLE), Math.max(THIRD_POINT_FIRST_RECTANGLE, FOURTH_POINT_FIRST_RECTANGLE)),
                MINIMUM_POINT_NUMBER_SECOND_RECTANGLE = Math.min(Math.min(FIRST_POINT_SECOND_RECTANGLE, SECOND_POINT_SECOND_RECTANGLE), Math.min(THIRD_POINT_SECOND_RECTANGLE, FOURTH_POINT_SECOND_RECTANGLE)),
                MAXIMUM_POINT_NUMBER_SECOND_RECTANGLE = Math.max(Math.max(FIRST_POINT_SECOND_RECTANGLE, SECOND_POINT_SECOND_RECTANGLE), Math.max(THIRD_POINT_SECOND_RECTANGLE, FOURTH_POINT_SECOND_RECTANGLE));
        return (FIRST_POINT >= MINIMUM_POINT_NUMBER_FIRST_RECTANGLE && FIRST_POINT <= MAXIMUM_POINT_NUMBER_FIRST_RECTANGLE &&
                SECOND_POINT >= MINIMUM_POINT_NUMBER_SECOND_RECTANGLE && SECOND_POINT <= MAXIMUM_POINT_NUMBER_SECOND_RECTANGLE);
    }
}