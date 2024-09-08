package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_o_free_ice_cream;

import java.util.Scanner;

/**
 * <h1>O. Free Ice Cream</h1>
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
 * <h1>Question:</h1>
 * <h2>
 * After their adventure with the magic mirror Kay and Gerda have returned home and sometimes give free ice cream to kids in the summer.
 * <br/>
 * At the start of the day they have x ice cream packs. Since the ice cream is free, people start standing in the queue before Kay and Gerda's house even in the night. Each person in the queue wants either to take several ice cream packs for himself and his friends or to give several ice cream packs to Kay and Gerda (carriers that bring ice cream have to stand in the same queue).
 * <br/>
 * If a carrier with d ice cream packs comes to the house, then Kay and Gerda take all his packs. If a child who wants to take d ice cream packs comes to the house, then Kay and Gerda will give him d packs if they have enough ice cream, otherwise the child will get no ice cream at all and will leave in distress.
 * <br/>
 * Kay wants to find the amount of ice cream they will have after all people will leave from the queue, and Gerda wants to find the number of distressed kids.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 7
 * <br/>
 * + 5
 * <br/>
 * - 10
 * <br/>
 * - 20
 * <br/>
 * + 40
 * <br/>
 * - 20
 * </h2>
 * <h1>Output:</h1>
 * <h2>22 1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 17
 * <br/>
 * - 16
 * <br/>
 * - 2
 * <br/>
 * - 98
 * <br/>
 * + 100
 * <br/>
 * - 98
 * </h2>
 * <h1>Output:</h1>
 * <h2>3 2</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Consider the first sample:</h2>
 * <ol>
 *     <li>Initially Kay and Gerda have 7 packs of ice cream.</li>
 *     <li>Carrier brings 5 more, so now they have 12 packs.</li>
 *     <li>A kid asks for 10 packs and receives them. There are only 2 packs remaining.</li>
 *     <li>Another kid asks for 20 packs. Kay and Gerda do not have them, so the kid goes away distressed.</li>
 *     <li>Carrier bring 40 packs, now Kay and Gerda have 42 packs.</li>
 *     <li>Kid asks for 20 packs and receives them. There are 22 packs remaining.</li>
 * </ol>
 */

public class FreeIceCreamExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short countOfTestCases = INPUT.nextShort(),
            countOfDistressedKids = 0;
    private static long iceCreamPacksAvailable = INPUT.nextLong();

    public static void main(final String[] PARAMETERS) {
        inputValues();
        printReport();
    }

    private static void printReport() {
        System.out.printf("%d %d", iceCreamPacksAvailable, countOfDistressedKids);
    }

    private static void inputValues() {
        while (countOfTestCases-- > 0)
            GivingOrTakingIceCreamPacks(INPUT.next().charAt(0) == '-', INPUT.nextInt());
    }

    private static void GivingOrTakingIceCreamPacks(final boolean IS_REQUESTED, final int CURRENT_ICE_CREAM_PACKS) {
        if (IS_REQUESTED) {
            if (iceCreamPacksAvailable >= CURRENT_ICE_CREAM_PACKS) iceCreamPacksAvailable -= CURRENT_ICE_CREAM_PACKS;
            else countOfDistressedKids++;
        } else iceCreamPacksAvailable += CURRENT_ICE_CREAM_PACKS;
    }
}