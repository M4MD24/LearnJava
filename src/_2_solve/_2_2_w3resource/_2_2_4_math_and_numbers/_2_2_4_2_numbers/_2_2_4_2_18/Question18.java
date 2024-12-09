package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_18;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check if a number is a cube or not.
 * <br/>
 * In arithmetic and algebra, the cube of a number n is its third power: the result of the number multiplied by itself twice:
 * <br/>
 * n3 = n × n × n.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 8
 * <br/>
 * Number is a cube.
 * </h2>
 */
public class Question18 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 8;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("Number is%s a cube.",
                isCubeNumber(NUMBER)
                        ? ""
                        : "n't");
    }

    private static boolean isCubeNumber(final int NUMBER) {
        return Math.cbrt(NUMBER) % 1 == 0;
    }
}