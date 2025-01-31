package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_83_remove_duplicates_from_sorted_list;

/**
 * <h1>Problem:</h1>
 * <h2>Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.</h2>
 */

public class RemoveDuplicatesFromSortedList {
    public static void main(final String[] ARGUMENTS) {
        final ListNode HEAD = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.print(deleteDuplicates(HEAD));
    }

    private static ListNode deleteDuplicates(final ListNode HEAD) {
        ListNode copyOfHead = HEAD;
        while (copyOfHead != null && copyOfHead.next != null)
            if (copyOfHead.val == copyOfHead.next.val)
                copyOfHead.next = copyOfHead.next.next;
            else
                copyOfHead = copyOfHead.next;
        return HEAD;
    }
}