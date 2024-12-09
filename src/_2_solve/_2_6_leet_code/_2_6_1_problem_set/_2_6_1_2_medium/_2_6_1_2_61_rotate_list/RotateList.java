package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_61_rotate_list;

/**
 * <h1>Problem:</h1>
 * <h2>Given the head of a linked list, rotate the list to the right by k places.</h2>
 */

public class RotateList {
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
        System.out.print(rotateRight(HEAD_NODE, TARGET_NUMBER));
    }

    private static ListNode rotateRight(final ListNode HEAD_NODE, int steps) {
        if (HEAD_NODE == null || HEAD_NODE.next == null || steps == 0)
            return HEAD_NODE;
        else {
            ListNode currentNode = HEAD_NODE;
            int listLength = 1;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                listLength++;
            }
            currentNode.next = HEAD_NODE;
            final int NEW_HEAD_POSITION = listLength - (steps % listLength);
            currentNode = HEAD_NODE;
            for (int index = 0; index < NEW_HEAD_POSITION - 1; index++)
                currentNode = currentNode.next;
            ListNode NEW_HEAD_NODE = currentNode.next;
            currentNode.next = null;
            return NEW_HEAD_NODE;
        }
    }
}