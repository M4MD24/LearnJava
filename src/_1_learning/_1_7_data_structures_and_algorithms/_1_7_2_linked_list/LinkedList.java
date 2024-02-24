package _1_learning._1_7_data_structures_and_algorithms._1_7_2_linked_list;

public class LinkedList<Type extends Comparable<Type>> {
    Node<Type> head;

    public void insertFirst(Type data) {
        Node<Type> node = new Node<>();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, Type data) {
        if (index == 0) insertFirst(data);
        else {
            Node<Type> node = new Node<>(),
                    anotherNode = head;
            node.data = data;
            for (int count = 0; count < index - 1; count++) anotherNode = anotherNode.next;
            node.next = anotherNode.next;
            anotherNode.next = node;
        }
    }

    public void insertLast(Type data) {
        Node<Type> node = new Node<>();
        node.data = data;
        node.next = null;
        if (head == null) head = node;
        else {
            Node<Type> anotherNode = head;
            while (anotherNode.next != null) anotherNode = anotherNode.next;
            anotherNode.next = node;
        }
    }

    public void showAll() {
        Node<Type> node = head;
        if (node != null) {
            while (node.next != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.print(node.data);
        } else System.out.print("Nothing to show");
    }

    public void updateAt(int index, Type data) {
        Node<Type> node = head;
        int count = 0;
        while (count != index && node.next != null) {
            node = node.next;
            count++;
        }
        if (count == index) node.data = data;
        else throw new IndexOutOfBoundsException("Not found your index");
    }

    public void swapBetweenIndexes(int index1, int index2) {
        Node<Type> firstNode = head,
                secondNode = head;
        Type temporaryNodeData;

        for (int index = 0; index != index1; index++) firstNode = firstNode.next;
        for (int index = 0; index != index2; index++) secondNode = secondNode.next;

        temporaryNodeData = firstNode.data;
        firstNode.data = secondNode.data;
        secondNode.data = temporaryNodeData;
    }

    public void deleteFirst() {
        Node<Type> node = head;
        head = node.next;
    }

    public void deleteAt(int index) {
        if (index == 0) deleteFirst();
        else {
            Node<Type> node = head,
                    anotherNode;
            for (int count = 0; count < index - 1; count++) node = node.next;
            anotherNode = node.next;
            node.next = anotherNode.next;
        }
    }

    public void deleteLast() {
        Node<Type> node = head;
        while (node.next.next != null) node = node.next;
        node.next = null;
    }

    public void deleteAll() {
        head = null;
    }

    public boolean checkLinkedListIsSorted() {
        Node<Type> currentNode = head;
        while (currentNode.next != null) {
            Node<Type> node1 = currentNode,
                    node2 = currentNode.next;
            if (node1.data.compareTo(node2.data) <= 0) currentNode = currentNode.next;
            else return false;
        }
        return true;
    }

    public void removeDuplicatesFromSortedLinkedList() {
        if (checkLinkedListIsSorted()) {
            Node<Type> currentNode = head;
            while (currentNode != null && currentNode.next != null) {
                Type node1 = currentNode.data,
                        node2 = currentNode.next.data;
                if (node1 == node2) currentNode.next = currentNode.next.next;
                else currentNode = currentNode.next;
            }
        } else System.out.println("LinkedList not sorted");
    }
}