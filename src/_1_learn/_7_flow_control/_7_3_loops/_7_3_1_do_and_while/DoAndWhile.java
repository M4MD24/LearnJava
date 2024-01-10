package _1_learn._7_flow_control._7_3_loops._7_3_1_do_and_while;

public class DoAndWhile {
    public static void main(String[] args) {
        int index = 0;
        int stopIn = 20;

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