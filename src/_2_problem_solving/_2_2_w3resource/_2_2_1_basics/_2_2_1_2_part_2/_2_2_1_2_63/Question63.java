package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_63;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check whether three given lengths (integers) of three sides form a right triangle. Print "Yes" if the given sides form a right triangle otherwise print "No".</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input sides of triangle:
 * <br/>
 * 6 9 12
 * <br/>
 * All sides are right triangle? No
 * </h2>
 */

public class Question63 {
    public static void main(final String[] ARGS) {
        System.out.println("Input sides of triangle:");
        final int FIRST_SIDE = 5,
                SECOND_SIDE = 12,
                THIRD_SIDE = 13;
        System.out.printf("%d %d %d\n",
                FIRST_SIDE,
                SECOND_SIDE,
                THIRD_SIDE);
        System.out.printf("All sides are right triangle? %b",
                allSidesAreRightTriangle(FIRST_SIDE, SECOND_SIDE, THIRD_SIDE)
                        ? "Yes"
                        : "No");
    }

    private static boolean allSidesAreRightTriangle(final int FIRST_SIDE, final int SECOND_SIDE, final int THIRD_SIDE) {
        return Math.pow(FIRST_SIDE, 2) + Math.pow(SECOND_SIDE, 2) == Math.pow(THIRD_SIDE, 2) ||
                Math.pow(SECOND_SIDE, 2) + Math.pow(THIRD_SIDE, 2) == Math.pow(FIRST_SIDE, 2) ||
                Math.pow(THIRD_SIDE, 2) + Math.pow(FIRST_SIDE, 2) == Math.pow(SECOND_SIDE, 2);
    }
}