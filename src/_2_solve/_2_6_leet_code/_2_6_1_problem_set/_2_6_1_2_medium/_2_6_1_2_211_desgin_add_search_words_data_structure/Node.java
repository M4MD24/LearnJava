package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_211_desgin_add_search_words_data_structure;

class Node {
    final Node[] CHILDREN;
    boolean isEndOfWord;

    public Node() {
        CHILDREN = new Node[26];
        isEndOfWord = false;
    }
}