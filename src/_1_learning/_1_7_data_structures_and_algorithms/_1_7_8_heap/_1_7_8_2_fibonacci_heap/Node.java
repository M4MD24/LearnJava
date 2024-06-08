package _1_learning._1_7_data_structures_and_algorithms._1_7_8_heap._1_7_8_2_fibonacci_heap;

public class Node {
    Node left = this,
            right = this;
    int value;

    Node(final int ELEMENT) {
        this.value = ELEMENT;
    }
}