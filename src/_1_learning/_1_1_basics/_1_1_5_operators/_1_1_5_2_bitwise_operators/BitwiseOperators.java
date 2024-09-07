package _1_learning._1_1_basics._1_1_5_operators._1_1_5_2_bitwise_operators;

public class BitwiseOperators {
    public static void main(final String[] PARAMETERS) {
        /* √ XOR = Exclusive OR */

        /* Bitwise Operators Types! */
        /* ( ~ ) Bitwise Complement
         * ( << ) Left Shift
         * ( >> ) Right Shift
         * ( >>> ) Unsigned Right Shift
         * ( & ) Bitwise AND
         * ( | ) Bitwise OR
         * ( ^ ) Bitwise XOR
         * */

        int number1 = 5;
        int number2 = 10;

        System.out.println("Bitwise Complement " + ~number1); // Bitwise Complement

        System.out.println("Left Shift = " + (number1 << number2)); // Left Shift

        System.out.println("Right Shift = " + (number1 >> number2)); // Right Shift

        System.out.println("Unsigned Right Shift = " + (number1 >>> number2)); // Unsigned Right Shift

        System.out.println("Bitwise AND = " + (number1 & number2)); // Bitwise AND
        /* ■ AND Table
            ---------------
            | - | - | AND |
            ---------------
            | T | T |  T  |
            | T | F |  F  |
            | F | T |  F  |
            | F | F |  F  |
            ---------------
        */

        System.out.println("Bitwise OR = " + (number1 | number2)); // Bitwise OR
        /* ■ OR Table
            ---------------
            | - | - |  OR |
            ---------------
            | T | T |  T  |
            | T | F |  T  |
            | F | T |  T  |
            | F | F |  F  |
            ---------------
        */

        System.out.println("Bitwise XOR = " + (number1 ^ number2)); // Bitwise XOR
        /* ■ XOR Table
            ---------------
            | - | - | XOR |
            ---------------
            | T | T |  F  |
            | T | F |  T  |
            | F | T |  T  |
            | F | F |  F  |
            ---------------
        */
    }
}