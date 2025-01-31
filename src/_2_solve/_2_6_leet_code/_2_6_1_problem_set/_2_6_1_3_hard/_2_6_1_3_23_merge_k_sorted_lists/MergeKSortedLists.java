package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_23_merge_k_sorted_lists;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <br/>
 * <br/>
 * Merge all the linked-lists into one sorted linked-list and return it.
 * </h2>
 */

public class MergeKSortedLists {
    public static void main(final String[] ARGUMENTS) {
        final ListNode[] NODES_LIST = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6)),
        };
        final ListNode MERGED_NODES_LIST = mergeKLists(NODES_LIST);
        printElements(MERGED_NODES_LIST);
        System.out.println();
        printElements(MERGED_NODES_LIST);
    }

    private static void printElements(final ListNode HEAD) {
        ListNode copyOfHead = HEAD;
        while (copyOfHead != null) {
            System.out.print(copyOfHead.val + " ");
            copyOfHead = copyOfHead.next;
        }
    }

    private static ListNode mergeKLists(final ListNode[] NODES_LIST) {
        if (NODES_LIST == null || NODES_LIST.length == 0)
            return null;
        else {
            final PriorityQueue<ListNode> PRIORITY_QUEUE = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
            for (final ListNode NODE : NODES_LIST)
                if (NODE != null)
                    PRIORITY_QUEUE.add(NODE);
            final ListNode NEW_HEAD = new ListNode(0);
            ListNode copyOfNewHead = NEW_HEAD;
            while (!PRIORITY_QUEUE.isEmpty()) {
                copyOfNewHead.next = PRIORITY_QUEUE.poll();
                copyOfNewHead = copyOfNewHead.next;
                if (copyOfNewHead.next != null)
                    PRIORITY_QUEUE.add(copyOfNewHead.next);
            }
            return NEW_HEAD.next;
        }
    }
}