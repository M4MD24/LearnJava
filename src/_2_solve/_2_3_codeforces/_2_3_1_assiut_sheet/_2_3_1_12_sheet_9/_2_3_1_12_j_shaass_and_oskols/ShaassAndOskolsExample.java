package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_j_shaass_and_oskols;

import java.util.Scanner;

/**
 * <h1>J. Shaass and Oskols</h1>
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
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 10 10 10 10 10
 * <br/>
 * 5
 * <br/>
 * 2 5
 * <br/>
 * 3 13
 * <br/>
 * 2 12
 * <br/>
 * 1 13
 * <br/>
 * 4 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 0
 * <br/>
 * 12
 * <br/>
 * 5
 * <br/>
 * 0
 * <br/>
 * 16
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 2 4 1
 * <br/>
 * 1
 * <br/>
 * 2 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 3
 * <br/>
 * 0
 * <br/>
 * 3
 * </h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_j_shaass_and_oskols.images <h2>Question</h2>
 */

public class ShaassAndOskolsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte COUNT_OF_TOTAL_BIRDS = INPUT.nextByte();
    private static final short[] TOTAL_BIRDS = new short[COUNT_OF_TOTAL_BIRDS];

    public static void main(final String[] PARAMETERS) {
        inputTotalBirds();
        killBirds();
        printTotalBirds();
    }

    private static void killBirds() {
        final byte COUNT_OF_TIMES_KILLED = INPUT.nextByte();
        for (byte index = 0; index < COUNT_OF_TIMES_KILLED; index++) {
            byte place = INPUT.nextByte();
            short wantedForMurder = INPUT.nextShort();
            place--;
            wantedForMurder--;
            if (place > 0) TOTAL_BIRDS[place - 1] += wantedForMurder;
            if (place < COUNT_OF_TOTAL_BIRDS - 1) TOTAL_BIRDS[place + 1] += (short) (TOTAL_BIRDS[place] - wantedForMurder - 1);
            TOTAL_BIRDS[place] = 0;
        }
    }

    private static void printTotalBirds() {
        for (byte index = 0; index < COUNT_OF_TOTAL_BIRDS; index++) System.out.println(TOTAL_BIRDS[index]);
    }

    private static void inputTotalBirds() {
        for (byte index = 0; index < COUNT_OF_TOTAL_BIRDS; index++) TOTAL_BIRDS[index] = INPUT.nextByte();
    }
}