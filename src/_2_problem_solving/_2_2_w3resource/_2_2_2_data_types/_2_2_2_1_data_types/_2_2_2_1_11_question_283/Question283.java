package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_11_question_283;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test whether a given double/float value is a finite floating-point value or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Finite doubles
 * <br/>
 * --------------
 * <br/>
 * Is 2.13456321E-4 is finite? true
 * <br/>
 * Is Infinity is finite? false
 * <br/>
 * Is NaN is finite? false
 * <br/>
 * <br/>
 * Finite floats
 * <br/>
 * -------------
 * <br/>
 * Is 5.3 is finite? true
 * <br/>
 * Is Infinity is finite? false
 * <br/>
 * Is NaN is finite? false
 * </h2>
 */

public class Question283 {
    public static void main(final String[] ARGS) {
        System.out.println("Finite doubles");
        System.out.println("-".repeat(14));
        System.out.println(STR."Is \{2.13456321E-4D} is finite? \{isFiniteStatus(2.13456321E-4D)}");
        System.out.println(STR."Is \{Double.POSITIVE_INFINITY} is finite? \{isFiniteStatus(Double.POSITIVE_INFINITY)}");
        System.out.println(STR."Is \{Double.NaN} is finite? \{isFiniteStatus(Double.NaN)}\n");
        System.out.println("Finite floats");
        System.out.println("-".repeat(13));
        System.out.println(STR."Is \{5.3F} is finite? \{isFiniteStatus(5.3F)}");
        System.out.println(STR."Is \{Float.POSITIVE_INFINITY} is finite? \{isFiniteStatus(Float.POSITIVE_INFINITY)}");
        System.out.print(STR."Is \{Float.NaN} is finite? \{isFiniteStatus(Float.NaN)}");
    }

    private static boolean isFiniteStatus(final double NUMBER) {
        return Double.isFinite(NUMBER);
    }

    private static boolean isFiniteStatus(final float NUMBER) {
        return Float.isFinite(NUMBER);
    }
}