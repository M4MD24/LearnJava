package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_427_construct_quad_tree;

class Node {
    boolean val;
    boolean isLeaf;
    Node topLeft;
    Node topRight;
    Node bottomLeft;
    Node bottomRight;

    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(
            final boolean VALUE,
            final boolean IS_LEAF
    ) {
        this.val = VALUE;
        this.isLeaf = IS_LEAF;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(
            final boolean VALUE,
            final boolean IS_LEAF,
            final Node TOP_LEFT,
            final Node TOP_RIGHT,
            final Node BOTTOM_LEFT,
            final Node BOTTOM_RIGHT
    ) {
        this.val = VALUE;
        this.isLeaf = IS_LEAF;
        this.topLeft = TOP_LEFT;
        this.topRight = TOP_RIGHT;
        this.bottomLeft = BOTTOM_LEFT;
        this.bottomRight = BOTTOM_RIGHT;
    }
}