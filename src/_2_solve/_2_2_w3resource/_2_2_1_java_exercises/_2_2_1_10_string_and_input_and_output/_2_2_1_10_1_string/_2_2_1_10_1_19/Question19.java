package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_19;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the index of all the characters of the alphabet.</h2>
 */

public class Question19 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Nullexia";
        printAllCharactersPositions(TEXT);
    }

    private static void printAllCharactersPositions(final String TEXT) {
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
                TEXT.indexOf('a'),
                TEXT.indexOf('b'),
                TEXT.indexOf('c'),
                TEXT.indexOf('d'),
                TEXT.indexOf('e'),
                TEXT.indexOf('f'),
                TEXT.indexOf('g'),
                TEXT.indexOf('h'),
                TEXT.indexOf('i'),
                TEXT.indexOf('j'),
                TEXT.indexOf('k'),
                TEXT.indexOf('l'),
                TEXT.indexOf('m'),
                TEXT.indexOf('n'),
                TEXT.indexOf('o'),
                TEXT.indexOf('p'),
                TEXT.indexOf('q'),
                TEXT.indexOf('r'),
                TEXT.indexOf('s'),
                TEXT.indexOf('t'),
                TEXT.indexOf('u'),
                TEXT.indexOf('v'),
                TEXT.indexOf('w'),
                TEXT.indexOf('x'),
                TEXT.indexOf('y'),
                TEXT.indexOf('z')
        );
    }
}