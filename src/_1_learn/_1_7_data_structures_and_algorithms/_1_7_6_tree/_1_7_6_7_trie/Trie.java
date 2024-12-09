package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_7_trie;

class Trie {
    private final Node ROOT = new Node();

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

    boolean delete(final String WORD) {
        return deleteHelper(ROOT, WORD, 0);
    }

    private boolean deleteHelper(final Node CURRENT_NODE, final String WORD, final int INDEX) {
        if (INDEX == WORD.length())
            if (!CURRENT_NODE.isEndOfWord)
                return false;
            else {
                CURRENT_NODE.isEndOfWord = false;
                return CURRENT_NODE.CHILDREN.length == 0;
            }
        else {
            final int CHILD_INDEX = WORD.charAt(INDEX) - 'a';
            final Node NODE = CURRENT_NODE.CHILDREN[CHILD_INDEX];
            if (NODE == null)
                return false;
            else {
                if (deleteHelper(NODE, WORD, INDEX + 1)) {
                    CURRENT_NODE.CHILDREN[CHILD_INDEX] = null;
                    return false;
                }
            }
            return false;
        }
    }

    void printElements() {
        printHelper(ROOT, "");
    }

    private void printHelper(final Node CURRENT_NODE, final String WORD) {
        if (CURRENT_NODE.isEndOfWord)
            System.out.println(WORD);
        for (int index = 0; index < CURRENT_NODE.CHILDREN.length; index++)
            if (CURRENT_NODE.CHILDREN[index] != null)
                printHelper(
                        CURRENT_NODE.CHILDREN[index],
                        WORD + (char) (index + 'a')
                );
    }
}