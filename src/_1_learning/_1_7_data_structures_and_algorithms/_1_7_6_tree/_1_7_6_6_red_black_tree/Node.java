package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_6_red_black_tree;

class Node {
    Node leftNodeAddress, rightNodeAddress;
    int nodeData,
            colorOfNode;

    Node(final int NODE_DATA) {
        this(NODE_DATA, null, null);
    }

    Node(final int NODE_DATA, final Node LEFT_NODE_ADDRESS, final Node RIGHT_NODE_ADDRESS) {
        leftNodeAddress = LEFT_NODE_ADDRESS;
        rightNodeAddress = RIGHT_NODE_ADDRESS;
        nodeData = NODE_DATA;
        colorOfNode = 1;
    }
}