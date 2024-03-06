package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_g_matryoshka;

import java.util.Scanner;

/**
 * <h1>G. Matryoshka</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>The Egyptian football team will be in Russia for the World Cup. Of course, they all would like to buy souvenirs for their families. Luckily, they met the prince of souvenirs Matryoshka who is famous for his masterpiece Katryoshka. He makes it using different wooden pieces: eyes, mouths and bodies. He can form a nice Katryoshka using one of the following combinations:</h2>
 * <ul>
 *     <li>Two eyes and one body.</li>
 *     <li>Two eyes, one mouth, and one body.</li>
 *     <li>One eye, one mouth, and one body.</li>
 * </ul>
 * <h2>If the prince has n eyes, m mouths and k bodies, what is the largest number of Matryoshka he can make?</h2>
 * </h2>
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
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        long EYES = INPUT.nextLong(),
                MOUTHS = INPUT.nextLong(),
                BODIES = INPUT.nextLong(),
                largestNumberOfMatryoshka = minimumNumberOfMatryoshkaPiece(EYES, MOUTHS, BODIES);
        EYES -= largestNumberOfMatryoshka;
        BODIES -= largestNumberOfMatryoshka;
        largestNumberOfMatryoshka += Math.min(EYES / 2, BODIES);
        System.out.print(largestNumberOfMatryoshka);
    }

    private static long minimumNumberOfMatryoshkaPiece(final long EYES, final long MOUTHS, final long BODIES) {
        if ((EYES <= MOUTHS) &&
                (EYES <= BODIES)) return EYES;
        else if ((MOUTHS <= EYES) &&
                (MOUTHS <= BODIES)) return MOUTHS;
        else return BODIES;
    }
}