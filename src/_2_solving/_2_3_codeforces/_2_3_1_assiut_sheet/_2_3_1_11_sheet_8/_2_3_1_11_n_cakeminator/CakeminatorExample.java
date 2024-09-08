package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_n_cakeminator;

import java.util.Scanner;

/**
 * <h1>N. Cakeminator</h1>
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
 * <h1>Input:</h1>
 * <h2>
 * 3 4
 * <br/>
 * S...
 * <br/>
 * ....
 * <br/>
 * ..S.
 * </h2>
 * <h1>Output:</h1>
 * <h2>8</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_n_cakeminator.images <h2>Question and Note</h2>
 */

public class CakeminatorExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte ROW = INPUT.nextByte(),
            COLUMN = INPUT.nextByte();
    private static final StringBuffer[] CAKE = new StringBuffer[ROW];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        System.out.print(getSumEatenPieces());
    }

    private static byte getSumEatenPieces() {
        byte sumEatenPieces = 0,
                sumCurrentPieces = 0;
        for (byte row = 0; row < ROW; row++) {
            boolean canEaten = true;
            for (byte column = 0; column < COLUMN; column++) {
                if (CAKE[row].charAt(column) == '.')
                    sumCurrentPieces++;
                else {
                    canEaten = false;
                    break;
                }
            }
            if (canEaten) {
                for (byte column = 0; column < COLUMN; column++) {
                    if (CAKE[row].charAt(column) == '.')
                        CAKE[row].setCharAt(column, '*');
                }
                sumEatenPieces += sumCurrentPieces;
            }
            sumCurrentPieces = 0;
        }
        for (byte column = 0; column < COLUMN; column++) {
            boolean canEaten = true;
            for (byte row = 0; row < ROW; row++) {
                switch (CAKE[row].charAt(column)) {
                    case '.':
                        sumCurrentPieces++;
                        break;
                    case '*':
                        continue;
                    default:
                        canEaten = false;
                }
            }
            if (canEaten) {
                for (byte row = 0; row < ROW; row++) {
                    if (CAKE[row].charAt(column) == '.')
                        CAKE[row].setCharAt(column, '*');
                }
                sumEatenPieces += sumCurrentPieces;
            }
            sumCurrentPieces = 0;
        }
        return sumEatenPieces;
    }

    private static void inputValues() {
        for (byte row = 0; row < ROW; row++) {
            CAKE[row] = new StringBuffer();
            CAKE[row].append(INPUT.next());
        }
    }
}