package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_190_reverse_bits;

/**
 * <h1>Problem:</h1>
 * <h2>Reverse bits of a given 32 bits unsigned integer.</h2>
 * <br/>
 * <br/>
 * <h2>Note:</h2>
 * <ul>
 *     <li>Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.</li>
 *     <li>In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.</li>
 * </ul>
 */

public class ReverseBits {
    public static void main(final String[] PARAMETERS) {
        final int BITS = 0b00000010100101000001111010011100;
        System.out.print(reverseBits(BITS));
    }

    private static int reverseBits(int number) {
        int reversedBits = 0;
        for (int countOfSteps = 0; countOfSteps < 32; countOfSteps++) {
            reversedBits <<= 1;
            reversedBits |= number & 1;
            number >>= 1;
        }
        return reversedBits;
    }
}