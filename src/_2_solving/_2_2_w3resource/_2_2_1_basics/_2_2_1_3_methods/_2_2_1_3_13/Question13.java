package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_13;

/**
 * <h1>Problem:</h1>
 * <h2>Write Java methods to calculate triangle area.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input first side: 10
 * <br/>
 * Input second side: 15
 * <br/>
 * Input third side: 20
 * <br/>
 * The area of the triangle is 72.6184377413890
 * </h2>
 */
public class Question13 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_SIDE = 10,
                SECOND_SIDE = 15,
                THIRD_SIDE = 20;
        printSides(FIRST_SIDE, SECOND_SIDE, THIRD_SIDE);
        if (isTriangle(FIRST_SIDE, SECOND_SIDE, THIRD_SIDE))
            System.out.printf("The area of the triangle is %f", getTriangleArea(FIRST_SIDE, SECOND_SIDE, THIRD_SIDE));
        else
            System.out.print("Not Triangle!");
    }

    private static boolean isTriangle(final int FIRST_SIDE, final int SECOND_SIDE, final int THIRD_SIDE) {
        return (FIRST_SIDE + SECOND_SIDE > THIRD_SIDE) &&
                (SECOND_SIDE + THIRD_SIDE > FIRST_SIDE) &&
                (FIRST_SIDE + THIRD_SIDE > SECOND_SIDE);
    }

    private static double getTriangleArea(final int FIRST_SIDE, final int SECOND_SIDE, final int THIRD_SIDE) {
        final double SEMI_PERIMETER = (double) (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
        return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
    }

    private static void printSides(final int FIRST_SIDE, final int SECOND_SIDE, final int THIRD_SIDE) {
        System.out.printf("%d %d %d\n",
                FIRST_SIDE,
                SECOND_SIDE,
                THIRD_SIDE);
    }
}