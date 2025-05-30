package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_16_min_Window;

public class MinWindow {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(
                minimumWindow(
                        "ADOBECODEBANC",
                        "ABC"
                )
        );
    }

    private static String minimumWindow(final String SOURCE_TEXT, final String TARGET_TEXT) {
        if (SOURCE_TEXT.length() < TARGET_TEXT.length())
            return "";
        else {
            final int[] REQUIRED_CHARACTERS = new int[128];
            for (final char CHARACTER : TARGET_TEXT.toCharArray())
                REQUIRED_CHARACTERS[CHARACTER]++;
            int startIndex = 0,
                    endIndex = 0,
                    charactersToMatch = TARGET_TEXT.length(),
                    minimumWindowStart = 0,
                    minimumWindowLength = Integer.MAX_VALUE;
            while (endIndex < SOURCE_TEXT.length()) {
                if (REQUIRED_CHARACTERS[SOURCE_TEXT.charAt(endIndex++)]-- > 0)
                    charactersToMatch--;
                while (charactersToMatch == 0) {
                    if (endIndex - startIndex < minimumWindowLength) {
                        minimumWindowStart = startIndex;
                        minimumWindowLength = endIndex - startIndex;
                    }
                    if (REQUIRED_CHARACTERS[SOURCE_TEXT.charAt(startIndex++)]++ == 0)
                        charactersToMatch++;
                }
            }
            return minimumWindowLength == Integer.MAX_VALUE
                    ? ""
                    : SOURCE_TEXT.substring(minimumWindowStart, minimumWindowStart + minimumWindowLength);
        }
    }
}