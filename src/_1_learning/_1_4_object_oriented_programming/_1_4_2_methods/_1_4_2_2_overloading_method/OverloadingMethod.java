package _1_learning._1_4_object_oriented_programming._1_4_2_methods._1_4_2_2_overloading_method;

public class OverloadingMethod {

    static void printNumbers(final int num1, final int num2) {
        System.out.println("Print 2 Numbers: " + num1 + ", " + num2);
    }

    static void printNumbers(final int num1, final int num2, final int number3) { // Overloading Method
        System.out.println("Print 3 Numbers: " + num1 + ", " + num2 + ", " + number3);
    }

    public static void main(final String[] ARGS) {
        printNumbers(10, 20);
        printNumbers(10, 20, 30);
    }
}