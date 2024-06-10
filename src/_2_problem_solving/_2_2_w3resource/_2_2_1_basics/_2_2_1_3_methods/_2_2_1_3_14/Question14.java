package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_14;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to create a pentagon's area.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the number of sides: 5
 * <br/>
 * Input the side: 6
 * <br/>
 * The area of the pentagon is 61.93718642120281
 * </h2>
 */
public class Question14 {
    public static void main(final String[] ARGS) {
        final int COUNT_OF_SIDES = 5,
                SIDE = 6;
        System.out.printf("Input the number of sides: %d\n", COUNT_OF_SIDES);
        System.out.printf("Input the side: %d\n", SIDE);
        System.out.printf("The Area of the pentagon is : %f", getPentagonArea(SIDE));
    }

    private static double getPentagonArea(final double SIDE) {
        return (5 * SIDE * SIDE) / (4 * Math.tan(Math.PI / 5));
    }
}