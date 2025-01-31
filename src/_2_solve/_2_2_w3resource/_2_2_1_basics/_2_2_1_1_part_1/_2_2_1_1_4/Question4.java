package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the results of the following operations.</h2>
 * <br/>
 * <h1>Test Data:</h1>
 * <h2>
 * a. -5 + 8 * 6
 * <br/>
 * b. (55+9) % 9
 * <br/>
 * c. 20 + -3*5 / 8
 * <br/>
 * d. 5 + 15 / 3 * 2 - 8 % 3
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * 43
 * <br/>
 * 1
 * <br/>
 * 19
 * <br/>
 * 13
 * </h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        int a = -5 + 8 * 6,
                b = (55 + 9) % 9,
                c = 20 + -3 * 5 / 8,
                d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.print(a + "\n" +
                b + "\n" +
                c + "\n" +
                d);
    }
}