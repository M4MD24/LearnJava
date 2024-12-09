package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_5_priority_queue._2_2_9_3_5_5;

import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove all elements from a priority queue.</h2>
 */

public class Question5 {
    private static final PriorityQueue<String> COLORS = new PriorityQueue<>();

    public static void main(final String[] PARAMETERS) {
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