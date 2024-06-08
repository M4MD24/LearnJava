package _1_learning._1_7_data_structures_and_algorithms._1_7_2_linked_list._1_7_2_2_doubly_linked_list;

public class DoublyLinkedList<Type extends Comparable<Type>> {
    Node<Type> head;

    public void insertFirst(final Type DATA) {
        final Node<Type> NODE = new Node<>();
        NODE.data = DATA;
        NODE.next = head;
        head = NODE;
    }

    public void insertAt(int index, Type data) {
        if (index == 0) insertFirst(data);
        else {
            final Node<Type> NODE = new Node<>();
            Node<Type> anotherNode = head;
            NODE.data = data;
            for (int count = 0; count < index - 1; count++)
                anotherNode = anotherNode.next;
            NODE.previous = anotherNode;
            NODE.next = anotherNode.next;
            anotherNode.next = NODE;
        }
    }

    public void insertLast(final Type DATA) {
        final Node<Type> NODE = new Node<>();
        NODE.data = DATA;
        NODE.next = null;
        if (head == null) head = NODE;
        else if (head.next == null) {
            NODE.previous = head;
            head.next = NODE;
        } else {
            Node<Type> nextNode = head;
            while (nextNode.next != null)
                nextNode = nextNode.next;
            NODE.previous = nextNode;
            nextNode.next = NODE;
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

    public void swapValueBetweenIndexes(int index1, int index2) {
        Node<Type> firstNode = head,
                secondNode = head;
        Type temporaryNodeData;

        for (int index = 0; index != index1; index++) firstNode = firstNode.next;
        for (int index = 0; index != index2; index++) secondNode = secondNode.next;

        temporaryNodeData = firstNode.data;
        firstNode.data = secondNode.data;
        secondNode.data = temporaryNodeData;
    }

    public void swapEveryTwoAdjacent() {
        Node<Type> firstNode = head,
                secondNode;
        while (firstNode != null && firstNode.next != null) {
            secondNode = firstNode.next;
            final Type TEMPORARY_NODE_DATA = firstNode.data;
            firstNode.data = secondNode.data;
            secondNode.data = TEMPORARY_NODE_DATA;
            firstNode = secondNode.next;
        }
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
            final Node<Type> FIRST_NODE = currentNode,
                    SECOND_NODE = currentNode.next;
            if (FIRST_NODE.data.compareTo(SECOND_NODE.data) <= 0 || FIRST_NODE.data.compareTo(SECOND_NODE.data) == 0)
                currentNode = currentNode.next;
            else return false;
        }
        return true;
    }

    public void removeDuplicatesFromSortedLinkedList() {
        if (checkLinkedListIsSorted()) {
            Node<Type> currentNode = head;
            while (currentNode != null && currentNode.next != null) {
                final Type FIRST_NODE_DATA = currentNode.data,
                        SECOND_NODE_DATA = currentNode.next.data;
                if (FIRST_NODE_DATA == SECOND_NODE_DATA) currentNode.next = currentNode.next.next;
                else currentNode = currentNode.next;
            }
        } else System.out.println("LinkedList not sorted");
    }

    public void merge(DoublyLinkedList<Type> LinkedList2) {
        Node<Type> node = head;
        if (node != null) {
            while (node.next != null) node = node.next;
            node.next = LinkedList2.head;
        }
    }

    public void bubbleSort() {
        final int size = size();
        if (size > 1 && !isSorted()) {
            for (int round = 0; round < size - 1; round++) {
                Node<Type> current = head;
                for (int index = 0; index < size - round - 1; index++) {
                    Node<Type> next = current.next;
                    if (next.data.compareTo(current.data) < 0) {
                        Type temp = current.data;
                        current.data = next.data;
                        next.data = temp;
                    }
                    current = current.next;
                }
            }
        }
    }

    public boolean isSorted() {
        Node<Type> currentNode = head;
        int size = size();
        if (currentNode.next != null) {
            for (int index = 0; index < size; index++) {
                final Type FIRST_NODE_DATA = currentNode.data,
                        SECOND_NODE_DATA = currentNode.next.data;
                if (FIRST_NODE_DATA.compareTo(SECOND_NODE_DATA) < 0) currentNode = currentNode.next;
                else return false;
            }
        }
        return true;
    }

    public int size() {
        Node<Type> node = head;
        int maxSize = 1;
        if (node != null) {
            while (node.next != null) {
                node = node.next;
                maxSize++;
            }
        } else maxSize = 0;
        return maxSize;
    }

    public void remove2ndFromTheEnd() {
        Node<Type> node = head,
                anotherNode = null;
        if (node.next != null) {
            while (node.next != null) {
                if (node.next.next == null) {
                    anotherNode = node.next;
                    break;
                } else node = node.next;
            }
            assert anotherNode != null;
            node.data = anotherNode.data;
            node.next = null;
        } else head = null;
    }
}