package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_82_remove_duplicates_from_sorted_list_2;

/**
 * <h1>Problem:</h1>
 * <h2>Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.</h2>
 */

public class RemoveDuplicatesFromSortedList2 {
    public static void main(final String[] PARAMETERS) {
        final ListNode HEAD_NODE = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                3,
                                new ListNode(
                                        3,
                                        new ListNode(
                                                4,
                                                new ListNode(
                                                        4,
                                                        new ListNode(5)
                                                )
                                        )
                                )
                        )
                )
        );
        System.out.print(deleteDuplicates(HEAD_NODE));
    }

    private static ListNode deleteDuplicates(ListNode head) {
        final ListNode COPY_OF_HEAD = new ListNode(0, head);
        ListNode previousNode = COPY_OF_HEAD;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val)
                    head = head.next;
                previousNode.next = head.next;
            } else
                previousNode = previousNode.next;
            head = head.next;
        }
        return COPY_OF_HEAD.next;
    }
}