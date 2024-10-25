package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_208_implement_trie_prefix_tree;

class Trie {
    private final Node ROOT;

    Trie() {
        ROOT = new Node();
    }

    void insert(final String WORD) {
        Node node = ROOT;
        for (int indexOfWord = 0; indexOfWord < WORD.length(); indexOfWord++) {
            final int INDEX_BY_CHARACTER = WORD.charAt(indexOfWord) - 'a';
            if (node.CHILDREN[INDEX_BY_CHARACTER] == null)
                node.CHILDREN[INDEX_BY_CHARACTER] = new Node();
            node = node.CHILDREN[INDEX_BY_CHARACTER];
        }
        node.isEndOfWord = true;
    }

    boolean search(final String WORD) {
        Node node = ROOT;
        for (int indexOfWord = 0; indexOfWord < WORD.length(); indexOfWord++) {
            final int INDEX_BY_CHARACTER = WORD.charAt(indexOfWord) - 'a';
            if (node.CHILDREN[INDEX_BY_CHARACTER] == null)
                return false;
            node = node.CHILDREN[INDEX_BY_CHARACTER];
        }
        return node.isEndOfWord;
    }

    boolean startsWith(final String PREFIX) {
        Node node = ROOT;
        for (int indexOfPrefix = 0; indexOfPrefix < PREFIX.length(); indexOfPrefix++) {
            final int INDEX_BY_CHARACTER = PREFIX.charAt(indexOfPrefix) - 'a';
            if (node.CHILDREN[INDEX_BY_CHARACTER] == null)
                return false;
            node = node.CHILDREN[INDEX_BY_CHARACTER];
        }
        return true;
    }
}