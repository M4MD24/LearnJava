package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_3_avl_tree;

class AVLTree {
    private Node root;

    void clearAllElements() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void insertElement(final int ELEMENT) {
        root = insertElementRecursion(ELEMENT, root);
    }

    private Node insertElementRecursion(final int ELEMENT, Node node) {
        if (node == null)
            node = new Node(ELEMENT);
        else if (ELEMENT < node.VALUE) {
            node.left = insertElementRecursion(ELEMENT, node.left);
            if (getHeight(node.left) - getHeight(node.right) == 2)
                if (ELEMENT < node.left.VALUE)
                    node = rotateWithLeftSubtree(node);
                else
                    node = doubleWithLeftSubtree(node);
        } else if (ELEMENT > node.VALUE) {
            node.right = insertElementRecursion(ELEMENT, node.right);
            if (getHeight(node.right) - getHeight(node.left) == 2)
                if (ELEMENT > node.right.VALUE)
                    node = rotateWithRightSubtree(node);
                else
                    node = doubleWithRightSubtree(node);
        }
        node.heightOfDepth = getMaxHeight(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    private int getHeight(final Node NODE) {
        return NODE == null
                ? -1
                : NODE.heightOfDepth;
    }

    private int getMaxHeight(final int LEFT_SUBTREE_HEIGHT, final int RIGHT_SUBTREE_HEIGHT) {
        return Math.max(LEFT_SUBTREE_HEIGHT, RIGHT_SUBTREE_HEIGHT);
    }

    private Node rotateWithLeftSubtree(final Node NODE_2) {
        final Node NODE_1 = NODE_2.left;
        NODE_2.left = NODE_1.right;
        NODE_1.right = NODE_2;
        NODE_2.heightOfDepth = getMaxHeight(getHeight(NODE_2.left), getHeight(NODE_2.right)) + 1;
        NODE_1.heightOfDepth = getMaxHeight(getHeight(NODE_1.left), NODE_2.heightOfDepth) + 1;
        return NODE_1;
    }

    private Node rotateWithRightSubtree(final Node NODE_1) {
        final Node NODE_2 = NODE_1.right;
        NODE_1.right = NODE_2.left;
        NODE_2.left = NODE_1;
        NODE_1.heightOfDepth = getMaxHeight(getHeight(NODE_1.left), getHeight(NODE_1.right)) + 1;
        NODE_2.heightOfDepth = getMaxHeight(getHeight(NODE_2.right), NODE_1.heightOfDepth) + 1;
        return NODE_2;
    }

    private Node doubleWithLeftSubtree(final Node NODE_3) {
        NODE_3.left = rotateWithRightSubtree(NODE_3.left);
        return rotateWithLeftSubtree(NODE_3);
    }

    private Node doubleWithRightSubtree(final Node NODE_1) {
        NODE_1.right = rotateWithLeftSubtree(NODE_1.right);
        return rotateWithRightSubtree(NODE_1);
    }

    int getTotalNumberOfNodes() {
        return getTotalNumberOfNodes(root);
    }

    private int getTotalNumberOfNodes(final Node HEAD) {
        if (HEAD == null)
            return 0;
        else {
            int length = 1;
            length = length + getTotalNumberOfNodes(HEAD.left);
            length = length + getTotalNumberOfNodes(HEAD.right);
            return length;
        }
    }

    boolean searchElement(final int ELEMENT) {
        return searchElementRecursion(root, ELEMENT);
    }

    private boolean searchElementRecursion(Node root, final int ELEMENT) {
        boolean check = false;
        while ((root != null) && !check) {
            final int HEAD_ELEMENT = root.VALUE;
            if (ELEMENT < HEAD_ELEMENT)
                root = root.left;
            else if (ELEMENT > HEAD_ELEMENT)
                root = root.right;
            else {
                check = true;
                break;
            }
            check = searchElementRecursion(root, ELEMENT);
        }
        return check;
    }

    void inorderTraversal() {
        if (root == null)
            System.out.print("Nothing to show!");
        else
            inorderTraversalRecursion(root);
    }

    private void inorderTraversalRecursion(final Node HEAD) {
        if (HEAD != null) {
            inorderTraversalRecursion(HEAD.left);
            System.out.print(HEAD.VALUE + " ");
            inorderTraversalRecursion(HEAD.right);
        }
    }

    void preorderTraversal() {
        if (root == null)
            System.out.print("Nothing to show!");
        else
            preorderTraversalRecursion(root);
    }

    private void preorderTraversalRecursion(final Node HEAD) {
        if (HEAD != null) {
            System.out.print(HEAD.VALUE + " ");
            preorderTraversalRecursion(HEAD.left);
            preorderTraversalRecursion(HEAD.right);
        }
    }

    void postorderTraversal() {
        if (root == null)
            System.out.print("Nothing to show!");
        else
            postorderTraversalRecursion(root);
    }

    private void postorderTraversalRecursion(final Node HEAD) {
        if (HEAD != null) {
            postorderTraversalRecursion(HEAD.left);
            postorderTraversalRecursion(HEAD.right);
            System.out.print(HEAD.VALUE + " ");
        }
    }
}