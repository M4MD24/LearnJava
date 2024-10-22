package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_92_reverse_linked_list_2;

/**
 * <h1>Problem:</h1>
 * <h2>Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.</h2>
 */

public class ReverseLinkedList2 {
    public static void main(final String[] PARAMETERS) {
        final ListNode LIST = new ListNode(1);
        LIST.next = new ListNode(2);
        LIST.next.next = new ListNode(3);
        LIST.next.next.next = new ListNode(4);
        LIST.next.next.next.next = new ListNode(5);
        System.out.print(reverseBetween(LIST, 2, 4));
    }

    private static ListNode reverseBetween(final ListNode HEAD_NODE, final int LEFT_INDEX, final int RIGHT_INDEX) {
        if (HEAD_NODE == null || LEFT_INDEX == RIGHT_INDEX)
            return HEAD_NODE;
        else {
            final ListNode COPY_OF_HEAD_NODE = new ListNode(0, HEAD_NODE);
            ListNode currentCopyNode = COPY_OF_HEAD_NODE;
            for (int index = 1; index < LEFT_INDEX; index++)
                currentCopyNode = currentCopyNode.next;
            final ListNode CURRENT_LEFT_NODE = currentCopyNode.next;
            ListNode nextNode;
            for (int index = 0; index < RIGHT_INDEX - LEFT_INDEX; index++) {
                nextNode = CURRENT_LEFT_NODE.next;
                CURRENT_LEFT_NODE.next = nextNode.next;
                nextNode.next = currentCopyNode.next;
                currentCopyNode.next = nextNode;
            }
            return COPY_OF_HEAD_NODE.next;
        }
    }
}