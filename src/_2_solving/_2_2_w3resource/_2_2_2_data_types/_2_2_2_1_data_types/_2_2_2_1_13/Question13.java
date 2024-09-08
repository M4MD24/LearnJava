package _2_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_13;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compute the floor division and floor modulus of the given dividend and divisor.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Floor division using '/' operator: -18
 * <br/>
 * Floor division using "floorDiv()" method is: -19
 * <br/>
 * <br/>
 * Floor modulus using '%' operator: -115
 * <br/>
 * Floor modulus using "floorMod()" method is: 10
 * </h2>
 */

public class Question13 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = -2365,
                SECOND_NUMBER = 125;
        System.out.printf("Floor division using '/' operator: %d\n", FIRST_NUMBER / SECOND_NUMBER);
        System.out.printf("Floor division using \"floorDiv()\" operator: %d\n\n", Math.floorDiv(FIRST_NUMBER, SECOND_NUMBER));
        System.out.printf("Floor modulus using '%%' operator: %d\n", FIRST_NUMBER % SECOND_NUMBER);
        System.out.printf("Floor modulus using \"floorMod()\" operator: %d", Math.floorMod(FIRST_NUMBER, SECOND_NUMBER));
    }
}