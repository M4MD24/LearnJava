package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_138_copy_list_with_random_pointer;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
 * <br/>
 * <br/>
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 * <br/>
 * <br/>
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
 * <br/>
 * <br/>
 * Return the head of the copied linked list.
 * <br/>
 * <br/>
 * The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 * </h2>
 * <br/>
 * <br/>
 * <ul>
 * <li>val: an integer representing Node.val</li>
 * <li>random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.</li>
 * </ul>
 * <br/>
 * <br/>
 * <h2>Your code will only be given the head of the original linked list.</h2>
 */

public class CopyListWithRandomPointer {
    public static void main(final String[] PARAMETERS) {
        final Node HEAD = new Node(7);
        HEAD.next = new Node(13);
        HEAD.next.next = new Node(11);
        HEAD.next.next.next = new Node(10);
        HEAD.next.next.next.next = new Node(1);

        HEAD.random = null;
        HEAD.next.random = HEAD;
        HEAD.next.next.random = HEAD.next.next.next.next;
        HEAD.next.next.next.random = HEAD.next.next;
        HEAD.next.next.next.next.random = HEAD;

        System.out.print(copyRandomList(HEAD));
    }

    private static Node copyRandomList(final Node HEAD) {
        if (HEAD == null)
            return null;
        else {
            for (Node copyOfHead = HEAD; copyOfHead != null; copyOfHead = copyOfHead.next.next) {
                final Node CURRENT_COPY_OF_HEAD = copyOfHead;
                copyOfHead.next = new Node(CURRENT_COPY_OF_HEAD.val) {{
                    next = CURRENT_COPY_OF_HEAD.next;
                }};
            }
            for (Node copyOfHead = HEAD; copyOfHead != null; copyOfHead = copyOfHead.next.next)
                copyOfHead.next.random = (copyOfHead.random != null)
                        ? copyOfHead.random.next
                        : null;
            final Node COPY_OF_HEAD = HEAD.next;
            for (Node copyOfHead = HEAD; copyOfHead != null; copyOfHead = copyOfHead.next) {
                final Node CURRENT_COPY_OF_HEAD = copyOfHead.next;
                copyOfHead.next = CURRENT_COPY_OF_HEAD.next;
                CURRENT_COPY_OF_HEAD.next = (copyOfHead.next != null) ? copyOfHead.next.next : null;
            }
            return COPY_OF_HEAD;
        }
    }
}