package _1_learn._1_1_basics._1_1_6_input_and_output;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
//        Output
        System.out.print("Salam\n"); // It prints string inside the quotes

        System.out.println("Salam"); // It prints string inside the quotes similar like method. Then the cursor moves to the beginning of the next line

        System.out.printf("Salam\n"); // similar to printf in C/C++

//        Input
        Scanner input = new Scanner(System.in);

        byte byteReader = input.nextByte(); // Reading byte
        short shortReader = input.nextShort(); // Reading short
        int intReader = input.nextInt(); // Reading int
        long longReader = input.nextLong(); // Reading long
        float floatReader = input.nextFloat(); // Reading float
        double doubleReader = input.nextDouble(); // Reading double
        char charReader = input.next().charAt(0); // Reading char (as a String and then extracting the first character)
        String stringReader = input.next(); // Reading String

        /* You can continue reading other data types in a similar manner! */

        input.close(); // Close the scanner to release resources
    }
}
