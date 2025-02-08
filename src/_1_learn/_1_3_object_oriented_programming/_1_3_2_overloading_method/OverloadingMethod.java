package _1_learn._1_3_object_oriented_programming._1_3_2_overloading_method;

public class OverloadingMethod {

    static void printNumbers(final int NUMBER_1, final int NUMBER_2) {
        System.out.println("Print 2 Numbers: " + NUMBER_1 + ", " + NUMBER_2);
    }

    static void printNumbers(final int NUMBER_1, final int NUMBER_2, final int NUMBER_3) { // Overloading Method
        System.out.println("Print 3 Numbers: " + NUMBER_1 + ", " + NUMBER_2 + ", " + NUMBER_3);
    }

    public static void main(final String[] ARGUMENTS) {
        printNumbers(10, 20);
        printNumbers(10, 20, 30);
    }
}