package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_208_implement_trie_prefix_tree;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
 * <br/>
 * Implement the Trie class:
 * </h2>
 * <ul>
 *     <li>Trie() Initializes the trie object.</li>
 *     <li>void insert(String word) Inserts the string word into the trie.</li>
 *     <li>boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.</li>
 *     <li>boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.</li>
 * </ul>
 */

public class Implement_Trie_Prefix_Tree {
    public static void main(final String[] ARGUMENTS) {
        final Trie TRIE = new Trie();
        TRIE.insert("apple");
        System.out.println(TRIE.search("apple"));
        System.out.println(TRIE.search("app"));
        System.out.println(TRIE.startsWith("app"));
        TRIE.insert("app");
        TRIE.search("app");
    }
}