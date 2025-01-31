package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_93;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the longest substring that appears at both ends of a given string.</h2>
 */

public class Question93 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getLongestSubStringAppearsAtBothEnds("100100"));
    }

    private static String getLongestSubStringAppearsAtBothEnds(final String TEXT) {
        for (int index = TEXT.length() / 2; index > 0; index--) {
            final String SUB_TEXT = TEXT.substring(0, index);
            if (TEXT.startsWith(SUB_TEXT) && TEXT.endsWith(SUB_TEXT))
                return SUB_TEXT;
        }
        return "";
// >
/*
          return IntStream.range(
                          1,
                          TEXT.length() / 2 + 1
                  )
                  .mapToObj(index -> {
                      System.out.print(TEXT.substring(0, index) + " | ");
                      return TEXT.substring(
                              0,
                              index
                      );
                  })
                  .filter(word -> {
                      System.out.println(TEXT.startsWith(word) && TEXT.endsWith(word));
                      return TEXT.startsWith(word) && TEXT.endsWith(word);
                  })
                  .reduce((first, second) -> second)
                  .orElse("");
 */
    }
}