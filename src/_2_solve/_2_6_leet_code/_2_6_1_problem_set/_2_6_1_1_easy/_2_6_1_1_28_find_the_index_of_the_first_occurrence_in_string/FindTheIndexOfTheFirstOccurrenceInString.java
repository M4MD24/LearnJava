package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_28_find_the_index_of_the_first_occurrence_in_string;

/**
 * <h1>Problem:</h1>
 * <h2>Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.</h2>
 */

public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getIndexOfSubStringInText("leetcode", "leeto"));
    }

    private static int getIndexOfSubStringInText(final String HAYSTACK, final String NEEDLE) {
        return HAYSTACK.indexOf(NEEDLE);
    }
}