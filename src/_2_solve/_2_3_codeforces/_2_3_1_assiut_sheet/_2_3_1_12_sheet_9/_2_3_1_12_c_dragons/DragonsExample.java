package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_c_dragons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * <h1>C. Dragons</h1>
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
 * Kirito is stuck on a level of the MMORPG he is playing now. To move on in the game, he's got to defeat all n dragons that live on this level. Kirito and the dragons have strength, which is represented by an integer. In the duel between two opponents the duel's outcome is determined by their strength. Initially, Kirito's strength equals s.
 * <br/>
 * If Kirito starts duelling with the i-th (1 ≤ i ≤ n) dragon and Kirito's strength is not greater than the dragon's strength xi, then Kirito loses the duel and dies. But if Kirito's strength is greater than the dragon's strength, then he defeats the dragon and gets a bonus strength increase by yi.
 * <br/>
 * Kirito can fight the dragons in any order. Determine whether he can move on to the next level of the game, that is, defeat all dragons without a single loss.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample Kirito's strength initially equals 2. As the first dragon's strength is less than 2, Kirito can fight it and defeat it. After that he gets the bonus and his strength increases to 2 + 99 = 101. Now he can defeat the second dragon and move on to the next level.
 * <br/>
 * In the second sample Kirito's strength is too small to defeat the only dragon and win.
 * </h2>
 * <h1>Input:</h1>
 * <h2>
 * 2 2
 * <br/>
 * 1 99
 * <br/>
 * 100 0
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 10 1
 * <br/>
 * 100 100
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class DragonsExample {
    private record FightData(int POWER_OF_DRAGON, int AMOUNT_FORCE_TO_BE_INCREASED) {
    }

    private static final Scanner INPUT = new Scanner(System.in);
    private static final short POWER_OF_FIGHTER = INPUT.nextShort(),
            COUNT_OF_ROUNDS = INPUT.nextShort();
    private static final FightData[] DRAGONS = new FightData[COUNT_OF_ROUNDS];

    public static void main(final String[] PARAMETERS) {
        inputFightData();
        Arrays.sort(DRAGONS, Comparator.comparingInt(FightData::POWER_OF_DRAGON));
        System.out.println(isFighterWon()
                ? "YES"
                : "NO");
    }

    private static void inputFightData() {
        for (short round = 0; round < COUNT_OF_ROUNDS; round++)
            DRAGONS[round] = new FightData(INPUT.nextShort(), INPUT.nextShort());
    }

    private static boolean isFighterWon() {
        int currentForceToBeIncreased = POWER_OF_FIGHTER;
        for (final FightData DRAGON : DRAGONS) {
            if (currentForceToBeIncreased <= DRAGON.POWER_OF_DRAGON)
                return false;
            currentForceToBeIncreased += DRAGON.AMOUNT_FORCE_TO_BE_INCREASED;
        }
        return true;
    }
}