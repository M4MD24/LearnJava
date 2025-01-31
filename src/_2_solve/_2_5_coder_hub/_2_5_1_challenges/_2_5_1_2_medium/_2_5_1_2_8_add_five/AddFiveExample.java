package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_8_add_five;

import java.util.Arrays;

public class AddFiveExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(addFive(new String[]{"code", "c"})));
        System.out.println(Arrays.toString(addFive(new String[]{"test", "t"})));
        System.out.println(Arrays.toString(addFive(new String[]{"null"})));
        System.out.print(Arrays.toString(addFive(new String[]{"book", "pen", "pencil"})));
    }

    private static String[] addFive(final String[] WORDS) {
        for (int index = 0; index < WORDS.length; index++)
            WORDS[index] += 5;
        return WORDS;
    }
}