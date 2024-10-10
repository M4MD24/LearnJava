package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_19_remove_n_th_node_from_end_of_list;

/**
 * <h1>Problem:</h1>
 * <h2>Given the head of a linked list, remove the nth node from the end of the list and return its head.</h2>
 */

public class RemoveNthNodeFromEndOfList {
    public static void main(final String[] PARAMETERS) {
        final ListNode HEAD_NODE = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                3,
                                new ListNode(
                                        4,
                                        new ListNode(5)
                                )
                        )
                )
        );
        final int TARGET_NUMBER = 2;
        System.out.print(removeNthFromEnd(HEAD_NODE, TARGET_NUMBER));
    }

    private static ListNode removeNthFromEnd(ListNode headNode, final int TARGET_NUMBER) {
        final ListNode COPY_OF_HEAD = new ListNode(0, headNode);
        ListNode currentCopyOfHead = COPY_OF_HEAD;
        for (int index = 0; index < TARGET_NUMBER; index++)
            headNode = headNode.next;
        while (headNode != null) {
            headNode = headNode.next;
            currentCopyOfHead = currentCopyOfHead.next;
        }
        currentCopyOfHead.next = currentCopyOfHead.next.next;
        return COPY_OF_HEAD.next;
    }

// >
    /*private static ListNode removeNthFromEnd(final ListNode HEAD_NODE, final int TARGET_NUMBER) {
        if (HEAD_NODE.next == null)
            return null;
        else {
            final int LENGTH_OF_HEAD = getLengthOfHead(HEAD_NODE);
            ListNode copyOfHeadNode = new ListNode(0);
            copyOfHeadNode.next = HEAD_NODE;
            ListNode currentOfCopyOfHeadNode = copyOfHeadNode;
            for (int index = 0; index < LENGTH_OF_HEAD - TARGET_NUMBER - 1; index++)
                currentOfCopyOfHeadNode = currentOfCopyOfHeadNode.next;
            currentOfCopyOfHeadNode.next = currentOfCopyOfHeadNode.next.next;
            return copyOfHeadNode.next;
        }
    }

    private static int getLengthOfHead(final ListNode HEAD_NODE) {
        ListNode copyOfHeadNode = HEAD_NODE;
        int countOfNodes = 1;
        while (copyOfHeadNode != null) {
            copyOfHeadNode = copyOfHeadNode.next;
            countOfNodes++;
        }
        return countOfNodes;
    }*/
}