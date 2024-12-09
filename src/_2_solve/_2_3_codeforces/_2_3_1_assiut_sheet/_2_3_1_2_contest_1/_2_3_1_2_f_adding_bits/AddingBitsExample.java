package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_f_adding_bits;

import java.util.Scanner;

/**
 * <h1>F. Adding Bits</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>
 * Peter Parker had worked hard throughout his digital logic course, but when he was asked to implement a 32 bit adder for a machine, he made a mistake in the design part. After tracing the design for half an hour, he found his flaw!! He was doing bitwise addition, but the carry bit is always zero.
 * <br/>
 * 4= 100
 * <br/>
 * +
 * <br/>
 * 6= 110
 * <br/>
 * =
 * <br/>
 * 2= 010
 * <br/>
 * Now, he has to write an efficient program that would take 2 unsigned 32 bit decimal numbers as input, and reproduce the output by adding them in the same way as his circuit does.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 6</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>6 9</h2>
 * <h1>Output:</h1>
 * <h2>15</h2>
 */

public class AddingBitsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final long NUMBER_1 = INPUT.nextLong(),
                NUMBER_2 = INPUT.nextLong(),
                SUM_BINARY_NUMBERS = NUMBER_1 ^ NUMBER_2;

        System.out.print(SUM_BINARY_NUMBERS);
    }
}