package _1_learn._1_7_data_structures_and_algorithms._1_7_8_heap._1_7_8_2_fibonacci_heap;

class FibonacciHeap {
    private Node root;
    private int size;

    boolean isEmpty() {
        return root == null;
    }

    void clear() {
        root = null;
        size = 0;
    }

    void insertElements(final int ELEMENT) {
        final Node NODE = new Node(ELEMENT);
        NODE.value = ELEMENT;
        if (root != null) {
            NODE.left = root;
            NODE.right = root.right;
            root.right = NODE;
            NODE.right.left = NODE;
            if (ELEMENT < root.value)
                root = NODE;
        } else
            root = NODE;
        size++;
    }

    void displayElements() {
        Node CURRENT_NODE = root;
        if (CURRENT_NODE == null) {
            System.out.print("Empty\n");
            return;
        }
        do {
            System.out.print(CURRENT_NODE.value + " ");
            CURRENT_NODE = CURRENT_NODE.right;
        } while (CURRENT_NODE != root && CURRENT_NODE.right != null);
        System.out.println();
    }

    int getSize() {
        return size;
    }

    void deleteElements(final int ELEMENT) {
        if (root == null) {
            System.out.println("Nothing to delete.");
            return;
        }
        Node targetNodeToDelete = null,
                currentNode = root;
        boolean foundIt = false;
        do {
            if (currentNode.value == ELEMENT) {
                targetNodeToDelete = currentNode;
                foundIt = true;
                break;
            }
            currentNode = currentNode.right;
        } while (currentNode != root);
        if (!foundIt) {
            System.out.println("Element not found in the heap.");
            return;
        }
        Node leftNode = targetNodeToDelete.left;
        Node rightNode = targetNodeToDelete.right;
        leftNode.right = rightNode;
        rightNode.left = leftNode;
        if (targetNodeToDelete == root)
            if (targetNodeToDelete == targetNodeToDelete.right)
                root = null;
            else
                root = targetNodeToDelete.right;
        size--;
    }
}