package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_6_red_black_tree;

class RedBlackTree {
    private Node currentNode,
            parentNode,
            grandNode,
            greatNode;
    private final Node HEADER_NODE;
    private static final Node NULL_NODE = new Node(0);

    static {
        NULL_NODE.leftNodeAddress = NULL_NODE;
        NULL_NODE.rightNodeAddress = NULL_NODE;
    }

    private static final int BLACK = 1,
            RED = 0;

    RedBlackTree(final int INITIAL_VALUE) {
        HEADER_NODE = new Node(INITIAL_VALUE);
        HEADER_NODE.leftNodeAddress = NULL_NODE;
        HEADER_NODE.rightNodeAddress = NULL_NODE;
    }

    boolean isEmpty() {
        return HEADER_NODE.rightNodeAddress == NULL_NODE;
    }

    void makeEmpty() {
        HEADER_NODE.rightNodeAddress = NULL_NODE;
    }

    void insertElement(final int ELEMENT) {
        currentNode = parentNode = grandNode = HEADER_NODE;
        NULL_NODE.nodeData = ELEMENT;
        while (currentNode.nodeData != ELEMENT) {
            greatNode = grandNode;
            grandNode = parentNode;
            parentNode = currentNode;
            currentNode = ELEMENT < currentNode.nodeData
                    ? currentNode.leftNodeAddress
                    : currentNode.rightNodeAddress;
            if (currentNode.leftNodeAddress.colorOfNode == RED && currentNode.rightNodeAddress.colorOfNode == RED)
                handleReorient(ELEMENT);
        }
        if (currentNode != NULL_NODE)
            return;
        currentNode = new Node(ELEMENT, NULL_NODE, NULL_NODE);
        if (ELEMENT < parentNode.nodeData)
            parentNode.leftNodeAddress = currentNode;
        else
            parentNode.rightNodeAddress = currentNode;
        handleReorient(ELEMENT);
    }

    private void handleReorient(final int ELEMENT) {
        currentNode.colorOfNode = RED;
        currentNode.leftNodeAddress.colorOfNode = BLACK;
        currentNode.rightNodeAddress.colorOfNode = BLACK;
        if (parentNode.colorOfNode == RED) {
            grandNode.colorOfNode = RED;
            if (ELEMENT < grandNode.nodeData != ELEMENT < parentNode.nodeData)
                parentNode = rotate(ELEMENT, grandNode);
            currentNode = rotate(ELEMENT, greatNode);
            currentNode.colorOfNode = BLACK;
        }
        HEADER_NODE.rightNodeAddress.colorOfNode = BLACK;
    }

    private Node rotate(final int ELEMENT, final Node PARENT_NODE) {
        if (ELEMENT < PARENT_NODE.nodeData)
            return PARENT_NODE.leftNodeAddress = ELEMENT < PARENT_NODE.leftNodeAddress.nodeData
                    ? rotateWithLeftNodeAddressChild(PARENT_NODE.leftNodeAddress)
                    : rotateWithRightNodeAddressChild(PARENT_NODE.leftNodeAddress);
        else
            return PARENT_NODE.rightNodeAddress = ELEMENT < PARENT_NODE.rightNodeAddress.nodeData
                    ? rotateWithLeftNodeAddressChild(PARENT_NODE.rightNodeAddress)
                    : rotateWithRightNodeAddressChild(PARENT_NODE.rightNodeAddress);
    }

    private Node rotateWithLeftNodeAddressChild(final Node CURRENT_NODE) {
        final Node LEFT_CHILD = CURRENT_NODE.leftNodeAddress;
        CURRENT_NODE.leftNodeAddress = LEFT_CHILD.rightNodeAddress;
        LEFT_CHILD.rightNodeAddress = CURRENT_NODE;
        return LEFT_CHILD;
    }

    private Node rotateWithRightNodeAddressChild(final Node CURRENT_NODE) {
        final Node RIGHT_CHILD = CURRENT_NODE.rightNodeAddress;
        CURRENT_NODE.rightNodeAddress = RIGHT_CHILD.leftNodeAddress;
        RIGHT_CHILD.leftNodeAddress = CURRENT_NODE;
        return RIGHT_CHILD;
    }

    int countOfNodes() {
        return countOfNodesRecursion(HEADER_NODE.rightNodeAddress);
    }

    private int countOfNodesRecursion(final Node NODE) {
        if (NODE == NULL_NODE)
            return 0;
        else {
            int countOfNodes = 1;
            countOfNodes += countOfNodesRecursion(NODE.leftNodeAddress);
            countOfNodes += countOfNodesRecursion(NODE.rightNodeAddress);
            return countOfNodes;
        }
    }

    boolean search(final int VALUE) {
        return search(HEADER_NODE.rightNodeAddress, VALUE);
    }

    private boolean search(Node currentNode, final int TARGET_VALUE) {
        boolean isFound = false;
        while (currentNode != NULL_NODE && !isFound) {
            final int NODE_VALUE = currentNode.nodeData;
            if (TARGET_VALUE < NODE_VALUE)
                currentNode = currentNode.leftNodeAddress;
            else if (TARGET_VALUE > NODE_VALUE)
                currentNode = currentNode.rightNodeAddress;
            else {
                isFound = true;
                break;
            }
            isFound = search(currentNode, TARGET_VALUE);
        }
        return isFound;
    }

    void inorder() {
        inorderRecursion(HEADER_NODE.rightNodeAddress);
    }

    private void inorderRecursion(final Node NODE) {
        if (NODE != NULL_NODE) {
            inorderRecursion(NODE.leftNodeAddress);
            char color = 'B';
            if (NODE.colorOfNode == 0)
                color = 'R';
            System.out.print(NODE.nodeData + "" + color + " ");
            inorderRecursion(NODE.rightNodeAddress);
        }
    }

    void preorder() {
        preorderRecursion(HEADER_NODE.rightNodeAddress);
    }

    private void preorderRecursion(final Node NODE) {
        if (NODE != NULL_NODE) {
            char color = 'B';
            if (NODE.colorOfNode == 0)
                color = 'R';
            System.out.print(NODE.nodeData + "" + color + " ");
            preorderRecursion(NODE.leftNodeAddress);
            preorderRecursion(NODE.rightNodeAddress);
        }
    }

    void postorder() {
        postorderRecursion(HEADER_NODE.rightNodeAddress);
    }

    private void postorderRecursion(final Node NODE) {
        if (NODE != NULL_NODE) {
            postorderRecursion(NODE.leftNodeAddress);
            postorderRecursion(NODE.rightNodeAddress);
            char color = 'B';
            if (NODE.colorOfNode == 0)
                color = 'R';
            System.out.print(NODE.nodeData + "" + color + " ");
        }
    }
}