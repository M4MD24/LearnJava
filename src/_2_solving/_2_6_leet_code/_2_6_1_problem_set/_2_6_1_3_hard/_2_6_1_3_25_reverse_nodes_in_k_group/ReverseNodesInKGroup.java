package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_25_reverse_nodes_in_k_group;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * <br/>
 * <br/>
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * <br/>
 * <br/>
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 * </h2>
 */

public class ReverseNodesInKGroup {
    public static void main(final String[] PARAMETERS) {
        final ListNode HEAD_NODE = new ListNode(1);
        HEAD_NODE.next = new ListNode(2);
        HEAD_NODE.next.next = new ListNode(3);
        HEAD_NODE.next.next.next = new ListNode(4);
        HEAD_NODE.next.next.next.next = new ListNode(5);
        final int GROUP_SIZE = 3;
        reverseKGroup(HEAD_NODE, GROUP_SIZE);
    }

    private static ListNode reverseKGroup(ListNode headOfList, int groupSize) {
        ListNode copyOfHeadNode = headOfList;
        for (int count = 0; count < groupSize; count++) {
            if (copyOfHeadNode == null)
                return headOfList;
            copyOfHeadNode = copyOfHeadNode.next;
        }
        ListNode previousNode = reverseKGroup(copyOfHeadNode, groupSize);
        while (groupSize-- > 0) {
            ListNode nextNode = headOfList.next;
            headOfList.next = previousNode;
            previousNode = headOfList;
            headOfList = nextNode;
        }
        return previousNode;
    }
}