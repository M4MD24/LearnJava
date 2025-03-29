package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_3_hash_set._2_2_1_1_9_3_3_8;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a hash set to a tree set.</h2>
 */

public class Question8 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        final Set<String> COLORS_AS_TREE_SET = new HashSet<>(COLORS);
        System.out.print(COLORS_AS_TREE_SET);
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}