package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_148_sort_list;

/**
 * <h1>Problem:</h1>
 * <h2>Given the head of a linked list, return the list after sorting it in ascending order.</h2>
 */

public class SortList {
    public static void main(final String[] ARGUMENTS) {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        head = quickSortList(head);
        printList(head);
    }

    private static ListNode quickSortList(final ListNode HEAD) {
        return quickSortListHelper(HEAD, null);
    }

    private static ListNode quickSortListHelper(final ListNode START, final ListNode END) {
        if (START == null || START.next == null || START == END)
            return START;
        else {
            ListNode left = START,
                    current = START.next,
                    right = START;
            boolean isSorted = true;
            while (current != null && current != END) {
                final ListNode TEMPORARY_ELEMENT = current.next;
                if (current.val < START.val) {
                    if (current.val > left.val)
                        isSorted = false;
                    current.next = left;
                    left = current;
                    right.next = TEMPORARY_ELEMENT;
                } else {
                    if (right.val > current.val)
                        isSorted = false;
                    right = current;
                }
                current = TEMPORARY_ELEMENT;
            }
            if (!isSorted) {
                left = quickSortListHelper(left, START);
                START.next = quickSortListHelper(START.next, END);
            }
            return left;
        }
    }

// >
    /*private static ListNode sortList(final ListNode HEAD) {
        if (HEAD == null || HEAD.next == null)
            return HEAD;
        else {
            final ListNode MIDDLE = getMiddle(HEAD),
                    RIGHT_HALF = MIDDLE.next;
            MIDDLE.next = null;
            final ListNode LEFT_SORTED = sortList(HEAD),
                    RIGHT_SORTED = sortList(RIGHT_HALF);
            return merge(LEFT_SORTED, RIGHT_SORTED);
        }
    }

    private static ListNode getMiddle(final ListNode HEAD) {
        ListNode slow = HEAD,
                fast = HEAD.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode merge(ListNode left, ListNode right) {
        ListNode newHead = new ListNode(0),
                copyOfNewHead = newHead;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                copyOfNewHead.next = left;
                left = left.next;
            } else {
                copyOfNewHead.next = right;
                right = right.next;
            }
            copyOfNewHead = copyOfNewHead.next;
        }
        copyOfNewHead.next = (left != null)
                ? left
                : right;
        return newHead.next;
    }*/

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}