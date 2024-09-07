package _1_learning._1_1_basics._1_1_8_flow_control._1_8_1_if_statement._1_8_1_1_if_and_else;

public class IfAndElse {
    public static void main(final String[] PARAMETERS) {
        int number1 = 10;
        int number2 = 3;
        int number3 = 10;
        int number4 = 20;

//        With Shorthand = without curly brackets '{ }'
        if (number1 > number2) System.out.println("if with shorthand: Done");
        else if (number1 > number2) System.out.println("else if with shorthand: Done");
        else System.out.println("else with shorthand: Done");

//        Without Shorthand = with curly brackets '{ }'
        if (number1 > number2) {
            System.out.println("if without shorthand: Done");
        } else if (number1 > number2) {
            System.out.println("else if without shorthand: Done");
        } else {
            System.out.println("else without shorthand: Done");
        }

        if ((number1 > number2) && (number3 < number4)) {
            System.out.println("if: Done with AND");
        } else if ((number1 > number2) && (number3 < number4)) {
            System.out.println("else if: Done with AND");
        } else {
            System.out.println("else: Done with AND");
        }

        if ((number1 > number2) || (number3 == number4)) {
            System.out.println("if: Done with OR");
        } else if ((number1 > number2) || (number3 == number4)) {
            System.out.println("else if: Done with OR");
        } else {
            System.out.println("else: Done with OR");
        }

        if ((number1 > number2) ^ (number3 == number4)) {
            System.out.println("if: Done with XOR");
        } else if ((number1 > number2) ^ (number3 == number4)) {
            System.out.println("else if: Done with XOR");
        } else {
            System.out.println("else: Done with XOR");
        }

        if ((number1 > number2) & (number3 < number4)) {
            System.out.println("if: Done with AND");
        } else if ((number1 > number2) & (number3 < number4)) {
            System.out.println("else if: Done with AND");
        } else {
            System.out.println("else: Done with AND");
        }

        if ((number1 > number2) | (number3 == number4)) {
            System.out.println("if: Done with OR");
        } else if ((number1 > number2) | (number3 == number4)) {
            System.out.println("else if: Done with OR");
        } else {
            System.out.println("else: Done with OR");
        }
    }
}