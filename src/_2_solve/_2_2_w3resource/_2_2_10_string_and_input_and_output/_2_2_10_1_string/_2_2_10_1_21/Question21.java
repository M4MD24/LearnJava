package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_21;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the last index of a string within a string.</h2>
 */

public class Question21 {
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
                TEXT.lastIndexOf('a', TEXT.length() - 1),
                TEXT.lastIndexOf('b', TEXT.length() - 1),
                TEXT.lastIndexOf('c', TEXT.length() - 1),
                TEXT.lastIndexOf('d', TEXT.length() - 1),
                TEXT.lastIndexOf('e', TEXT.length() - 1),
                TEXT.lastIndexOf('f', TEXT.length() - 1),
                TEXT.lastIndexOf('g', TEXT.length() - 1),
                TEXT.lastIndexOf('h', TEXT.length() - 1),
                TEXT.lastIndexOf('i', TEXT.length() - 1),
                TEXT.lastIndexOf('j', TEXT.length() - 1),
                TEXT.lastIndexOf('k', TEXT.length() - 1),
                TEXT.lastIndexOf('l', TEXT.length() - 1),
                TEXT.lastIndexOf('m', TEXT.length() - 1),
                TEXT.lastIndexOf('n', TEXT.length() - 1),
                TEXT.lastIndexOf('o', TEXT.length() - 1),
                TEXT.lastIndexOf('p', TEXT.length() - 1),
                TEXT.lastIndexOf('q', TEXT.length() - 1),
                TEXT.lastIndexOf('r', TEXT.length() - 1),
                TEXT.lastIndexOf('s', TEXT.length() - 1),
                TEXT.lastIndexOf('t', TEXT.length() - 1),
                TEXT.lastIndexOf('u', TEXT.length() - 1),
                TEXT.lastIndexOf('v', TEXT.length() - 1),
                TEXT.lastIndexOf('w', TEXT.length() - 1),
                TEXT.lastIndexOf('x', TEXT.length() - 1),
                TEXT.lastIndexOf('y', TEXT.length() - 1),
                TEXT.lastIndexOf('z', TEXT.length() - 1)
        );
    }
}