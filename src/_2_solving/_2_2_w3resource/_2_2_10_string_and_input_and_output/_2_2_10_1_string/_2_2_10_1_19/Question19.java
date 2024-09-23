package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_19;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the index of all the characters of the alphabet.</h2>
 */

public class Question19 {
    public static void main(final String[] PARAMETERS) {
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
                TEXT.indexOf('a', 0),
                TEXT.indexOf('b', 0),
                TEXT.indexOf('c', 0),
                TEXT.indexOf('d', 0),
                TEXT.indexOf('e', 0),
                TEXT.indexOf('f', 0),
                TEXT.indexOf('g', 0),
                TEXT.indexOf('h', 0),
                TEXT.indexOf('i', 0),
                TEXT.indexOf('j', 0),
                TEXT.indexOf('k', 0),
                TEXT.indexOf('l', 0),
                TEXT.indexOf('m', 0),
                TEXT.indexOf('n', 0),
                TEXT.indexOf('o', 0),
                TEXT.indexOf('p', 0),
                TEXT.indexOf('q', 0),
                TEXT.indexOf('r', 0),
                TEXT.indexOf('s', 0),
                TEXT.indexOf('t', 0),
                TEXT.indexOf('u', 0),
                TEXT.indexOf('v', 0),
                TEXT.indexOf('w', 0),
                TEXT.indexOf('x', 0),
                TEXT.indexOf('y', 0),
                TEXT.indexOf('z', 0)
        );
    }
}