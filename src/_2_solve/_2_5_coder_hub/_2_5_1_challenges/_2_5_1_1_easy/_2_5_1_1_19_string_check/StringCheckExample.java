package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_19_string_check;

public class StringCheckExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(stringCheck(new String[]{"Code", "Code", "Code"}));
        System.out.println(stringCheck(new String[]{"Hi", "By"}));
        System.out.println(stringCheck(new String[]{"Cup", "Cup"}));
        System.out.print(stringCheck(new String[]{"Book", "Water"}));
    }

    private static boolean stringCheck(final String[] TEXTS) {
        final String TARGET_TEXT = TEXTS[0];
        for (final String TEXT : TEXTS)
            if (!TARGET_TEXT.equals(TEXT))
                return false;
        return true;
    }
}