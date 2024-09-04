package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_29.stack_algorithm_with_linked_list_algorithm;

import _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_29.stack_algorithm_with_linked_list_algorithm.linked_list_algorithm.LinkedListAlgorithm;

public class StackAlgorithm<Type> {
    final LinkedListAlgorithm<Type> LINKED_LIST_ALGORITHM = new LinkedListAlgorithm<>();

    public void push(final Type DATA) {
        LINKED_LIST_ALGORITHM.insertLast(DATA);
    }

    public void pop() {
        LINKED_LIST_ALGORITHM.deleteLast();
    }

    public Type peek() {
        return LINKED_LIST_ALGORITHM.showLastElement();
    }

    public void showElements() {
        LINKED_LIST_ALGORITHM.showAll();
    }
}