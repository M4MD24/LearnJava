package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_2_data_types._2_2_1_2_1_data_types._2_2_1_2_1_11;

/**
 * <h1>Problem:</h1>
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

public class Question11 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("Finite doubles");
        System.out.println("-".repeat(14));
        System.out.printf("Is %f is finite? %b\n", 2.13456321E-4D, isFiniteStatus(2.13456321E-4D));
        System.out.printf("Is %f is finite? %b\n", Double.POSITIVE_INFINITY, isFiniteStatus(Double.POSITIVE_INFINITY));
        System.out.printf("Is %f is finite? %b\n\n", Double.NaN, isFiniteStatus(Double.NaN));
        System.out.println("Finite floats");
        System.out.println("-".repeat(13));
        System.out.printf("Is %f is finite? %b\n", 5.3F, isFiniteStatus(5.3F));
        System.out.printf("Is %f is finite? %b\n", Float.POSITIVE_INFINITY, isFiniteStatus(Float.POSITIVE_INFINITY));
        System.out.printf("Is %f is finite? %b", Float.NaN, isFiniteStatus(Float.NaN));
    }

    private static boolean isFiniteStatus(final double NUMBER) {
        return Double.isFinite(NUMBER);
    }

    private static boolean isFiniteStatus(final float NUMBER) {
        return Float.isFinite(NUMBER);
    }
}