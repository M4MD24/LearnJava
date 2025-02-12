package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_4_tree_set._2_2_1_9_3_4_3;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to add all the elements of a specified tree set to another tree set.</h2>
 */

public class Question3 {
    private static final TreeSet<String> FIRST_COLORS = new TreeSet<>(),
            SECOND_COLORS = new TreeSet<>();

    public static void main(final String[] ARGUMENTS) {
        addFirstColors();
        addSecondColors();
        final TreeSet<String> AFTER_MERGE_COLORS = new TreeSet<>();
        AFTER_MERGE_COLORS.addAll(FIRST_COLORS);
        AFTER_MERGE_COLORS.addAll(SECOND_COLORS);
        System.out.print(AFTER_MERGE_COLORS);
    }

    private static void addSecondColors() {
        SECOND_COLORS.add("Blue");
        SECOND_COLORS.add("Pink");
        SECOND_COLORS.add("Yellow");
        SECOND_COLORS.add("Gray");
    }

    private static void addFirstColors() {
        FIRST_COLORS.add("Red");
        FIRST_COLORS.add("LimeGreen");
        FIRST_COLORS.add("Crimson");
        FIRST_COLORS.add("Black");
        FIRST_COLORS.add("White");
    }
}