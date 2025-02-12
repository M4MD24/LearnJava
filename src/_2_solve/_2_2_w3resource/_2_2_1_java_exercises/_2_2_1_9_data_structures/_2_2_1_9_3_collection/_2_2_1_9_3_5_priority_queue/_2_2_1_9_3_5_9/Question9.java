package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_5_priority_queue._2_2_1_9_3_5_9;

import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to retrieve and remove the first element.</h2>
 */

public class Question9 {
    private static final PriorityQueue<String> COLORS = new PriorityQueue<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.println("Before Remove: " + COLORS);
        System.out.println("Color Removed: " + COLORS.poll());
        System.out.print("After Remove: " + COLORS);
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}