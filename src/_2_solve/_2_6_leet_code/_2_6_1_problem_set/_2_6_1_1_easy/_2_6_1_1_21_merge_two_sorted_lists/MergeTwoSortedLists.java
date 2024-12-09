package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_21_merge_two_sorted_lists;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given the heads of two sorted linked lists list1 and list2.
 * <br/>
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <br/>
 * Return the head of the merged linked list.
 * </h2>
 */

public class MergeTwoSortedLists {
    public static void main(final String[] PARAMETERS) {
        final ListNode FIRST_LIST = new ListNode(1);
        FIRST_LIST.next = new ListNode(2);
        FIRST_LIST.next.next = new ListNode(4);

        final ListNode SECOND_LIST = new ListNode(1);
        SECOND_LIST.next = new ListNode(3);
        SECOND_LIST.next.next = new ListNode(6);

        System.out.print(mergeTwoLists(FIRST_LIST, SECOND_LIST));
    }

    private static ListNode mergeTwoLists(final ListNode FIRST_LIST, final ListNode SECOND_LIST) {
        return FIRST_LIST == null
                ? SECOND_LIST
                : SECOND_LIST == null
                ? FIRST_LIST
                : FIRST_LIST.val < SECOND_LIST.val
                ? new ListNode(FIRST_LIST.val, mergeTwoLists(FIRST_LIST.next, SECOND_LIST))
                : new ListNode(SECOND_LIST.val, mergeTwoLists(FIRST_LIST, SECOND_LIST.next));
    }
}