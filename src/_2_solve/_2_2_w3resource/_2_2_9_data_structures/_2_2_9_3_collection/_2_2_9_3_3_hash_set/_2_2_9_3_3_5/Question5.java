package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_3_hash_set._2_2_9_3_3_5;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if a hash set is empty or not.</h2>
 */

public class Question5 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] PARAMETERS) {
        addColors();
        System.out.print(COLORS.isEmpty());
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}