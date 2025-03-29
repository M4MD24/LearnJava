package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_2_data_types._2_2_1_1_2_1_data_types._2_2_1_1_2_1_15;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the next floating-point adjacent to positive and negative infinity from a given floating/double number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Initial floating number: 0.2
 * <br/>
 * Float 0.2 next down is 0.19999999
 * <br/>
 * Float 0.2 next up is 0.20000002
 * <br/>
 * <br/>
 * Initial double number: 0.2
 * <br/>
 * Double 0.2 next down is 0.19999999999999998
 * <br/>
 * Double 0.2 next up is 0.20000000000000004
 * </h2>
 */

public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        final float FLOAT_NUMBER = 0.2F;
        System.out.printf("Initial floating number: %f\n", FLOAT_NUMBER);
        System.out.printf("Float %f next down is %f\n", FLOAT_NUMBER, Math.nextDown(FLOAT_NUMBER));
        System.out.printf("Float %f next up is %f\n\n", FLOAT_NUMBER, Math.nextUp(FLOAT_NUMBER));
        final double DOUBLE_NUMBER = 0.2D;
        System.out.printf("Initial double number: %f\n", DOUBLE_NUMBER);
        System.out.printf("Double %f next down is %f\n", DOUBLE_NUMBER, Math.nextDown(DOUBLE_NUMBER));
        System.out.printf("Double %f next up is %f", DOUBLE_NUMBER, Math.nextUp(DOUBLE_NUMBER));
    }
}