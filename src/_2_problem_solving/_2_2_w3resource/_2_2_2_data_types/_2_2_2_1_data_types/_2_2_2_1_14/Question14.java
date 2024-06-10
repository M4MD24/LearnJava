package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_14;

import java.math.BigInteger;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to extract the primitive type value from a given BigInteger value.
 * <br/>
 * A primitive type is predefined by the language and is named by a reserved keyword. Primitive values do not share state with other primitive values. The eight primitive data types supported by the Java programming language are byte, short, int, long, float, double, Boolean and char.
 * <br/>
 * BigInteger() translates the sign-magnitude representation of a BigInteger into a BigInteger. The sign is represented as an integer the sign value: -1 for negative, 0 for zero, or 1 for positive. The magnitude is a byte array in big-endian byte-order: the most significant byte is in the zeroth element. A zero-length magnitude array is permissible, and will result in a BigInteger value of 0, whether the sign is -1, 0 or 1.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * BigInteger value: 9223372036854775807
 * <br/>
 * Convert the said BigInteger to an long value: 9223372036854775807
 * <br/>
 * Convert the said BigInteger to an int value: -1
 * <br/>
 * Convert the said BigInteger to an short value: -1
 * <br/>
 * Convert the said BigInteger to byte value: -1
 * <br/>
 * Convert the said BigInteger to exact long value: 9223372036854775807
 * </h2>
 */

public class Question14 {
    public static void main(final String[] ARGS) {
        final BigInteger NUMBER = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.printf("BigInteger value: %d\n", NUMBER);
        System.out.printf("Convert the said BigInteger to an long value: %d\n", NUMBER.longValue());
        System.out.printf("Convert the said BigInteger to an int value: %d\n", NUMBER.intValue());
        System.out.printf("Convert the said BigInteger to an short value: %d\n", NUMBER.shortValue());
        System.out.printf("Convert the said BigInteger to an byte value: %d\n", NUMBER.byteValue());
        System.out.printf("Convert the said BigInteger to an exact long value: %d", NUMBER.longValueExact());
    }
}