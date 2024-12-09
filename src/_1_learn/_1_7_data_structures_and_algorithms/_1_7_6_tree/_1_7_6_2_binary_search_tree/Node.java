package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_2_binary_search_tree;

public class Node<Type> {
    Type data;
    Node<Type> right,
            left;

    public Node(Type data) {
        this.data = data;
    }
}