package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to divide two numbers and print them on the screen.</h2>
 * <br/>
 * <h1>Test Data:</h1>
 * <h2>50/3</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>16</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        float number1 = 50F;
        int number2 = 3, divideOfTwoNumbers = (int) (number1 / number2);
        System.out.print(divideOfTwoNumbers);
    }
}