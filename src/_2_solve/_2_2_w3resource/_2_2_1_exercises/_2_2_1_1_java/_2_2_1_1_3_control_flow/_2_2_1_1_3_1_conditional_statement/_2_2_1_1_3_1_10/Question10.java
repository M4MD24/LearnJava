package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_1_conditional_statement._2_2_1_1_3_1_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display the first 10 natural numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * The first 10 natural numbers are:
 * <br/>
 * 1
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 4
 * <br/>
 * 5
 * <br/>
 * 6
 * <br/>
 * 7
 * <br/>
 * 8
 * <br/>
 * 9
 * <br/>
 * 10
 * </h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("The first ten natural numbers are:");
        printTenNaturalNumbers();
    }

    private static void printTenNaturalNumbers() {
        for (byte number = 1; number <= 10; number++) {
            System.out.print(number);
            if (number != 10)
                System.out.println();
        }
    }
}