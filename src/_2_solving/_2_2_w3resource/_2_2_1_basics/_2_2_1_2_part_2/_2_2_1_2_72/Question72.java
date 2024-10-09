package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_72;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test whether two lines PQ and RS are parallel. The four points are P(x1, y1), Q(x2, y2), R(x3, y3), and S(x4, y4).</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input P(x1,y1),separated by a space.
 * <br/>
 * 5 6
 * <br/>
 * Input Q(x2,y2),separated by a space.
 * <br/>
 * 4 2
 * <br/>
 * Input R(x3,y3),separated by a space.
 * <br/>
 * 5 3
 * <br/>
 * Input S(x4,y4),separated by a space.
 * <br/>
 * 5 6
 * <br/>
 * Two lines are not parallel.
 * </h2>
 */

public class Question72 {
    public static void main(final String[] PARAMETERS) {
        System.out.printf("Two lines are%s parallel.",
                areTwoLinesParallelWithFourPoints(
                        5,
                        6,
                        4,
                        2,
                        5,
                        3,
                        5,
                        6) ? "" : " not");
    }

    private static boolean areTwoLinesParallelWithFourPoints(final double FIRST_POINT_FIRST_LINE,
                                                             final double SECOND_POINT_FIRST_LINE,
                                                             final double FIRST_POINT_SECOND_LINE,
                                                             final double SECOND_POINT_SECOND_LINE,
                                                             final double FIRST_POINT_THIRD_LINE,
                                                             final double SECOND_POINT_THIRD_LINE,
                                                             final double FIRST_POINT_FOURTH_LINE,
                                                             final double SECOND_POINT_FOURTH_LINE) {
        final double FIRST_SLOPE = (SECOND_POINT_SECOND_LINE - SECOND_POINT_FIRST_LINE) / (FIRST_POINT_SECOND_LINE - FIRST_POINT_FIRST_LINE),
                SECOND_SLOPE = (SECOND_POINT_FOURTH_LINE - SECOND_POINT_THIRD_LINE) / (FIRST_POINT_FOURTH_LINE - FIRST_POINT_THIRD_LINE);
        return FIRST_SLOPE == SECOND_SLOPE;
    }
}