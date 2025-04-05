package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

class BinaryTree<Type extends Comparable<Type>> {
    private Node<Type> root;
    private int size = 0;

    void insert(final Type DATA) {
        root = insertRecursion(root, DATA);
        size++;
    }

    private Node<Type> insertRecursion(Node<Type> root, Type data) {
        if (root == null)
            root = new Node<>(data);
        else {
            if (root.left == null)
                root.left = new Node<>(data);
            else if (root.right == null)
                root.right = new Node<>(data);
            else
                root.left = insertRecursion(root.left, data);
        }
        return root;
    }

    void inorder() {
        if (!isEmpty())
            inorderRecursion(root);
        else
            System.out.print("Nothing to see!");
    }

    private void inorderRecursion(Node<Type> root) {
        if (root != null) {
            inorderRecursion(root.left);
            System.out.print(root.data + " ");
            inorderRecursion(root.right);
        }
    }

    void preorder() {
        if (!isEmpty())
            preorderRecursion(root);
        else
            System.out.print("Nothing to see!");
    }

    private void preorderRecursion(Node<Type> root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursion(root.left);
            preorderRecursion(root.right);
        }
    }

    void postorder() {
        if (!isEmpty())
            postorderRecursion(root);
        else
            System.out.print("Nothing to see!");
    }

    private void postorderRecursion(Node<Type> root) {
        if (root != null) {
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.print(root.data + " ");
        }
    }

    int maximumDepth() {
        return maximumDepthRecursion(root);
    }

    private int maximumDepthRecursion(Node<Type> root) {
        if (root == null) return 0;
        int leftDepth = maximumDepthRecursion(root.left),
                rightDepth = maximumDepthRecursion(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    int minimumDepth() {
        return minimumDepthRecursion(root);
    }

    private int minimumDepthRecursion(Node<Type> root) {
        if (root == null) return 0;
        int leftDepth = maximumDepthRecursion(root.left),
                rightDepth = maximumDepthRecursion(root.right);
        return Math.min(leftDepth, rightDepth) + 1;
    }

    void printTreePreorder(final String PREFIX, final boolean IS_LEFT) {
        if (!isEmpty())
            printTreePreorderRecursion(root, PREFIX, IS_LEFT);
        else
            System.out.print("Nothing to see!");
    }

    private void printTreePreorderRecursion(Node<Type> root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + "└─── " + root.data);
            printTreePreorderRecursion(root.left, prefix + (isLeft ? "│    " : "     "), true);
            printTreePreorderRecursion(root.right, prefix + (isLeft ? "│    " : "     "), false);
        }
    }

    boolean areSameTrees(BinaryTree<Type> anotherTree) {
        return areSameTreesRecursion(root, anotherTree.root);
    }

    private boolean areSameTreesRecursion(Node<Type> current, Node<Type> another) {
        if (current == null && another == null) return true;

        if (current != null && another != null)
            return (current.data == another.data)
                    && areSameTreesRecursion(current.left, another.left)
                    && areSameTreesRecursion(current.right, another.right);

        return false;
    }

    boolean isSubTree(BinaryTree<Type> sub) {
        return isSubTree(root, sub.root);
    }

    private boolean isSubTree(Node<Type> current, Node<Type> sub) {
        if (sub == null) return false;
        if (areSameTreesRecursion(current, sub)) return true;
        return isSubTree(current, sub.left) || isSubTree(current, sub.right);
    }

    boolean isPerfectBinaryTree() {
        return root != null && isPerfectBinaryTreeRecursion(root, maximumDepth(), 0);
    }

    private boolean isPerfectBinaryTreeRecursion(final Node<Type> ROOT, final int DEPTH, final int CURRENT_LEVEL) {
        if (ROOT == null)
            return true;
        if (ROOT.left == null && ROOT.right == null)
            return DEPTH == CURRENT_LEVEL + 1;
        if (ROOT.left == null || ROOT.right == null)
            return false;
        return isPerfectBinaryTreeRecursion(ROOT.left, DEPTH, CURRENT_LEVEL + 1) && isPerfectBinaryTreeRecursion(ROOT.right, DEPTH, CURRENT_LEVEL + 1);
    }

    void clearAll() {
        root = null;
        size = 0;
    }

    boolean isEmpty() {
        return root == null;
    }

    boolean isFullBinaryTree() {
        return isFullBinaryTreeRecursion(root);
    }

    private boolean isFullBinaryTreeRecursion(final Node<Type> ROOT) {
        if (ROOT == null)
            return true;
        if (ROOT.left == null && ROOT.right == null)
            return true;
        if (ROOT.left != null && ROOT.right != null)
            return (isFullBinaryTreeRecursion(ROOT.left) && isFullBinaryTreeRecursion(ROOT.right));
        return false;
    }

    int getSize() {
        return size;
    }

    boolean isCompleteBinaryTree() {
        return root != null && isCompleteBinaryTreeRecursion(root, 0);
    }

    private boolean isCompleteBinaryTreeRecursion(final Node<Type> ROOT, final int INDEX) {
        if (ROOT == null)
            return true;
        if (INDEX >= size)
            return false;
        return (isCompleteBinaryTreeRecursion(ROOT.left, 2 * INDEX + 1)
                && isCompleteBinaryTreeRecursion(ROOT.right, 2 * INDEX + 2));
    }

    boolean isBalancedBinaryTree() {
        return isBalancedBinaryTreeRecursion(root);
    }

    private boolean isBalancedBinaryTreeRecursion(final Node<Type> ROOT) {
        if (ROOT == null)
            return true;
        final int HEIGHT_OF_LEFT_SUBTREE = getHeightOfDepth(ROOT.left),
                HEIGHT_OF_RIGHT_SUBTREE = getHeightOfDepth(ROOT.right);
        return Math.abs(HEIGHT_OF_LEFT_SUBTREE - HEIGHT_OF_RIGHT_SUBTREE) <= 1
                && isBalancedBinaryTreeRecursion(ROOT.left)
                && isBalancedBinaryTreeRecursion(ROOT.right);
    }

    int getHeightOfDepth(final Node<Type> NODE) {
        return NODE == null
                ? 0
                : 1 + Math.max(
                getHeightOfDepth(NODE.left),
                getHeightOfDepth(NODE.right));
    }

    boolean isDegenerateBinaryTree() {
        return isDegenerateBinaryTreeRecursion(root, false, false);
    }

    /* √ Degenerate = Pathological */
    private boolean isDegenerateBinaryTreeRecursion(final Node<Type> ROOT, final boolean TOOK_LEFT_PATH, final boolean TOOK_RIGHT_PATH) {
        if (ROOT.left != null) {
            if (ROOT.right != null)
                return false;
            else
                return isDegenerateBinaryTreeRecursion(ROOT.left, true, TOOK_RIGHT_PATH);
        } else {
            if (ROOT.right != null)
                return isDegenerateBinaryTreeRecursion(ROOT.right, TOOK_LEFT_PATH, true);
            else
                return TOOK_LEFT_PATH && TOOK_RIGHT_PATH;
        }
    }

    boolean isLeftSkewedBinaryTree() {
        return isLeftSkewedBinaryTreeRecursion(root, false, false);
    }

    private boolean isLeftSkewedBinaryTreeRecursion(final Node<Type> ROOT, final boolean TOOK_LEFT_PATH, final boolean TOOK_RIGHT_PATH) {
        if (ROOT.left != null) {
            if (ROOT.right != null)
                return false;
            else
                return isLeftSkewedBinaryTreeRecursion(ROOT.left, true, TOOK_RIGHT_PATH);
        } else {
            if (ROOT.right != null)
                return isLeftSkewedBinaryTreeRecursion(ROOT.right, TOOK_LEFT_PATH, true);
            else
                return TOOK_LEFT_PATH && !TOOK_RIGHT_PATH;
        }
    }

    boolean isRightSkewedBinaryTree() {
        return isRightSkewedBinaryTreeRecursion(root, false, false);
    }

    private boolean isRightSkewedBinaryTreeRecursion(final Node<Type> ROOT, final boolean TOOK_LEFT_PATH, final boolean TOOK_RIGHT_PATH) {
        if (ROOT.left != null) {
            if (ROOT.right != null)
                return false;
            else
                return isRightSkewedBinaryTreeRecursion(ROOT.left, true, TOOK_RIGHT_PATH);
        } else {
            if (ROOT.right != null)
                return isRightSkewedBinaryTreeRecursion(ROOT.right, TOOK_LEFT_PATH, true);
            else
                return !TOOK_LEFT_PATH && TOOK_RIGHT_PATH;
        }
    }

    boolean isSymmetric() {
        return root == null || isMirror(root.left, root.right);
    }

    private boolean isMirror(final Node<Type> FIRST_BRANCH, final Node<Type> SECOND_BRANCH) {
        return FIRST_BRANCH == null &&
                SECOND_BRANCH == null ||
                FIRST_BRANCH != null &&
                        SECOND_BRANCH != null &&
                        FIRST_BRANCH.data == SECOND_BRANCH.data &&
                        isMirror(FIRST_BRANCH.left, SECOND_BRANCH.right) &&
                        isMirror(FIRST_BRANCH.right, SECOND_BRANCH.left);
    }
}