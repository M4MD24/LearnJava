package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_9_convert_string_to_array;

import java.util.Arrays;

public class ConvertStringToArray {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(Arrays.toString(stringConvertedToArray("Hello")));
    }

    private static char[] stringConvertedToArray(final String TEXT) {
        return TEXT.toCharArray();
    }
}