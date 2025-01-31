package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_72_can_form;

public class CanFormExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(canForm("Hubcoders", "coderhub"));
        System.out.println(canForm("SATR", "satr"));
        System.out.println(canForm("programmer", "programming"));
        System.out.print(canForm("worldhello", "hello"));
    }

    private static String canForm(final String SOURCE_TEXT, final String TARGET_TEXT) {
        final StringBuilder SOURCE_TEXT_AS_STRING_BUILDER = new StringBuilder(SOURCE_TEXT.toLowerCase()),
                TARGET_TEXT_AS_STRING_BUILDER = new StringBuilder(TARGET_TEXT.toLowerCase());
        int indexOfSourceText = 0;
        int maximumIndexOfSourceText = SOURCE_TEXT_AS_STRING_BUILDER.length();
        while (!TARGET_TEXT_AS_STRING_BUILDER.isEmpty() &&
                indexOfSourceText < maximumIndexOfSourceText) {
            final char CHARACTER_OF_SOURCE_TEXT = SOURCE_TEXT_AS_STRING_BUILDER.charAt(indexOfSourceText),
                    CHARACTER_OF_TARGET_TEXT = TARGET_TEXT_AS_STRING_BUILDER.charAt(0);
            if (CHARACTER_OF_SOURCE_TEXT == CHARACTER_OF_TARGET_TEXT) {
                TARGET_TEXT_AS_STRING_BUILDER.deleteCharAt(0);
                SOURCE_TEXT_AS_STRING_BUILDER.deleteCharAt(indexOfSourceText);
                indexOfSourceText = 0;
                maximumIndexOfSourceText--;
            } else
                indexOfSourceText++;
        }
        return TARGET_TEXT_AS_STRING_BUILDER.isEmpty()
                ? "yes"
                : "no";
    }
}