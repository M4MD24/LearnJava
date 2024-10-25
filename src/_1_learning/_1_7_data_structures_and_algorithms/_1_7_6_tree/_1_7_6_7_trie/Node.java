package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_7_trie;

class Node {
    final Node[] CHILDREN;
    boolean isEndOfWord;

    public Node() {
        CHILDREN = new Node[26];
        isEndOfWord = false;
    }
}