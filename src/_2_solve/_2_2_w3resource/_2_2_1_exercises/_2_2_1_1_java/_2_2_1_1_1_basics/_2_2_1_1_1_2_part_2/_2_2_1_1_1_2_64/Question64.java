package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_64;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program which solve the equation:
 * <br/>
 * ax+by=c
 * <br/>
 * dx+ey=f
 * <br/>
 * Print the values of x, y where a, b, c, d, e and f are given.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the value of a, b, c, d, e, f:
 * <br/>
 * 5 6 8 9 7 4
 * <br/>
 * -1.684 2.737
 * </h2>
 */

public class Question64 {
    public static void main(final String[] ARGUMENTS) {
        final int FIRST_NUMBER = 5,
                SECOND_NUMBER = 6,
                THIRD_NUMBER = 8,
                FOURTH_NUMBER = 9,
                FIFTH_NUMBER = 7,
                SIXTH_NUMBER = 4;
        System.out.println("Input the value of first, second, third, fourth, fifth, sixth numbers:");
        System.out.printf("%d %d %d %d %d %d\n",
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER,
                FOURTH_NUMBER,
                FIFTH_NUMBER,
                SIXTH_NUMBER);
        printSeventhAndEighthNumber(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER, FIFTH_NUMBER, SIXTH_NUMBER);
    }

    private static void printSeventhAndEighthNumber(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER, final int FOURTH_NUMBER, final int FIFTH_NUMBER, final int SIXTH_NUMBER) {
        System.out.printf("%.3f %.3f",
                (double) (THIRD_NUMBER * FIFTH_NUMBER - SECOND_NUMBER * SIXTH_NUMBER) / (FIRST_NUMBER * FIFTH_NUMBER - SECOND_NUMBER * FOURTH_NUMBER),
                (double) (FIRST_NUMBER * SIXTH_NUMBER - THIRD_NUMBER * FOURTH_NUMBER) / (FIRST_NUMBER * FIFTH_NUMBER - SECOND_NUMBER * FOURTH_NUMBER));
    }
}