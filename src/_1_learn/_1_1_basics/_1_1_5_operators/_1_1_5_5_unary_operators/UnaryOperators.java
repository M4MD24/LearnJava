package _1_learn._1_1_basics._1_1_5_operators._1_1_5_5_unary_operators;

public class UnaryOperators {
    public static void main(final String[] ARGUMENTS) {
        /* Unary Operators Types! */
        /* ( + ) Unary plus
         * ( - ) Unary minus
         * ( ++ ) Increment
         * ( -- ) Decrement
         * ( ~ ) Bitwise NOT
         * ( ! ) Logical NOT
         * */

        int intVariable = 1;
        System.out.println(+intVariable); // Unary plus
        System.out.println(-intVariable); // Unary minus
        System.out.println(++intVariable); // Increment
        System.out.println(--intVariable); // Decrement
        System.out.println(~intVariable); // Bitwise NOT

        boolean booleanVariable = false;
        System.out.println(!booleanVariable); // Logical NOT
    }
}