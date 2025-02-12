package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_3_hash_set._2_2_1_9_3_3_4;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to empty an hash set.</h2>
 */

public class Question4 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.println("Before Clear: " + COLORS);
        COLORS.clear();
        System.out.print("After Clear: " + COLORS);
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}