package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_86_partition_list;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * <br/>
 * <br/>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * </h2>
 */

public class PartitionList {
    public static void main(final String[] PARAMETERS) {
        final ListNode HEAD_NODE = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2, new ListNode()))))));
        final int TARGET_NUMBER = 3;
        System.out.print(partition(HEAD_NODE, TARGET_NUMBER));
    }

    private static ListNode partition(final ListNode HEAD_NODE, final int PARTITION_VALUE) {
        final ListNode LESS_THAN_PARTITION_HEAD = new ListNode(0), GREATER_OR_EQUAL_PARTITION_HEAD = new ListNode(0);
        ListNode lessThanPartitionTail = LESS_THAN_PARTITION_HEAD, greaterOrEqualPartitionTail = GREATER_OR_EQUAL_PARTITION_HEAD;
        for (ListNode currentNode = HEAD_NODE; currentNode != null; currentNode = currentNode.next)
            if (currentNode.val < PARTITION_VALUE)
                lessThanPartitionTail = lessThanPartitionTail.next = currentNode;
            else
                greaterOrEqualPartitionTail = greaterOrEqualPartitionTail.next = currentNode;
        greaterOrEqualPartitionTail.next = null;
        lessThanPartitionTail.next = GREATER_OR_EQUAL_PARTITION_HEAD.next;
        return LESS_THAN_PARTITION_HEAD.next;
    }
}