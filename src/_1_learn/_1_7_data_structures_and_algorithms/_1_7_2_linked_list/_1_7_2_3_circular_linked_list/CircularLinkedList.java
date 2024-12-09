package _1_learn._1_7_data_structures_and_algorithms._1_7_2_linked_list._1_7_2_3_circular_linked_list;

public class CircularLinkedList<Type extends Comparable<Type>> {
    Node<Type> head;

    public void insertFirst(final Type DATA) {
        Node<Type> node = new Node<>();
        node.data = DATA;
        node.next = node;
        if (head != null) {
            Node<Type> nextNode = head;
            do {
                nextNode = nextNode.next;
            } while (nextNode.next != head);
            node.next = head;
            nextNode.next = node;
        }
        head = node;
    }

    public void insertAt(final int INDEX, final Type DATA) {
        if (INDEX == 0) insertFirst(DATA);
        else {
            Node<Type> node = new Node<>(),
                    nextNode = head;
            node.data = DATA;
            for (int count = 0; count < INDEX - 1; count++)
                nextNode = nextNode.next;
            node.next = nextNode.next;
            nextNode.next = node;
        }
    }

    public void insertLast(final Type DATA) {
        Node<Type> node = new Node<>();
        node.data = DATA;
        if (head == null) {
            node.next = node;
            head = node;
        } else {
            Node<Type> nextNode = head;
            do {
                nextNode = nextNode.next;
            } while (nextNode.next != head);
            node.next = head;
            nextNode.next = node;
        }
    }

    public void showAll() {
        Node<Type> node = head;
        if (node != null) {
            do {
                System.out.print(node.data + " ");
                node = node.next;
            } while (node != head);
        } else System.out.print("Nothing to show");
    }

    public void updateAt(final int INDEX, final Type DATA) {
        Node<Type> node = head;
        int count = 0;
        while (count != INDEX && node.next != null) {
            node = node.next;
            count++;
        }
        if (count == INDEX) node.data = DATA;
        else throw new IndexOutOfBoundsException("Not found your index");
    }

    public void swapValuesBetweenIndexes(final int FIRST_INDEX, final int SECOND_INDEX) {
        Node<Type> firstNode = head,
                secondNode = head;
        Type temporaryNodeData;

        for (int index = 0; index != FIRST_INDEX; index++) firstNode = firstNode.next;
        for (int index = 0; index != SECOND_INDEX; index++) secondNode = secondNode.next;

        temporaryNodeData = firstNode.data;
        firstNode.data = secondNode.data;
        secondNode.data = temporaryNodeData;
    }

    public void deleteFirst() {
        if (head == null) ;
        else if (head.next == null)
            head = null;
        else {
            Node<Type> nextNode = head;
            while (nextNode.next != head)
                nextNode = nextNode.next;
            head = head.next;
            nextNode.next = head;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) deleteFirst();
        else {
            Node<Type> nextNode = head,
                    anotherNode;
            for (int count = 0; count < index - 1; count++)
                nextNode = nextNode.next;
            anotherNode = nextNode.next;
            nextNode.next = anotherNode.next;
        }
    }

    public void deleteLast() {
        Node<Type> node = head;
        while (node.next.next != head)
            node = node.next;
        node.next = head;
    }

    public void deleteAll() {
        head = null;
    }

    public boolean checkLinkedListIsSorted() {
        Node<Type> currentNode = head;
        while (currentNode.next != head) {
            final Node<Type> FIRST_NODE = currentNode,
                    SECOND_NODE = currentNode.next;
            if (FIRST_NODE.data.compareTo(SECOND_NODE.data) <= 0 || FIRST_NODE.data.compareTo(SECOND_NODE.data) == 0)
                currentNode = currentNode.next;
            else
                return false;
        }
        return true;
    }

    public void removeDuplicatesFromSortedLinkedList() {
        if (checkLinkedListIsSorted()) {
            Node<Type> currentNode = head;
            while (currentNode.next != head) {
                final Type FIRST_NODE_DATA = currentNode.data,
                        SECOND_NODE_DATA = currentNode.next.data;
                if (FIRST_NODE_DATA == SECOND_NODE_DATA) currentNode.next = currentNode.next.next;
                else currentNode = currentNode.next;
            }
        } else System.out.println("LinkedList not sorted");
    }

    public void merge(final CircularLinkedList<Type> SECOND_CIRCULAR_LINKED_LIST) {
        Node<Type> firstListLastNode = head,
                secondListLastNode = SECOND_CIRCULAR_LINKED_LIST.head;

        if (firstListLastNode != null && secondListLastNode != null) {
            while (firstListLastNode.next != head)
                firstListLastNode = firstListLastNode.next;
            while (secondListLastNode.next != SECOND_CIRCULAR_LINKED_LIST.head)
                secondListLastNode = secondListLastNode.next;
            firstListLastNode.next = SECOND_CIRCULAR_LINKED_LIST.head;
            secondListLastNode.next = head;
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
        if (currentNode.next != null) {
            while (currentNode.next != head) {
                final Type FIRST_NODE_DATA = currentNode.data,
                        SECOND_NODE_DATA = currentNode.next.data;
                if (FIRST_NODE_DATA.compareTo(SECOND_NODE_DATA) < 0)
                    currentNode = currentNode.next;
                else return false;
            }
        }
        return true;
    }

    public int size() {
        Node<Type> node = head;
        int maxSize = 1;
        if (node != null) {
            while (node.next != head) {
                node = node.next;
                maxSize++;
            }
        } else maxSize = 0;
        return maxSize;
    }

    public void remove2ndFromTheEnd() {
        Node<Type> nextNode = head;
        while (nextNode.next.next.next != head)
            nextNode = nextNode.next;
        nextNode.next = nextNode.next.next;
    }
}