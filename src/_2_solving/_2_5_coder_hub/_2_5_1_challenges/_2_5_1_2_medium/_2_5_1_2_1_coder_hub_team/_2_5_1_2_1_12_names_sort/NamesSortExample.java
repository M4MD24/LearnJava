package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_12_names_sort;

import java.util.Arrays;

public class NamesSortExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getNamesAfterSorting(new String[]{"Ahmed Omar", "Yousef Abdullah"}, "ASC")));
        System.out.println(Arrays.toString(getNamesAfterSorting(new String[]{"Mohammed Yahya", "Khaled Bader", "Khaled Bader"}, "DESC")));
        System.out.println(Arrays.toString(getNamesAfterSorting(new String[]{"Khaled Bader"}, "ASC")));
        System.out.print(Arrays.toString(getNamesAfterSorting(new String[]{}, "DESC")));
    }

    private static String[] getNamesAfterSorting(final String[] NAMES, final String ORDER) {
        for (int round = 0; round < NAMES.length; round++)
            for (int index = round + 1; index < NAMES.length; index++) {
                final boolean CONDITION = ORDER.equals("ASC")
                        ? NAMES[round].compareTo(NAMES[index]) > 0
                        : NAMES[round].compareTo(NAMES[index]) < 0;
                if (CONDITION) {
                    final String TEMPORARY_NAME = NAMES[round];
                    NAMES[round] = NAMES[index];
                    NAMES[index] = TEMPORARY_NAME;
                }
            }
        return NAMES;
    }
}