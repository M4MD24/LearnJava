package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_3_hash_set._2_2_1_1_9_3_3_7;

import java.util.Arrays;
import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a hash set to an array.</h2>
 */

public class Question7 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        final String[] COLORS_AS_ARRAY = new String[COLORS.size()];
        COLORS.toArray(COLORS_AS_ARRAY);
        System.out.print(Arrays.toString(COLORS_AS_ARRAY));
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}