package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_60_visitor_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_60_visitor_pattern.files <h2>Question</h2>
 */

enum Color {
    RED, GREEN
}

abstract class Tree {
    private final int VALUE;
    private final Color COLOR;
    private final int DEPTH;

    Tree(final int VALUE, final Color COLOR, final int DEPTH) {
        this.VALUE = VALUE;
        this.COLOR = COLOR;
        this.DEPTH = DEPTH;
    }

    int getValue() {
        return VALUE;
    }

    Color getColor() {
        return COLOR;
    }

    int getDepth() {
        return DEPTH;
    }

    abstract void accept(final TreeVisitor VISITOR);
}

class TreeNode extends Tree {
    private final ArrayList<Tree> CHILDREN = new ArrayList<>();

    TreeNode(final int VALUE, final Color COLOR, final int DEPTH) {
        super(VALUE, COLOR, DEPTH);
    }

    void accept(final TreeVisitor VISITOR) {
        VISITOR.visitNode(this);
        for (final Tree CHILD : CHILDREN)
            CHILD.accept(VISITOR);
    }

    void addChild(final Tree CHILD) {
        CHILDREN.add(CHILD);
    }
}

class TreeLeaf extends Tree {
    TreeLeaf(final int VALUE, final Color COLOR, final int DEPTH) {
        super(VALUE, COLOR, DEPTH);
    }

    void accept(final TreeVisitor VISITOR) {
        VISITOR.visitLeaf(this);
    }
}

abstract class TreeVisitor {
    abstract void visitNode(final TreeNode NODE);

    abstract void visitLeaf(final TreeLeaf LEAF);
}

class SumInLeavesVisitor extends TreeVisitor {
    int result = 0;

    int getResult() {
        return result;
    }

    void visitNode(final TreeNode NODE) {
    }

    void visitLeaf(final TreeLeaf LEAF) {
        result += LEAF.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVisitor {
    long result = 1;
    final int M = 1000000007;

    int getResult() {
        return (int) result;
    }

    void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED)
            result = (result * node.getValue()) % M;
    }

    void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED)
            result = (result * leaf.getValue()) % M;
    }
}

class FancyVisitor extends TreeVisitor {
    int even = 0;
    int green = 0;

    int getResult() {
        return Math.abs(even - green);
    }

    void visitNode(final TreeNode NODE) {
        if (NODE.getDepth() % 2 == 0)
            even += NODE.getValue();
    }

    void visitLeaf(final TreeLeaf LEAF) {
        if (LEAF.getColor() == Color.GREEN)
            green += LEAF.getValue();
    }
}

public class VisitorPattern {
    private static int[] values;
    private static Color[] colors;
    private static final Map<Integer, Set<Integer>> NODES_MAP = new HashMap<>();

    private static Tree solve() {
        final Scanner INPUT = new Scanner(System.in);
        final int NODES = INPUT.nextInt();
        values = new int[NODES];
        for (int index = 0; index < NODES; index++)
            values[index] = INPUT.nextInt();
        colors = new Color[NODES];
        for (int index = 0; index < NODES; index++)
            colors[index] = (INPUT.nextInt() == 0)
                    ? Color.RED
                    : Color.GREEN;
        final Tree ROOT_NODE;
        if (NODES == 1)
            ROOT_NODE = new TreeLeaf(
                    values[0],
                    colors[0],
                    0
            );
        else {
            ROOT_NODE = new TreeNode(
                    values[0],
                    colors[0],
                    0
            );
            for (int index = 0; index < (NODES - 1); index++) {
                final int PARENT_ID = INPUT.nextInt(),
                        CHILD_ID = INPUT.nextInt();
                Set<Integer> uEdges = NODES_MAP.get(PARENT_ID);
                if (uEdges == null)
                    uEdges = new HashSet<>();
                uEdges.add(CHILD_ID);
                NODES_MAP.put(PARENT_ID, uEdges);
                Set<Integer> vEdges = NODES_MAP.get(CHILD_ID);
                if (vEdges == null)
                    vEdges = new HashSet<>();
                vEdges.add(PARENT_ID);
                NODES_MAP.put(CHILD_ID, vEdges);
            }
            for (final int NODE_ID : NODES_MAP.get(1)) {
                NODES_MAP.get(NODE_ID).remove(1);
                createEdge(ROOT_NODE, NODE_ID);
            }
        }
        return ROOT_NODE;
    }

    private static void createEdge(final Tree PARENT, final int NODE_ID) {
        final Set<Integer> NODE_EDGES = NODES_MAP.get(NODE_ID);
        if (NODE_EDGES != null && !NODE_EDGES.isEmpty()) {
            final TreeNode NODE = new TreeNode(
                    values[NODE_ID - 1],
                    colors[NODE_ID - 1],
                    PARENT.getDepth() + 1
            );
            ((TreeNode) PARENT).addChild(NODE);
            for (final int NEIGHBORID : NODE_EDGES) {
                NODES_MAP.get(NEIGHBORID).remove(NODE_ID);
                createEdge(NODE, NEIGHBORID);
            }
        } else
            ((TreeNode) PARENT).addChild(new TreeLeaf(
                    values[NODE_ID - 1],
                    colors[NODE_ID - 1],
                    PARENT.getDepth() + 1
            ));
    }

    public static void main(final String[] PARAMETERS) {
        final Tree ROOT = solve();
        final SumInLeavesVisitor FIRST_VISITOR = new SumInLeavesVisitor();
        final ProductOfRedNodesVisitor SECOND_VISITOR = new ProductOfRedNodesVisitor();
        final FancyVisitor THIRD_VISITOR = new FancyVisitor();
        ROOT.accept(FIRST_VISITOR);
        ROOT.accept(SECOND_VISITOR);
        ROOT.accept(THIRD_VISITOR);
        System.out.println(FIRST_VISITOR.getResult());
        System.out.println(SECOND_VISITOR.getResult());
        System.out.print(THIRD_VISITOR.getResult());
    }
}