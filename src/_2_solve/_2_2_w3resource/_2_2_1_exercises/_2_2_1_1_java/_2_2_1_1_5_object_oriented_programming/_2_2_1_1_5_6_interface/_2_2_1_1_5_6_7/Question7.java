package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_6_interface._2_2_1_1_5_6_7;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order. Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the sort() method.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final Sortable BUBBLE_SORT = new BubbleSort();
        BUBBLE_SORT.sort();

        final Sortable SELECTION_SORT = new SelectionSort();
        SELECTION_SORT.sort();
    }
}

interface Sortable {
    void sort();
}

class BubbleSort implements Sortable {
    @Override
    public void sort() {
        System.out.println("Done Bubble Sort!");
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort() {
        System.out.println("Done Selection Sort!");
    }
}