package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_l_sereja_and_dima;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * <h1>K. Prime Fibonacci</h1>
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
 * Sereja and Dima play a game. The rules of the game are very simple. The players have n cards in a row. Each card contains a number, all numbers on the cards are distinct. The players take turns, Sereja moves first. During his turn a player can take one card: either the leftmost card in a row, or the rightmost one. The game ends when there is no more cards. The player who has the maximum sum of numbers on his cards by the end of the game, wins.
 * <br/>
 * Sereja and Dima are being greedy. Each of them chooses the card with the larger number during his move.
 * <br/>
 * Inna is a friend of Sereja and Dima. She knows which strategy the guys are using, so she wants to determine the final score, given the initial state of the game. Help her.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 4 1 2 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>12 5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 7
 * <br/>
 * 1 2 3 4 5 6 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>16 12</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In the first sample Sereja will take cards with numbers 10 and 2, so Sereja's sum is 12. Dima will take cards with numbers 4 and 1, so Dima's sum is 5.</h2>
 */

public class SerejaAndDimaExample {
    private static final Scanner INPUT = new Scanner(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static short countOfCards = INPUT.nextShort();
    private static final short[] CARDS_NUMBERS = new short[countOfCards];

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        takeCardsSerejaAndDima();
        OUTPUT.flush();
    }

    private static void takeCardsSerejaAndDima() throws IOException {
        int serejaSum = 0,
                dimaSum = 0;
        short start = 0,
                end = (short) (countOfCards - 1);
        byte turn = 0;
        while (countOfCards-- > 0) {
            final short VALUE;
            if (CARDS_NUMBERS[start] > CARDS_NUMBERS[end]) {
                VALUE = CARDS_NUMBERS[start];
                start++;
            } else {
                VALUE = CARDS_NUMBERS[end];
                end--;
            }
            if (turn == 0) {
                serejaSum += VALUE;
                turn = 1;
            } else {
                dimaSum += VALUE;
                turn = 0;
            }
        }
        OUTPUT.write(serejaSum + " " + dimaSum);
    }

    private static void inputValues() {
        for (short index = 0; index < countOfCards; index++)
            CARDS_NUMBERS[index] = INPUT.nextShort();
    }
}