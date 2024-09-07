package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the value of a specified expression.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * a) (101 + 0) / 3 = 33
 * <br/>
 * b) 0.000003 * 10000000.1 = 30.0000003
 * <br/>
 * c) true && true = true
 * <br/>
 * d) false && true = false
 * <br/>
 * e) (false && false) || (true && true) = true
 * <br/>
 * e) (false || false) && (true && true) = false
 * </h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        methodA();
        methodB();
        methodC();
        methodD();
        methodE();
        methodF();
    }

    private static void methodA() {
        int number1 = 101,
                number2 = 0,
                number3 = 3,
                result = (number1 + number2) / number3;
        displayMethodA(number1, number2, number3, result);
    }

    private static void displayMethodA(int number1, int number2, int number3, int result) {
        System.out.printf("a) (%d + %d) / %d = %d\n",
                number1,
                number2,
                number3,
                result);
    }

    private static void methodB() {
        double number1 = 3.0e-6,
                number2 = 10000000.1,
                result = number1 * number2;
        displayMethodB(number1, number2, result);
    }

    private static void displayMethodB(double number1, double number2, double result) {
        System.out.printf("b) %f * %.1f = %.7f\n",
                number1,
                number2,
                result);
    }

    private static void methodC() {
        boolean status1 = true,
                status2 = true,
                condition = status1 && status2;
        displayMethodC(status1, status2, condition);
    }

    private static void displayMethodC(boolean status1, boolean status2, boolean condition) {
        System.out.printf("c) %b && %b = %b\n",
                status1,
                status2,
                condition);
    }

    private static void methodD() {
        boolean status1 = false,
                status2 = true,
                condition = status1 && status2;
        displayMethodD(status1, status2, condition);
    }

    private static void displayMethodD(boolean status1, boolean status2, boolean condition) {
        System.out.printf("d) %b && %b = %b\n",
                status1,
                status2,
                condition);
    }

    private static void methodE() {
        boolean status1 = false,
                status2 = true,
                condition1 = status1 && status1,
                condition2 = status2 && status2,
                finallyCondition = condition1 || condition2;
        displayMethodE(status1, status2, finallyCondition);
    }

    private static void displayMethodE(boolean status1, boolean status2, boolean finallyCondition) {
        System.out.printf("e) (%b && %b) || (%b && %b) = %b\n",
                status1,
                status1,
                status2,
                status2,
                finallyCondition);
    }

    private static void methodF() {
        boolean status1 = false,
                status2 = true,
                condition1 = status1 || status1,
                condition2 = status2 && status2,
                finallyCondition = condition1 && condition2;
        displayMethodF(status1, status2, finallyCondition);
    }

    private static void displayMethodF(boolean status1, boolean status2, boolean finallyCondition) {
        System.out.printf("f) (%b || %b) && (%b && %b) = %b",
                status1,
                status1,
                status2,
                status2,
                finallyCondition);
    }
}