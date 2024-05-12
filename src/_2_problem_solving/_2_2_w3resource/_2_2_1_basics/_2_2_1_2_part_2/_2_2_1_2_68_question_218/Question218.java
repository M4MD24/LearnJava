package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_68_question_218;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compute the radius and central coordinates (x, y) of a circle constructed from three given points on the plane surface.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input x1, x2, y1, y2, z1, z2 separated by a single space:
 * <br/>
 * 5 6 4 8 7 9
 * <br/>
 * <br/>
 * Radius and the central coordinate:
 * <br/>
 * 1.821 (5.786 7.643)
 * </h2>
 */

public class Question218 {
    public static void main(final String[] ARGS) {
        final int FIRST_FIRST_COORDINATE = 5,
                FIRST_SECOND_COORDINATE = 6,
                SECOND_FIRST_COORDINATE = 4,
                SECOND_SECOND_COORDINATE = 8,
                THIRD_FIRST_COORDINATE = 7,
                THIRD_SECOND_COORDINATE = 9;
        final double FIRST_SIDE = SECOND_FIRST_COORDINATE - FIRST_FIRST_COORDINATE,
                SECOND_SIDE = SECOND_SECOND_COORDINATE - FIRST_SECOND_COORDINATE,
                FIRST_CONSTANT = (double) (SECOND_SECOND_COORDINATE * SECOND_SECOND_COORDINATE - FIRST_SECOND_COORDINATE * FIRST_SECOND_COORDINATE + SECOND_FIRST_COORDINATE * SECOND_FIRST_COORDINATE - FIRST_FIRST_COORDINATE * FIRST_FIRST_COORDINATE) / 2,
                THIRD_SIDE = THIRD_FIRST_COORDINATE - FIRST_FIRST_COORDINATE,
                FIRTH_SIDE = THIRD_SECOND_COORDINATE - FIRST_SECOND_COORDINATE,
                SECOND_CONSTANT = (double) (THIRD_SECOND_COORDINATE * THIRD_SECOND_COORDINATE - FIRST_SECOND_COORDINATE * FIRST_SECOND_COORDINATE + THIRD_FIRST_COORDINATE * THIRD_FIRST_COORDINATE - FIRST_FIRST_COORDINATE * FIRST_FIRST_COORDINATE) / 2,
                FIRST_CENTER = (FIRTH_SIDE * FIRST_CONSTANT - SECOND_SIDE * SECOND_CONSTANT) / (FIRST_SIDE * FIRTH_SIDE - SECOND_SIDE * THIRD_SIDE),
                SECOND_CENTER = (FIRST_SIDE * SECOND_CONSTANT - THIRD_SIDE * FIRST_CONSTANT) / (FIRST_SIDE * FIRTH_SIDE - SECOND_SIDE * THIRD_SIDE),
                RADIUS = Math.sqrt(Math.pow(FIRST_CENTER - FIRST_FIRST_COORDINATE, 2.0) + Math.pow(SECOND_CENTER - FIRST_SECOND_COORDINATE, 2.0));
        System.out.println("Input x1, x2, y1, y2, z1, z2 separated by a single space:");
        System.out.printf("%d %d %d %d %d %d\n",
                FIRST_FIRST_COORDINATE,
                FIRST_SECOND_COORDINATE,
                SECOND_FIRST_COORDINATE,
                SECOND_SECOND_COORDINATE,
                THIRD_FIRST_COORDINATE,
                THIRD_SECOND_COORDINATE);
        System.out.println("\nRadius and the central coordinate:");
        System.out.printf("%.3f (%.3f %.3f)", RADIUS, FIRST_CENTER, SECOND_CENTER);
    }
}