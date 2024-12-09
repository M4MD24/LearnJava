package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_13_roman_to_integer;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <br/>
 * Symbol       Value
 * <br/>
 * I             1
 * <br/>
 * V             5
 * <br/>
 * X             10
 * <br/>
 * L             50
 * <br/>
 * C             100
 * <br/>
 * D             500
 * <br/>
 * M             1000
 * <br/>
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <br/>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <br/>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * <br/>
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * <br/>
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * <br/>
 * Given a roman numeral, convert it to an integer.
 * </h2>
 */

public class RomanToInteger {
    public static void main(final String[] PARAMETERS) {
        final String ROMAN = "III";
        System.out.print(romanToInt(ROMAN));
    }

    private static int romanToInt(final String TEXT) {
        int romanInteger = 0;
        for (int index = 0; index < TEXT.length(); index++) {
            final int CURRENT = romanCharToInt(TEXT.charAt(index));
            final int NEXT = (index < TEXT.length() - 1)
                    ? romanCharToInt(TEXT.charAt(index + 1))
                    : 0;
            romanInteger += (CURRENT < NEXT)
                    ? -CURRENT
                    : CURRENT;
        }
        return romanInteger;
    }

    private static int romanCharToInt(final char CHARACTER) {
        return switch (CHARACTER) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}