package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_5_b_plus_tree;

import java.util.Arrays;

class BPlusTree {
    final int ELEMENT;
    InternalNode root;
    LeafNode firstLeaf;

    BPlusTree(final int ELEMENT) {
        this.ELEMENT = ELEMENT;
    }

    private class Node {
        InternalNode parent;
    }

    private class InternalNode extends Node {
        final int MAXIMUM_DEGREE,
                MINIMUM_DEGREE;
        int degree;
        InternalNode leftSibling,
                rightSibling;
        final Integer[] KEYS_VALUES;
        final Node[] CHILD_POINTERS;

        private void appendChildPointer(final Node POINTER) {
            CHILD_POINTERS[degree++] = POINTER;
        }

        private int findIndexOfPointer(final Node POINTER) {
            for (int index = 0; index < CHILD_POINTERS.length; index++)
                if (CHILD_POINTERS[index] == POINTER)
                    return index;
            return -1;
        }

        private void insertChildPointer(final Node POINTER, final int CURRENT_INDEX) {
            for (int index = degree - 1; index >= CURRENT_INDEX; index--)
                CHILD_POINTERS[index + 1] = CHILD_POINTERS[index];
            CHILD_POINTERS[CURRENT_INDEX] = POINTER;
            degree++;
        }

        private boolean isOverfull() {
            return degree == MAXIMUM_DEGREE + 1;
        }

        private void removePointer(final int INDEX) {
            CHILD_POINTERS[INDEX] = null;
            degree--;
        }

        private InternalNode(final int MAXIMUM_DEGREE, final Integer[] KEYS_VALUES) {
            this.MAXIMUM_DEGREE = MAXIMUM_DEGREE;
            MINIMUM_DEGREE = (int) Math.ceil(MAXIMUM_DEGREE / 2.0);
            degree = 0;
            this.KEYS_VALUES = KEYS_VALUES;
            CHILD_POINTERS = new Node[this.MAXIMUM_DEGREE + 1];
        }

        private InternalNode(final int MAXIMUM_DEGREE, final Integer[] KEYS_VALUES, final Node[] POINTERS) {
            this.MAXIMUM_DEGREE = MAXIMUM_DEGREE;
            MINIMUM_DEGREE = (int) Math.ceil(MAXIMUM_DEGREE / 2.0);
            degree = linearNullSearch(POINTERS);
            this.KEYS_VALUES = KEYS_VALUES;
            CHILD_POINTERS = POINTERS;
        }
    }

    private class LeafNode extends Node {
        final int MAXIMUM_NUMBER_PAIRS,
                MINIMUM_NUMBERS_PAIRS;
        int numberPairs;
        LeafNode leftSibling,
                rightSibling;
        final DictionaryPair[] NODE_ENTRIES;

        private void delete(final int INDEX) {
            NODE_ENTRIES[INDEX] = null;
            numberPairs--;
        }

        private boolean insert(final DictionaryPair NODE_ENTRY) {
            if (isFull())
                return false;
            else {
                NODE_ENTRIES[numberPairs++] = NODE_ENTRY;
                Arrays.sort(NODE_ENTRIES, 0, numberPairs);
                return true;
            }
        }

        private boolean isFull() {
            return numberPairs == MAXIMUM_NUMBER_PAIRS;
        }

        private LeafNode(final int MAXIMUM_NUMBER_PAIRS, DictionaryPair NODE_ENTRY) {
            this.MAXIMUM_NUMBER_PAIRS = MAXIMUM_NUMBER_PAIRS - 1;
            MINIMUM_NUMBERS_PAIRS = (int) (Math.ceil((double) MAXIMUM_NUMBER_PAIRS / 2) - 1);
            NODE_ENTRIES = new DictionaryPair[MAXIMUM_NUMBER_PAIRS];
            numberPairs = 0;
            insert(NODE_ENTRY);
        }

        private LeafNode(final int MAXIMUM_NUMBER_PAIRS, final DictionaryPair[] NODE_ENTRIES, final InternalNode PARENT) {
            this.MAXIMUM_NUMBER_PAIRS = MAXIMUM_NUMBER_PAIRS - 1;
            MINIMUM_NUMBERS_PAIRS = (int) (Math.ceil((double) MAXIMUM_NUMBER_PAIRS / 2) - 1);
            this.NODE_ENTRIES = NODE_ENTRIES;
            numberPairs = linearNullSearch(NODE_ENTRIES);
            parent = PARENT;
        }
    }

    private record DictionaryPair(int key, double value) implements Comparable<DictionaryPair> {
        public int compareTo(final DictionaryPair NODE_ENTRY) {
            return Integer.compare(key, NODE_ENTRY.key);
        }
    }

    private int binarySearch(final DictionaryPair[] NODE_ENTRIES, final int NUMBER_PAIRS, final int KEY) {
        return Arrays.binarySearch(
                NODE_ENTRIES,
                0,
                NUMBER_PAIRS,
                new DictionaryPair(KEY, 0),
                (FIRST_ENTRY, SECOND_ENTRY) -> {
                    final Integer FIRST_KEY = FIRST_ENTRY.key,
                            SECOND_KEY = SECOND_ENTRY.key;
                    return FIRST_KEY.compareTo(SECOND_KEY);
                }
        );
    }

    private LeafNode findLeafNode(final int KEY) {
        final Integer[] KEYS_VALUES = root.KEYS_VALUES;
        int index = 0;
        while (index < root.degree - 1)
            if (KEY < KEYS_VALUES[index])
                break;
            else
                index++;
        final Node CHILD = root.CHILD_POINTERS[index];
        return (CHILD instanceof LeafNode)
                ? (LeafNode) CHILD
                : findLeafNode((InternalNode) CHILD, KEY);
    }

    private LeafNode findLeafNode(final InternalNode NODE, final int KEY) {
        final Integer[] KEYS_VALUES = NODE.KEYS_VALUES;
        int index = 0;
        while (index < NODE.degree - 1)
            if (KEY < KEYS_VALUES[index])
                break;
            else
                index++;
        final Node CHILD_NODE = NODE.CHILD_POINTERS[index];
        return CHILD_NODE instanceof LeafNode
                ? (LeafNode) CHILD_NODE
                : findLeafNode((InternalNode) NODE.CHILD_POINTERS[index], KEY);
    }

    private int getMidpoint() {
        return (int) Math.ceil((this.ELEMENT + 1) / 2.0) - 1;
    }

    boolean isEmpty() {
        return firstLeaf == null;
    }

    private int linearNullSearch(final DictionaryPair[] NODE_ENTRIES) {
        for (int index = 0; index < NODE_ENTRIES.length; index++)
            if (NODE_ENTRIES[index] == null)
                return index;
        return -1;
    }

    private int linearNullSearch(final Node[] POINTERS) {
        for (int index = 0; index < POINTERS.length; index++)
            if (POINTERS[index] == null)
                return index;
        return -1;
    }

    private void sortDictionary(final DictionaryPair[] NODE_ENTRIES) {
        Arrays.sort(NODE_ENTRIES, (FIRST_ENTRY, SECOND_ENTRY) -> {
            if (FIRST_ENTRY == null && SECOND_ENTRY == null)
                return 0;
            if (FIRST_ENTRY == null)
                return 1;
            if (SECOND_ENTRY == null)
                return -1;
            return FIRST_ENTRY.compareTo(SECOND_ENTRY);
        });
    }

    private Node[] splitChildPointers(final InternalNode INTERNAL_NODE, final int SPLIT) {
        final Node[] POINTERS = INTERNAL_NODE.CHILD_POINTERS,
                HALF_POINTERS = new Node[ELEMENT + 1];
        for (int index = SPLIT + 1; index < POINTERS.length; index++) {
            HALF_POINTERS[index - SPLIT - 1] = POINTERS[index];
            INTERNAL_NODE.removePointer(index);
        }
        return HALF_POINTERS;
    }

    private DictionaryPair[] splitDictionary(final LeafNode LEAF_NODE, final int SPLIT) {
        final DictionaryPair[] NODE_ENTRIES = LEAF_NODE.NODE_ENTRIES,
                HALF_NODE_ENTRIES = new DictionaryPair[ELEMENT];
        for (int index = SPLIT; index < NODE_ENTRIES.length; index++) {
            HALF_NODE_ENTRIES[index - SPLIT] = NODE_ENTRIES[index];
            LEAF_NODE.delete(index);
        }
        return HALF_NODE_ENTRIES;
    }

    private void splitInternalNode(final InternalNode INTERNAL_NODE) {
        final InternalNode PARENT = INTERNAL_NODE.parent;
        final int MIDDLE_POINT = getMidpoint(),
                NEW_PARENT_KEY = INTERNAL_NODE.KEYS_VALUES[MIDDLE_POINT];
        final Integer[] HALF_KEYS_VALUES = splitKeys(INTERNAL_NODE.KEYS_VALUES, MIDDLE_POINT);
        final Node[] HALF_POINTERS = splitChildPointers(INTERNAL_NODE, MIDDLE_POINT);
        INTERNAL_NODE.degree = linearNullSearch(INTERNAL_NODE.CHILD_POINTERS);
        InternalNode sibling = new InternalNode(ELEMENT, HALF_KEYS_VALUES, HALF_POINTERS);
        for (final Node POINTER : HALF_POINTERS)
            if (POINTER != null)
                POINTER.parent = sibling;
        sibling.rightSibling = INTERNAL_NODE.rightSibling;
        if (sibling.rightSibling != null)
            sibling.rightSibling.leftSibling = sibling;
        INTERNAL_NODE.rightSibling = sibling;
        sibling.leftSibling = INTERNAL_NODE;
        if (PARENT == null) {
            final Integer[] KEYS_VALUES = new Integer[this.ELEMENT];
            KEYS_VALUES[0] = NEW_PARENT_KEY;
            final InternalNode NEW_ROOT = new InternalNode(this.ELEMENT, KEYS_VALUES);
            NEW_ROOT.appendChildPointer(INTERNAL_NODE);
            NEW_ROOT.appendChildPointer(sibling);
            root = NEW_ROOT;
            INTERNAL_NODE.parent = NEW_ROOT;
            sibling.parent = NEW_ROOT;
        } else {
            PARENT.KEYS_VALUES[PARENT.degree - 1] = NEW_PARENT_KEY;
            Arrays.sort(PARENT.KEYS_VALUES, 0, PARENT.degree);
            final int POINTER_INDEX = PARENT.findIndexOfPointer(INTERNAL_NODE) + 1;
            PARENT.insertChildPointer(sibling, POINTER_INDEX);
            sibling.parent = PARENT;
        }
    }

    private Integer[] splitKeys(final Integer[] KEYS_VALUES, final int SPLIT) {
        final Integer[] HALF_KEYS_VALUES = new Integer[this.ELEMENT];
        KEYS_VALUES[SPLIT] = null;
        for (int index = SPLIT + 1; index < KEYS_VALUES.length; index++) {
            HALF_KEYS_VALUES[index - SPLIT - 1] = KEYS_VALUES[index];
            KEYS_VALUES[index] = null;
        }
        return HALF_KEYS_VALUES;
    }

    void insert(final int KEY, final double VALUE) {
        if (isEmpty())
            firstLeaf = new LeafNode(ELEMENT, new DictionaryPair(KEY, VALUE));
        else {
            final LeafNode LEAF_NODE = (root == null)
                    ? firstLeaf
                    : findLeafNode(KEY);
            if (!LEAF_NODE.insert(new DictionaryPair(KEY, VALUE))) {
                LEAF_NODE.NODE_ENTRIES[LEAF_NODE.numberPairs] = new DictionaryPair(KEY, VALUE);
                LEAF_NODE.numberPairs++;
                sortDictionary(LEAF_NODE.NODE_ENTRIES);
                final int MIDDLE_POINT = getMidpoint();
                final DictionaryPair[] HALF_NODE_ENTRIES = splitDictionary(LEAF_NODE, MIDDLE_POINT);
                if (LEAF_NODE.parent == null) {
                    Integer[] parent_keys = new Integer[ELEMENT];
                    parent_keys[0] = HALF_NODE_ENTRIES[0].key;
                    InternalNode parent = new InternalNode(ELEMENT, parent_keys);
                    LEAF_NODE.parent = parent;
                    parent.appendChildPointer(LEAF_NODE);
                } else {
                    final int NEW_PARENT_KEY = HALF_NODE_ENTRIES[0].key;
                    LEAF_NODE.parent.KEYS_VALUES[LEAF_NODE.parent.degree - 1] = NEW_PARENT_KEY;
                    Arrays.sort(LEAF_NODE.parent.KEYS_VALUES, 0, LEAF_NODE.parent.degree);
                }
                final LeafNode NEW_LEAF_NODE = new LeafNode(ELEMENT, HALF_NODE_ENTRIES, LEAF_NODE.parent);
                final int POINTER_INDEX = LEAF_NODE.parent.findIndexOfPointer(LEAF_NODE) + 1;
                LEAF_NODE.parent.insertChildPointer(NEW_LEAF_NODE, POINTER_INDEX);
                NEW_LEAF_NODE.rightSibling = LEAF_NODE.rightSibling;
                if (NEW_LEAF_NODE.rightSibling != null)
                    NEW_LEAF_NODE.rightSibling.leftSibling = NEW_LEAF_NODE;
                LEAF_NODE.rightSibling = NEW_LEAF_NODE;
                NEW_LEAF_NODE.leftSibling = LEAF_NODE;
                if (root == null)
                    root = LEAF_NODE.parent;
                else {
                    InternalNode internalNode = LEAF_NODE.parent;
                    while (internalNode != null) {
                        if (internalNode.isOverfull())
                            splitInternalNode(internalNode);
                        else
                            break;
                        internalNode = internalNode.parent;
                    }
                }
            }
        }
    }

    Double search(final int KEY) {
        if (isEmpty())
            return null;
        final LeafNode LEAF_NODE = (root == null)
                ? firstLeaf
                : findLeafNode(KEY);
        final DictionaryPair[] NODE_ENTRIES = LEAF_NODE.NODE_ENTRIES;
        final int INDEX = binarySearch(NODE_ENTRIES, LEAF_NODE.numberPairs, KEY);
        return (INDEX < 0)
                ? null
                : NODE_ENTRIES[INDEX].value;
    }
}