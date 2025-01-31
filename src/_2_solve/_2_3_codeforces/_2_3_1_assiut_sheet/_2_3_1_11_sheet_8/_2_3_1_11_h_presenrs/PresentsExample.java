package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_h_presenrs;

import java.util.Scanner;

/**
 * <h1>H. Presents</h1>
 * <h2>
 * time limit per test: 2 second
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
 * Little Petya very much likes gifts. Recently he has received a new laptop as a New Year gift from his mother. He immediately decided to give it to somebody else as what can be more pleasant than giving somebody gifts. And on this occasion he organized a New Year party at his place and invited n his friends there.
 * <br/>
 * If there's one thing Petya likes more that receiving gifts, that's watching others giving gifts to somebody else. Thus, he safely hid the laptop until the next New Year and made up his mind to watch his friends exchanging gifts while he does not participate in the process. He numbered all his friends with integers from 1 to n. Petya remembered that a friend number i gave a gift to a friend number pi. He also remembered that each of his friends received exactly one gift.
 * <br/>
 * Now Petya wants to know for each friend i the number of a friend who has given him a gift.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 2 3 4 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>4 1 2 3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 3 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 3 2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 2</h2>
 */

public class PresentsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte LENGTH = INPUT.nextByte();
    private static final byte[] NUMBERS = new byte[101];

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        printValues();
    }

    private static void printValues() {
        for (byte index = 1; index <= LENGTH; index++)
            System.out.println(NUMBERS[index]);
    }

    private static void inputValues() {
        for (byte index = 1; index <= LENGTH; index++)
            NUMBERS[INPUT.nextByte()] = index;
    }
}