package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_e_george_and_accommodation;

import java.util.Scanner;

/**
 * <h1>E. George and Accommodation</h1>
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
 * George has recently entered the BSUCP (Berland State University for Cool Programmers). George has a friend Alex who has also entered the university. Now they are moving into a dormitory.
 * <br/>
 * George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi ≤ qi). Your task is to count how many rooms has free place for both George and Alex.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 1
 * <br/>
 * 2 2
 * <br/>
 * 3 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 10
 * <br/>
 * 0 10
 * <br/>
 * 10 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 */

public class GeorgeAndAccommodationExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static byte length = INPUT.nextByte();

    public static void main(final String[] PARAMETERS) {
        inputValues();
    }

    private static void inputValues() {
        byte differenceCounter = 0;
        while (length-- > 0)
            if (INPUT.nextByte() < INPUT.nextByte() - 1)
                differenceCounter++;
        System.out.print(differenceCounter);
    }
}