package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_14;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display the multiplication table of a given integer.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the number (Table to be calculated): 5</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 5 ✕ 0 = 0
 * <br/>
 * 5 ✕ 1 = 5
 * <br/>
 * 5 ✕ 2 = 10
 * <br/>
 * 5 ✕ 3 = 15
 * <br/>
 * 5 ✕ 4 = 20
 * <br/>
 * 5 ✕ 5 = 25
 * </h2>
 */

public class Question14 {
    public static void main(final String[] PARAMETERS) {
        final int MULTIPLIED_NUMBER = 5;
        System.out.printf("Input the number (Table to be calculated): %d\n", MULTIPLIED_NUMBER);
        printMultiplicationTable(MULTIPLIED_NUMBER);
    }

    private static void printMultiplicationTable(final int MULTIPLIED_NUMBER) {
        for (int number = 0; number <= MULTIPLIED_NUMBER; number++) {
            System.out.printf("%d ✕ %d = %d",
                    MULTIPLIED_NUMBER,
                    number,
                    MULTIPLIED_NUMBER * number);
            if (number != MULTIPLIED_NUMBER)
                System.out.println();
        }
    }
}