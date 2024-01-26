package _1_learning._1_1_basics._1_1_8_flow_control._1_8_3_loops._1_8_3_1_do_and_while;

public class DoAndWhile {
    public static void main(String[] args) {
        int index = 0;
        int stopIn = 10;

//        While with shorthand
        while (index < stopIn) System.out.println("While With Shorthand = " + ++index);

//        While  without shorthand
        while ((index <= stopIn) && (index != 1)) {
            System.out.println("While Without Shorthand = " + --index);
        }

//        Do-While with shorthand
        do System.out.println("Do-While With Shorthand = " + ++index);
        while (index < stopIn);

//       Do-While without shorthand
        do {
            System.out.println("Do-While Without Shorthand = " + --index);
        } while ((index <= stopIn) && (index != 1));
    }
}