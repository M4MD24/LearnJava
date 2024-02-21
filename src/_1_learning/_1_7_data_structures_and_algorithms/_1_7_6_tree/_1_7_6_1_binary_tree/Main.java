package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Character> binaryTree = new BinaryTree<>();
        binaryTree.insert('a');
        binaryTree.insert('d');
        binaryTree.insert('b');
        binaryTree.insert('e');
        binaryTree.insert('c');
        binaryTree.insert('f');
        binaryTree.insert('z');
        binaryTree.inorder();
        System.out.println();
        binaryTree.preorder();
    }
}
/*
         a
          \
           d
          / \
         b   e
          \   \
           c   f
                \
                 z
type: Unbalanced binary tree*/