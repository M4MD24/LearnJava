package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_53_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_53_comparator.files <h2>Question</h2>
 */

record Player(String NAME, int SCORE) {
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(final Player FIRST_PLAYER, final Player SECOND_PLAYER) {
        if (FIRST_PLAYER.SCORE() != SECOND_PLAYER.SCORE())
            return SECOND_PLAYER.SCORE() - FIRST_PLAYER.SCORE();
        else
            return FIRST_PLAYER.NAME().compareTo(SECOND_PLAYER.NAME());
    }
}

public class ComparatorExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int COUNT_OF_PLAYERS = INPUT.nextInt();
        final Player[] PLAYERS = new Player[COUNT_OF_PLAYERS];
        for (int index = 0; index < COUNT_OF_PLAYERS; index++) PLAYERS[index] = new Player(INPUT.next(), INPUT.nextInt());
        Arrays.sort(PLAYERS, new Checker());
        for (final Player PLAYER : PLAYERS) System.out.println(PLAYER.NAME() + " " + PLAYER.SCORE());
    }
}