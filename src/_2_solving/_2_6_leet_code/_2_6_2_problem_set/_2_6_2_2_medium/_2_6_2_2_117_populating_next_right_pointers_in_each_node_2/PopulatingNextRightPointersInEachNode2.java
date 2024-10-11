package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_117_populating_next_right_pointers_in_each_node_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * <br/>
 * <br/>
 * Initially, all next pointers are set to NULL.
 * </h2>
 */

public class PopulatingNextRightPointersInEachNode2 {
    public static void main(final String[] PARAMETERS) {
        final Node ROOT = new Node(
                1,
                new Node(
                        2,
                        new Node(4),
                        new Node(5),
                        null
                ),
                new Node(
                        3,
                        null,
                        new Node(7),
                        null
                ),
                null);
        System.out.println(connect(ROOT));
    }

    private static Node connect(final Node ROOT) {
        Node copyOfRoot = ROOT;
        while (copyOfRoot != null) {
            final Node NEW_NODE = new Node();
            for (Node needle = NEW_NODE; copyOfRoot != null; copyOfRoot = copyOfRoot.next) {
                if (copyOfRoot.left != null)
                    needle = needle.next = copyOfRoot.left;
                if (copyOfRoot.right != null)
                    needle = needle.next = copyOfRoot.right;
            }
            copyOfRoot = NEW_NODE.next;
        }
        return ROOT;
    }
}