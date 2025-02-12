package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_2_stack._2_2_1_9_2_29.stack_algorithm_with_linked_list_algorithm.linked_list_algorithm;

public class LinkedListAlgorithm<Type> {
    NodeAlgorithm<Type> head;

    public void insertLast(Type data) {
        NodeAlgorithm<Type> node = new NodeAlgorithm<>();
        node.data = data;
        node.nextNode = null;
        if (head == null) head = node;
        else {
            NodeAlgorithm<Type> anotherNode = head;
            while (anotherNode.nextNode != null) anotherNode = anotherNode.nextNode;
            anotherNode.nextNode = node;
        }
    }

    public void deleteLast() {
        NodeAlgorithm<Type> node = head;
        while (node.nextNode.nextNode != null)
            node = node.nextNode;
        node.nextNode = null;
    }

    public void showAll() {
        NodeAlgorithm<Type> node = head;
        if (node != null) {
            while (node.nextNode != null) {
                System.out.print(node.data + " ");
                node = node.nextNode;
            }
            System.out.print(node.data);
        } else System.out.print("Nothing to show");
    }

    public Type showLastElement() {
        NodeAlgorithm<Type> node = head;
        if (node != null) {
            while (node.nextNode != null)
                node = node.nextNode;
            return node.data;
        } else {
            System.out.print("Nothing to show");
            return null;
        }
    }
}