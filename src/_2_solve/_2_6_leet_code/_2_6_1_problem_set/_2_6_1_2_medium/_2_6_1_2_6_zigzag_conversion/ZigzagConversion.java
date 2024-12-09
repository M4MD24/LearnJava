package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_6_zigzag_conversion;

/**
 * <h1>Problem:</h1>
 * <h2>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <pre>
 * P   A   H   N
 * <br/>
 * A P L S I I G
 * <br/>
 * Y   I   R
 * </pre>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <br/>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <br/>
 * string convert(string s, int numRows);
 * </h2>
 */

public class ZigzagConversion {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "PAYPALISHIRING";
        System.out.print(convert(TEXT, 4));
    }

    private static String convert(final String TEXT, final int ROWS_NUMBER) {
        final int MAXIMUM_LENGTH = TEXT.length();
        if (ROWS_NUMBER == 1 || ROWS_NUMBER == MAXIMUM_LENGTH)
            return TEXT;
        else {
            final char[] CHARACTERS = new char[MAXIMUM_LENGTH];
            int index = 0;
            int increase = 2 * (ROWS_NUMBER - 1);
            for (int currentRowNumber = 0; currentRowNumber < ROWS_NUMBER; currentRowNumber++) {
                int countOfLetter = currentRowNumber;
                while (countOfLetter < MAXIMUM_LENGTH) {
                    CHARACTERS[index++] = TEXT.charAt(countOfLetter);
                    if (currentRowNumber == 0 || currentRowNumber == ROWS_NUMBER - 1)
                        countOfLetter += increase;
                    else {
                        countOfLetter += (increase - (2 * currentRowNumber));
                        if (countOfLetter < MAXIMUM_LENGTH) {
                            CHARACTERS[index++] = TEXT.charAt(countOfLetter);
                            countOfLetter += (2 * currentRowNumber);
                        }
                    }
                }
            }
            return new String(CHARACTERS);
        }
    }
}