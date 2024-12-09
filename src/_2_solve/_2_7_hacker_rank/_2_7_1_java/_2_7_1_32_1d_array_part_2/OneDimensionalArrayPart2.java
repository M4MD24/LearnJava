package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_32_1d_array_part_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_32_1d_array_part_2.files <h2>Question</h2>
 */

public class OneDimensionalArrayPart2 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final int QUERIES = Integer.parseInt(INPUT.readLine().trim());
        for (int query = 0; query < QUERIES; query++) {
            String[] firstLine = INPUT.readLine().split(" ");
            final int NUMBERS = Integer.parseInt(firstLine[0]);
            final int LEAP = Integer.parseInt(firstLine[1]);
            final int[] COMMANDS = new int[NUMBERS];
            final String[] COMMAND_INPUT = INPUT.readLine().split(" ");
            for (int index = 0; index < NUMBERS; index++)
                COMMANDS[index] = Integer.parseInt(COMMAND_INPUT[index]);
            System.out.println(canWin(LEAP, COMMANDS) ? "YES" : "NO");
        }
    }

    private static boolean canWin(final int LEAP, final int[] COMMANDS) {
        return isWinningMove(LEAP, COMMANDS, 0);
    }

    private static boolean isWinningMove(final int LEAP, final int[] COMMANDS, final int CURRENT_INDEX) {
        if (CURRENT_INDEX >= COMMANDS.length)
            return true;
        else {
            if (CURRENT_INDEX < 0 || COMMANDS[CURRENT_INDEX] == 1)
                return false;
            else {
                COMMANDS[CURRENT_INDEX] = 1;
                return isWinningMove(LEAP, COMMANDS, CURRENT_INDEX + 1) ||
                        isWinningMove(LEAP, COMMANDS, CURRENT_INDEX + LEAP) ||
                        isWinningMove(LEAP, COMMANDS, CURRENT_INDEX - 1);
            }
        }
    }
}