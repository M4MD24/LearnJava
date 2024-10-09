package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_2_add_two_numbers;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <br/>
 * <br/>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * </h2>
 */

public class AddTwoNumbers {
    public static void main(final String[] PARAMETERS) {
        final ListNode FIRST_DIGITS = new ListNode(2);
        FIRST_DIGITS.next = new ListNode(4);
        FIRST_DIGITS.next.next = new ListNode(3);

        final ListNode SECOND_DIGITS = new ListNode(5);
        SECOND_DIGITS.next = new ListNode(6);
        SECOND_DIGITS.next.next = new ListNode(4);

        System.out.print(addTwoNumbers(FIRST_DIGITS, SECOND_DIGITS));
    }

    private static ListNode addTwoNumbers(ListNode firstDigits, ListNode secondDigits) {
        final ListNode DIGITS_AFTER_ADD_TWO_NUMBERS = new ListNode(0);
        ListNode copyOfDigitsAfterAddTwoNumbers = DIGITS_AFTER_ADD_TWO_NUMBERS;
        int reminder = 0;
        while (firstDigits != null || secondDigits != null || reminder != 0) {
            final int SUM = (
                    firstDigits != null
                            ? firstDigits.val
                            : 0
            ) + (
                    secondDigits != null
                            ? secondDigits.val
                            : 0
            ) + reminder;
            reminder = SUM / 10;
            copyOfDigitsAfterAddTwoNumbers.next = new ListNode(SUM % 10);
            copyOfDigitsAfterAddTwoNumbers = copyOfDigitsAfterAddTwoNumbers.next;
            if (firstDigits != null)
                firstDigits = firstDigits.next;
            if (secondDigits != null)
                secondDigits = secondDigits.next;
        }
        return DIGITS_AFTER_ADD_TWO_NUMBERS.next;
    }
}