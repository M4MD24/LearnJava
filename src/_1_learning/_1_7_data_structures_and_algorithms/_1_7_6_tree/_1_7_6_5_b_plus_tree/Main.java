package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_5_b_plus_tree;

public class Main {
    public static void main(final String[] ARGS) {
        final BPlusTree ELEMENTS = new BPlusTree(3);
        ELEMENTS.insert(5, 33);
        ELEMENTS.insert(15, 21);
        ELEMENTS.insert(25, 31);
        ELEMENTS.insert(35, 41);
        ELEMENTS.insert(45, 10);
        System.out.println(ELEMENTS.search(15));
        System.out.print(ELEMENTS.isEmpty());
    }
}