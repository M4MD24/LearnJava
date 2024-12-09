package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_49_group_anagrams;

import java.util.*;

/**
 * <h1>Problem:</h1>
 * <h2>Given an array of strings strs, group the anagrams together. You can return the answer in any order.</h2>
 */

public class GroupAnagrams {
    public static void main(final String[] PARAMETERS) {
        System.out.print(groupAnagrams(new String[]{"eat", "tea", "ate", "nat", "bat"}));
    }

    private static List<List<String>> groupAnagrams(final String[] TEXTS) {
        final Map<String, List<String>> MAP = new HashMap<>();
        for (final String WORD : TEXTS) {
            final char[] CHARS = WORD.toCharArray();
            Arrays.sort(CHARS);
            MAP.computeIfAbsent(
                    new String(CHARS),
                    _ -> new ArrayList<>()
            ).add(WORD);
        }
        return new ArrayList<>(MAP.values());
    }
}