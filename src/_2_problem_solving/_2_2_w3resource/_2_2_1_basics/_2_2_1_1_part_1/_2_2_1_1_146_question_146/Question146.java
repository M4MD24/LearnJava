package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_146_question_146;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert an array of sorted items into a binary search tree. Maintain the minimal height of the tree.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 2
 * <br/>
 * 1
 * <br/>
 * 4
 * <br/>
 * 6
 * <br/>
 * 5
 * <br/>
 * 3
 * </h2>
 */

class Node {
    int data;
    Node left,
            right;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public void addAllOfSortedArray(final int[] SORTED_ARRAY) {
        int middleLength = SORTED_ARRAY.length / 2,
                index = (middleLength % 2 == 0) ? middleLength - 1 : middleLength,
                oldIndex = index,
                isMax = 0;
        while (isMax != 2) {
            if (index == SORTED_ARRAY.length - 1 || (isMax == 1 && index == oldIndex)) {
                isMax++;
                if (isMax != 2) add(SORTED_ARRAY[index]);
                index = 0;
            }
            if (isMax != 2) add(SORTED_ARRAY[index]);
            index++;
        }
    }

    public void add(int data) {
        root = addRecursion(root, data);
    }

    private Node addRecursion(Node root, int data) {
        if (root == null) root = new Node(data);
        else if (data < root.data) root.left = addRecursion(root.left, data);
        else if (data > root.data) root.right = addRecursion(root.right, data);
        return root;
    }

    public static void printTreePostOrder(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├─── " : "└─── ") + root.data);
            printTreePostOrder(root.left, prefix + (isLeft ? "│    " : "     "), true);
            printTreePostOrder(root.right, prefix + (isLeft ? "│    " : "     "), false);
        }
    }

    public void postorder() {
        postorderRecursion(root);
    }

    private void postorderRecursion(Node root) {
        if (root != null) {
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.println(root.data);
        }
    }
}

public class Question146 {
    private static final BinaryTree BINARY_TREE = new BinaryTree();

    public static void main(String[] args) {
        final int[] SORTED_ARRAY = {1, 2, 3, 4, 5, 6, 7};
        BINARY_TREE.addAllOfSortedArray(SORTED_ARRAY);
        BINARY_TREE.postorder();
        BinaryTree.printTreePostOrder(BINARY_TREE.root, "", true);
    }
}
/*
1
3
2
5
7
6
4
├─── 4
│    ├─── 2
│    │    ├─── 1
│    │    └─── 3
│    └─── 6
│        ├─── 5
│        └─── 7
4
2
1
3
6
5
7
*/