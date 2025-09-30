package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_21;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the last index of a string within a string.</h2>
 */

public class Question21 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Barmajaa";
        printAllLastCharacterPositions(TEXT);
    }

    private static void printAllLastCharacterPositions(final String TEXT) {
        System.out.printf("""
                        a  | b  | c  | d  | e  | f  | g
                        %2d | %2d | %2d | %2d | %2d | %2d | %2d
                        --------------------------------
                        h  | i  | j  | k  | l  | m  | n
                        %2d | %2d | %2d | %2d | %2d | %2d | %2d
                        --------------------------------
                        o  | p  | q  | r  | s  | t  | u
                        %2d | %2d | %2d | %2d | %2d | %2d | %2d
                        --------------------------------
                        v  | w  | x  | y  | z
                        %2d | %2d | %2d | %2d | %2d""",
                TEXT.lastIndexOf('a'),
                TEXT.lastIndexOf('b'),
                TEXT.lastIndexOf('c'),
                TEXT.lastIndexOf('d'),
                TEXT.lastIndexOf('e'),
                TEXT.lastIndexOf('f'),
                TEXT.lastIndexOf('g'),
                TEXT.lastIndexOf('h'),
                TEXT.lastIndexOf('i'),
                TEXT.lastIndexOf('j'),
                TEXT.lastIndexOf('k'),
                TEXT.lastIndexOf('l'),
                TEXT.lastIndexOf('m'),
                TEXT.lastIndexOf('n'),
                TEXT.lastIndexOf('o'),
                TEXT.lastIndexOf('p'),
                TEXT.lastIndexOf('q'),
                TEXT.lastIndexOf('r'),
                TEXT.lastIndexOf('s'),
                TEXT.lastIndexOf('t'),
                TEXT.lastIndexOf('u'),
                TEXT.lastIndexOf('v'),
                TEXT.lastIndexOf('w'),
                TEXT.lastIndexOf('x'),
                TEXT.lastIndexOf('y'),
                TEXT.lastIndexOf('z')
        );
    }
}