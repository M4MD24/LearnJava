package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_interface._2_2_5_3_7_question_426;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order. Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the sort() method.</h2>
 */

public class Question426 {
    public static void main(final String[] ARGS) {
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