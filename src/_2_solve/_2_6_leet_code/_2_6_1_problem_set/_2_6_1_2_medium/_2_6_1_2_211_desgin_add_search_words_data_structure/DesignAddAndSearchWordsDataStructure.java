package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_211_desgin_add_search_words_data_structure;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 * <br/>
 * <br/>
 * Implement the WordDictionary class:
 * </h2>
 * <ul>
 *     <li>WordDictionary() Initializes the object.</li>
 *     <li>void addWord(word) Adds word to the data structure, it can be matched later.</li>
 *     <li>bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.</li>
 * </ul>
 */

public class DesignAddAndSearchWordsDataStructure {
    public static void main(final String[] ARGUMENTS) {
        DesignAddAndSearchWordsDataStructure wordDictionary = new DesignAddAndSearchWordsDataStructure();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad"));
        System.out.println(wordDictionary.search("bad"));
        System.out.println(wordDictionary.search(".ad"));
        System.out.print(wordDictionary.search("b.."));
    }

    private final Node ROOT = new Node();

    private DesignAddAndSearchWordsDataStructure() {
        System.gc();
    }

    private void addWord(final String WORD) {
        Node node = ROOT;
        for (int indexOfWord = 0; indexOfWord < WORD.length(); indexOfWord++) {
            final int INDEX_BY_CHARACTER = WORD.charAt(indexOfWord) - 'a';
            if (node.CHILDREN[INDEX_BY_CHARACTER] == null)
                node.CHILDREN[INDEX_BY_CHARACTER] = new Node();
            node = node.CHILDREN[INDEX_BY_CHARACTER];
        }
        node.isEndOfWord = true;
    }

    private boolean search(final String WORD) {
        return WORD.contains(".")
                ? searchHelperWithDotes(WORD, 0, ROOT)
                : searchHelper(WORD);
    }

    private boolean searchHelperWithDotes(final String WORD, final int INDEX, final Node NODE) {
        if (INDEX == WORD.length())
            return NODE.isEndOfWord;
        else {
            final char CURRENT_CHARACTER = WORD.charAt(INDEX);
            if (CURRENT_CHARACTER == '.') {
                for (Node child : NODE.CHILDREN)
                    if (child != null && searchHelperWithDotes(WORD, INDEX + 1, child))
                        return true;
                return false;
            } else {
                final Node CHILD_NODE = NODE.CHILDREN[CURRENT_CHARACTER - 'a'];
                return CHILD_NODE != null && searchHelperWithDotes(WORD, INDEX + 1, CHILD_NODE);
            }
        }
    }

    private boolean searchHelper(final String WORD) {
        Node node = ROOT;
        for (int indexOfWord = 0; indexOfWord < WORD.length(); indexOfWord++) {
            final int INDEX_BY_CHARACTER = WORD.charAt(indexOfWord) - 'a';
            if (node.CHILDREN[INDEX_BY_CHARACTER] == null)
                return false;
            node = node.CHILDREN[INDEX_BY_CHARACTER];
        }
        return node.isEndOfWord;
    }
}