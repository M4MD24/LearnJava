package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_12;

/**
 * <h1>Problem:</h1>
 * <h2>Write a program in Java to input 5 numbers from the keyboard and find their sum and average.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the 5 numbers:
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
 * The sum of 5 numbers is: 15
 * <br/>
 * The average is: 3.0
 * </h2>
 */

public class Question12 {
    private static int firstNumber,
            secondNumber,
            thirdNumber,
            fourthNumber,
            fifthNumber;

    public static void main(final String[] PARAMETERS) {
        System.out.println("Input the 5 numbers:");
        printNumbers();
        System.out.printf("The sum of five numbers is: %d\n", firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber);
        System.out.printf("The average is: %d", (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber) / 5);
    }

    private static void printNumbers() {
        for (int index = 0; index < 5; index++) {
            switch (index) {
                case 0 -> firstNumber = 1;
                case 1 -> secondNumber = 2;
                case 2 -> thirdNumber = 3;
                case 3 -> fourthNumber = 4;
                case 4 -> fifthNumber = 5;
            }
        }
    }
}