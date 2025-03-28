package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_p_no_time_for_dragons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * <h1>P. No Time for Dragons</h1>
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
 * One fairy king hated dragons to death. Not only that these monsters burn whole villages to ashes, kidnap princesses and guard treasures that they don't need at all, but they are also mentioned in statements of programming problems very often. To end their tyranny, he decided to recruit an army and destroy these damned creatures once and forever.
 * <br/>
 * The king found out that there are n dragons in total, and to defeat the i-th of them he needs an army of ai soldiers, bi of which will be killed during the battle. Now he wants to know the minimal number of soldiers he needs to recruit in order to kill all the dragons. The king doesn't care about the order of battles: the only thing that matters is that none of the dragons will be left alive.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 7 4
 * <br/>
 * 5 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>8</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 4 1
 * <br/>
 * 6 4
 * <br/>
 * 5 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>10</h2>
 */

public class NoTimeForDragonsExample {
    private static int countOfDragons;
    private static Round[] rounds;

    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(String.valueOf(getMinimumSoldiersNeeded()));
        OUTPUT.flush();
    }

    private static long getMinimumSoldiersNeeded() {
        Arrays.sort(rounds, Comparator.comparingInt(Round::getCountOfRemainingSoldiers));
        long countOfSoldiersNeeded = rounds[countOfDragons - 1].getCountOfSoldiers();
        int countOfRemainingSoldiers = rounds[countOfDragons - 1].getCountOfRemainingSoldiers();
        for (int index = countOfDragons - 2; index >= 0; index--) {
            if (countOfRemainingSoldiers < rounds[index].getCountOfSoldiers()) {
                countOfSoldiersNeeded += rounds[index].getCountOfSoldiers() - countOfRemainingSoldiers;
                countOfRemainingSoldiers = rounds[index].getCountOfRemainingSoldiers();
            } else countOfRemainingSoldiers = countOfRemainingSoldiers - rounds[index].getCountOfDeadSoldiers();
        }
        return countOfSoldiersNeeded;
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfDragons = Integer.parseInt(INPUT.readLine());
        rounds = new Round[countOfDragons];
        for (int index = 0; index < countOfDragons; index++) {
            final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
            final int COUNT_OF_SOLDIERS = Integer.parseInt(LINE.nextToken()), COUNT_OF_DEAD_SOLDIERS = Integer.parseInt(LINE.nextToken());
            final Round ROUND = new Round();
            ROUND.setCountOfRemainingSoldiers(COUNT_OF_SOLDIERS - COUNT_OF_DEAD_SOLDIERS);
            ROUND.setCountOfSoldiers(COUNT_OF_SOLDIERS);
            ROUND.setCountOfDeadSoldiers(COUNT_OF_DEAD_SOLDIERS);
            rounds[index] = ROUND;
        }
    }
}

class Round {
    private int countOfRemainingSoldiers, countOfSoldiers, countOfDeadSoldiers;

    public int getCountOfRemainingSoldiers() {
        return countOfRemainingSoldiers;
    }

    public void setCountOfRemainingSoldiers(final int COUNT_OF_REMAINING_SOLDIERS) {
        this.countOfRemainingSoldiers = COUNT_OF_REMAINING_SOLDIERS;
    }

    public int getCountOfSoldiers() {
        return countOfSoldiers;
    }

    public void setCountOfSoldiers(final int COUNT_OF_SOLDIERS) {
        this.countOfSoldiers = COUNT_OF_SOLDIERS;
    }

    public int getCountOfDeadSoldiers() {
        return countOfDeadSoldiers;
    }

    public void setCountOfDeadSoldiers(final int COUNT_OF_DEAD_SOLDIERS) {
        this.countOfDeadSoldiers = COUNT_OF_DEAD_SOLDIERS;
    }
}