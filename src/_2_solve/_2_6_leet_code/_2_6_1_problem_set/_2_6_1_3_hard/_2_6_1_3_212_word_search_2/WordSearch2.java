package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_212_word_search_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 * <br/>
 * <br/>
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 * </h2>
 */

public class WordSearch2 {
    public static void main(final String[] PARAMETERS) {
        final char[][] BOARD = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        final String[] WORDS = {"oath", "pea", "eat", "rain"};
        System.out.print(findWords(BOARD, WORDS));
    }

    private static List<String> findWords(final char[][] BOARD, final String[] WORDS) {
        final Node ROOT = buildTrie(WORDS);
        final Set<String> CAPTURED_WORDS = new HashSet<>();
        for (int row = 0; row < BOARD.length; row++)
            for (int column = 0; column < BOARD[0].length; column++)
                depthFirstSearch(
                        BOARD,
                        row,
                        column,
                        ROOT,
                        CAPTURED_WORDS
                );
        return new ArrayList<>(CAPTURED_WORDS);
    }

    private static void depthFirstSearch(final char[][] BOARD, final int ROW, final int COLUMN, Node node, final Set<String> CAPTURED_WORDS) {
        final char CURRENT_CHARACTER = BOARD[ROW][COLUMN];
        if (CURRENT_CHARACTER != '#' && node.NEXT[CURRENT_CHARACTER - 'a'] != null) {
            node = node.NEXT[CURRENT_CHARACTER - 'a'];
            if (node.word != null)
                CAPTURED_WORDS.add(node.word);
            BOARD[ROW][COLUMN] = '#';
            if (ROW > 0)
                depthFirstSearch(
                        BOARD,
                        ROW - 1,
                        COLUMN,
                        node,
                        CAPTURED_WORDS
                );
            if (COLUMN > 0)
                depthFirstSearch(
                        BOARD,
                        ROW,
                        COLUMN - 1,
                        node,
                        CAPTURED_WORDS
                );
            if (ROW < BOARD.length - 1)
                depthFirstSearch(
                        BOARD,
                        ROW + 1,
                        COLUMN,
                        node,
                        CAPTURED_WORDS
                );
            if (COLUMN < BOARD[0].length - 1)
                depthFirstSearch(
                        BOARD,
                        ROW,
                        COLUMN + 1,
                        node,
                        CAPTURED_WORDS
                );
            BOARD[ROW][COLUMN] = CURRENT_CHARACTER;
        }
    }

    private static Node buildTrie(final String[] WORDS) {
        final Node ROOT = new Node();
        for (final String WORD : WORDS) {
            Node node = ROOT;
            for (final char CHARACTER : WORD.toCharArray()) {
                final int INDEX_BY_CHARACTER = CHARACTER - 'a';
                if (node.NEXT[INDEX_BY_CHARACTER] == null)
                    node.NEXT[INDEX_BY_CHARACTER] = new Node();
                node = node.NEXT[INDEX_BY_CHARACTER];
            }
            node.word = WORD;
        }
        return ROOT;
    }
}