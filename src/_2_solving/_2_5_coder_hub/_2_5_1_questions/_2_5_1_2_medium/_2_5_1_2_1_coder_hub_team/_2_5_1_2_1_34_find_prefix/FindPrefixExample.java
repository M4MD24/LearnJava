package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_34_find_prefix;

import java.util.Arrays;

public class FindPrefixExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(findPrefix(new String[]{"Nouf", "Abdullah"}, "Gh")));
        System.out.println(Arrays.toString(findPrefix(new String[]{"Reassemble", "Remainder", "Room", "Receive"}, "re")));
        System.out.println(Arrays.toString(findPrefix(new String[]{"Compared", "Coding", "Career", "Coderhub", "Cold", "Call"}, "co")));
        System.out.print(Arrays.toString(findPrefix(new String[]{"Save", "Saudi", "Satr", "Send", "Salt", "Super", "Sample"}, "sa")));
    }

    private static String[] findPrefix(final String[] WORDS,final String TEXT) {
        return Arrays.stream(WORDS)
                .filter(
                        word -> word
                                .toLowerCase()
                                .startsWith(
                                        TEXT.toLowerCase()
                                )
                ).toArray(String[]::new).length > 0
                ? Arrays.stream(WORDS)
                .filter(
                        word -> word
                                .toLowerCase()
                                .startsWith(
                                        TEXT.toLowerCase()
                                )
                ).toArray(String[]::new)
                : new String[]{"No matches found"};
    }
}