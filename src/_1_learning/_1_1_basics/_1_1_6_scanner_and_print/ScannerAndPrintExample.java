package _1_learning._1_1_basics._1_1_6_scanner_and_print;

import java.util.Scanner;

public class ScannerAndPrintExample {
    public static void main(final String[] ARGS) {
//        Output
        System.out.print("Salam\n"); // It prints string inside the quotes

        System.out.println("Salam"); // It prints string inside the quotes similar like method. Then the cursor moves to the beginning of the next line

        System.out.printf("Salam\n"); // similar to printf in C/C++

//        Input
        Scanner input = new Scanner(System.in);

        System.out.println("byte = " + input.nextByte()); // Reading byte
        System.out.println("short = " + input.nextShort()); // Reading short
        System.out.println("int = " + input.nextInt()); // Reading int
        System.out.println("long = " + input.nextLong()); // Reading long
        System.out.println("float = " + input.nextFloat()); // Reading float
        System.out.println("double = " + input.nextDouble()); // Reading double
        System.out.println("char = " + input.next().charAt(0)); // Reading char (as a String and then extracting the first character)
        System.out.println("string = " + input.next()); // Reading String
        System.out.println("stringReaderLine = " + input.nextLine()); // Reading New Line String
        System.out.println("BigInteger = " + input.nextBigInteger()); // Reading Big Integer
        System.out.println("BigDecimal = " + input.nextBigDecimal()); // Reading Big Decimal

        /* You can continue reading other data types in a similar manner! */

        input.close(); // Close the scanner to release resources
    }
}
