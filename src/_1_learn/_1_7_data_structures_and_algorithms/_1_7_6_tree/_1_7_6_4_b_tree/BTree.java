package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_4_b_tree;

class BTree {
    final int DEGREE;

    class Node {
        int node;
        final int[] KEY_VALUE = new int[2 * DEGREE - 1];
        final Node[] CHILDREN = new Node[2 * DEGREE];
        boolean isLeaf = true;

        private int findNode(final int KEY_VALUE) {
            for (int index = 0; index < this.node; index++)
                if (this.KEY_VALUE[index] == KEY_VALUE)
                    return index;
            return -1;
        }
    }

    BTree(final int DEGREE) {
        this.DEGREE = DEGREE;
        root = new Node();
        root.node = 0;
        root.isLeaf = true;
    }

    private Node root;

    private void splitNode(final Node FIRST_NODE, final int POSITION, final Node SECOND_NODE) {
        final Node THIRD_NODE = new Node();
        THIRD_NODE.isLeaf = SECOND_NODE.isLeaf;
        THIRD_NODE.node = DEGREE - 1;
        if (DEGREE - 1 >= 0)
            System.arraycopy(SECOND_NODE.KEY_VALUE, DEGREE, THIRD_NODE.KEY_VALUE, 0, DEGREE - 1);
        if (!SECOND_NODE.isLeaf)
            if (DEGREE >= 0)
                System.arraycopy(SECOND_NODE.CHILDREN, DEGREE, THIRD_NODE.CHILDREN, 0, DEGREE);
        SECOND_NODE.node = DEGREE - 1;
        for (int index = FIRST_NODE.node; index >= POSITION + 1; index--)
            FIRST_NODE.CHILDREN[index + 1] = FIRST_NODE.CHILDREN[index];
        FIRST_NODE.CHILDREN[POSITION + 1] = THIRD_NODE;
        for (int index = FIRST_NODE.node - 1; index >= POSITION; index--)
            FIRST_NODE.KEY_VALUE[index + 1] = FIRST_NODE.KEY_VALUE[index];
        FIRST_NODE.KEY_VALUE[POSITION] = SECOND_NODE.KEY_VALUE[DEGREE - 1];
        FIRST_NODE.node = FIRST_NODE.node + 1;
    }

    void insertElement(final int KEY_VALUE) {
        final Node CURRENT_ROOT = root;
        if (CURRENT_ROOT.node == 2 * DEGREE - 1) {
            Node s = new Node();
            root = s;
            s.isLeaf = false;
            s.node = 0;
            s.CHILDREN[0] = CURRENT_ROOT;
            splitNode(s, 0, CURRENT_ROOT);
            insertElementRecursion(s, KEY_VALUE);
        } else
            insertElementRecursion(CURRENT_ROOT, KEY_VALUE);
    }

    private void insertElementRecursion(final Node FIRST_NODE, final int KEY_VALUE) {
        int index;
        if (FIRST_NODE.isLeaf) {
            for (index = FIRST_NODE.node - 1; index >= 0 && KEY_VALUE < FIRST_NODE.KEY_VALUE[index]; index--)
                FIRST_NODE.KEY_VALUE[index + 1] = FIRST_NODE.KEY_VALUE[index];
            FIRST_NODE.KEY_VALUE[index + 1] = KEY_VALUE;
            FIRST_NODE.node = FIRST_NODE.node + 1;
        } else {
            index = FIRST_NODE.node - 1;
            while (index >= 0 && KEY_VALUE < FIRST_NODE.KEY_VALUE[index])
                index--;
            index++;
            final Node TEMPORARY_NODE = FIRST_NODE.CHILDREN[index];
            if (TEMPORARY_NODE.node == 2 * DEGREE - 1) {
                splitNode(FIRST_NODE, index, TEMPORARY_NODE);
                if (KEY_VALUE > FIRST_NODE.KEY_VALUE[index])
                    index++;
            }
            insertElementRecursion(FIRST_NODE.CHILDREN[index], KEY_VALUE);
        }
    }

    void displayElements() {
        displayElementsRecursion(root);
    }

    private void displayElementsRecursion(final Node FIRST_NODE) {
        for (int index = 0; index < FIRST_NODE.node; index++)
            System.out.print(FIRST_NODE.KEY_VALUE[index] + " ");
        if (!FIRST_NODE.isLeaf)
            for (int index = 0; index < FIRST_NODE.node + 1; index++)
                displayElementsRecursion(FIRST_NODE.CHILDREN[index]);
    }

    void deleteElement(final int KEY_VALUE) {
        deleteElementRecursion(root, KEY_VALUE);
        if (root.node == 0 && !root.isLeaf)
            root = root.CHILDREN[0];
    }

    private void deleteElementRecursion(final Node CURRENT_NODE, final int KEY_VALUE) {
        final int INDEX = CURRENT_NODE.findNode(KEY_VALUE);
        if (INDEX != -1) {
            if (CURRENT_NODE.isLeaf) {
                for (int round = INDEX; round < CURRENT_NODE.node - 1; round++)
                    CURRENT_NODE.KEY_VALUE[round] = CURRENT_NODE.KEY_VALUE[round + 1];
                CURRENT_NODE.node--;
            } else {
                final Node PREVIOUS_CHILD = CURRENT_NODE.CHILDREN[INDEX],
                        NEXT_CHILD = CURRENT_NODE.CHILDREN[INDEX + 1];
                if (PREVIOUS_CHILD.node >= DEGREE) {
                    final int PREDECESSOR = getPredecessor(PREVIOUS_CHILD);
                    CURRENT_NODE.KEY_VALUE[INDEX] = PREDECESSOR;
                    deleteElementRecursion(PREVIOUS_CHILD, PREDECESSOR);
                } else if (NEXT_CHILD.node >= DEGREE) {
                    final int SUCCESSOR = getSuccessor(NEXT_CHILD);
                    CURRENT_NODE.KEY_VALUE[INDEX] = SUCCESSOR;
                    deleteElementRecursion(NEXT_CHILD, SUCCESSOR);
                } else {
                    mergeChildren(CURRENT_NODE, INDEX);
                    deleteElementRecursion(PREVIOUS_CHILD, KEY_VALUE);
                }
            }
        }
    }

    private int getPredecessor(final Node NODE) {
        Node currentNode = NODE;
        while (!currentNode.isLeaf)
            currentNode = currentNode.CHILDREN[currentNode.node];
        return currentNode.KEY_VALUE[currentNode.node - 1];
    }

    private int getSuccessor(final Node node) {
        Node currentNode = node;
        while (!currentNode.isLeaf)
            currentNode = currentNode.CHILDREN[0];
        return currentNode.KEY_VALUE[0];
    }

    private void mergeChildren(final Node PARENT_NODE, final int CURRENT_INDEX) {
        final Node CHILD = PARENT_NODE.CHILDREN[CURRENT_INDEX],
                SIBLING = PARENT_NODE.CHILDREN[CURRENT_INDEX + 1];
        CHILD.KEY_VALUE[DEGREE - 1] = PARENT_NODE.KEY_VALUE[CURRENT_INDEX];
        if (SIBLING.node >= 0)
            System.arraycopy(SIBLING.KEY_VALUE, 0, CHILD.KEY_VALUE, DEGREE, SIBLING.node);
        if (!CHILD.isLeaf)
            if (SIBLING.node + 1 >= 0)
                System.arraycopy(SIBLING.CHILDREN, 0, CHILD.CHILDREN, DEGREE, SIBLING.node + 1);
        for (int index = CURRENT_INDEX + 1; index < PARENT_NODE.node; index++)
            PARENT_NODE.KEY_VALUE[index - 1] = PARENT_NODE.KEY_VALUE[index];
        for (int index = CURRENT_INDEX + 2; index <= PARENT_NODE.node; index++)
            PARENT_NODE.CHILDREN[index - 1] = PARENT_NODE.CHILDREN[index];
        CHILD.node += SIBLING.node + 1;
        PARENT_NODE.node--;
    }
}