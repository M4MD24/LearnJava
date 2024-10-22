package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_12_integer_to_roman;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Seven different symbols represent Roman numerals with the following values:
 * <br/>
 * Symbol	Value
 * <br/>
 * I	1
 * <br/>
 * V	5
 * <br/>
 * X	10
 * <br/>
 * L	50
 * <br/>
 * C	100
 * <br/>
 * D	500
 * <br/>
 * M	1000
 * <br/>
 * Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:
 * <br/>
 * If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
 * <br/>
 * If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
 * <br/>
 * Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
 * <br/>
 * Given an integer, convert it to a Roman numeral.
 * </h2>
 */

public class IntegerToRoman {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 3;
        System.out.print(intToRoman(NUMBER));
    }

    private static String intToRoman(int number) {
        final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] SYMBOL = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final StringBuilder ROMAN = new StringBuilder();
        for (int index = 0; index < VALUES.length; index++)
            while (number >= VALUES[index]) {
                number -= VALUES[index];
                ROMAN.append(SYMBOL[index]);
            }
        return ROMAN.toString();
    }
}