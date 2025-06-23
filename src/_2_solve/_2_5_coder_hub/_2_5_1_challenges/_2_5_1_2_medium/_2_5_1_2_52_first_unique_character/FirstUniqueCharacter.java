package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_52_first_unique_character;

public class FirstUniqueCharacter {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(
                firstUniqueCharacter(
                        "loveleetcode"
                )
        );
    }

    private static int firstUniqueCharacter(
            final String TEXT
    ) {
        for (int index = 0; index < TEXT.length(); index++)
            if (TEXT.indexOf(TEXT.charAt(index)) == TEXT.lastIndexOf(TEXT.charAt(index)))
                return index;
        return -1;
    }
}