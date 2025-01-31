package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_141_linked_list_cycle;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <br/>
 * <br/>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * <br/>
 * <br/>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * </h2>
 */

public class LinkedListCycle {
    public static void main(final String[] ARGUMENTS) {
        final ListNode HEAD = new ListNode(3);
        HEAD.next = new ListNode(2);
        HEAD.next.next = new ListNode(0);
        HEAD.next.next.next = new ListNode(-4);
        System.out.print(hasCycle(HEAD));
    }

    private static boolean hasCycle(final ListNode HEAD) {
        ListNode slow = HEAD,
                fast = HEAD;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}