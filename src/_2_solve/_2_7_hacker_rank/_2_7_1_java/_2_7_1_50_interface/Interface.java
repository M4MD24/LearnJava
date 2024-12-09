package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_50_interface;

import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_50_interface.files <h2>Question</h2>
 */

interface AdvancedArithmetic {
    int divisor_sum(final int NUMBER);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(final int NUMBER) {
        int sum = 0;
        for (int index = 1; index <= NUMBER; index++)
            if (NUMBER % index == 0)
                sum += index;
        return sum;
    }
}

public class Interface {
    public static void main(final String[] PARAMETERS) {
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.print(new MyCalculator().divisor_sum(new Scanner(System.in).nextInt()));
    }
}