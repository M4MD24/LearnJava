package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_n_matryoshka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>N. Matryoshka</h1>
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
 * <h2>the Egyptian football team will be in Russia for the World Cup, of course, they all would like to buy souvenirs for their families. Luckily they met the king of souvenirs of the famous Russian souvenir Matryoshka; the king makes his masterpiece Matryoshka using different kinds of pieces: wooden eyes, wooden mouths, and wooden bodies. He can form a nice Matryoshka using one of the following ways:</h2>
 * <ul>
 *     <li>Two eyes and one body.</li>
 *     <li>Two eyes, mouth, and one body.</li>
 *     <li>eye, mouth, and one body.</li>
 * </ul>
 * <h2>If the king has n eyes, m mouths, and k bodies, what is the largest number of Matryoshkas that can be made by the king?</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 2 3</h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>0 11 2</h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>90 24 89</h2>
 * <h1>Output:</h1>
 * <h2>57</h2>
 */

public class MatryoshkaExample {
    private static long eyes,
            bodies,
            largestNumberOfMatryoshka;

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputPiecesValues();
        OUTPUT.write(String.valueOf(getLargestNumberOfMatryoshkaPiece()));
        OUTPUT.flush();
    }

    private static long getLargestNumberOfMatryoshkaPiece() {
        return largestNumberOfMatryoshka + Math.min((eyes - largestNumberOfMatryoshka) / 2, bodies - largestNumberOfMatryoshka);
    }

    private static void inputPiecesValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        eyes = Long.parseLong(LINE.nextToken());
        final long MOUTHS = Long.parseLong(LINE.nextToken());
        bodies = Long.parseLong(LINE.nextToken());
        largestNumberOfMatryoshka = minimumNumberOfMatryoshkaPiece(eyes, MOUTHS, bodies);
    }

    private static long minimumNumberOfMatryoshkaPiece(final long EYES, final long MOUTHS, final long BODIES) {
        if ((EYES <= MOUTHS) &&
                (EYES <= BODIES)) return EYES;
        else if ((MOUTHS <= EYES) &&
                (MOUTHS <= BODIES)) return MOUTHS;
        else return BODIES;
    }
}