package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_155_min_stack;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <br/>
 * <br/>
 * Implement the MinStack class:
 * <br/>
 * <br/>
 * <ul>
 * <li>MinStack() initializes the stack object.</li>
 * <li>void push(int val) pushes the element val onto the stack.</li>
 * <li>void pop() removes the element on the top of the stack.</li>
 * <li>int top() gets the top element of the stack.</li>
 * <li>int getMin() retrieves the minimum element in the stack.</li>
 * </ul>
 * <br/>
 * <br/>
 * You must implement a solution with O(1) time complexity for each function.
 * </h2>
 */

public class MinStack {
    public static void main(final String[] PARAMETERS) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.print(minStack.getMin()); // return -2
    }

    private Node top;

    private void push(final int VALUE) {
        if (top == null) {
            top = new Node();
            top.value = VALUE;
            top.minimumValue = VALUE;
        } else {
            final Node NEW_TOP = new Node();
            NEW_TOP.value = VALUE;
            NEW_TOP.minimumValue = Math.min(VALUE, top.minimumValue);
            NEW_TOP.next = top;
            top = NEW_TOP;
        }
    }

    private void pop() {
        top = top.next;
    }

    private int top() {
        return top.value;
    }

    private int getMin() {
        return top.minimumValue;
    }
}