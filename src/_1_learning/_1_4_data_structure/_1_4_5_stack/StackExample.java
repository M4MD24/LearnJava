package _1_learning._1_4_data_structure._1_4_5_stack;

import java.util.Stack;

// • Methods of Stack
/**
 * <h1>Methods of Stack</h1>
 * <p>Since Stack extends the Vector class, it inherits all the methods Vector. To learn about different Vector methods.</p>
 * <ul>
 *     <li><b>push()</b> - add an element to the top of the stack.</li>
 *     <li><b>pop()</b> - remove an element from the top of the stack.</li>
 *     <li><b>peek()</b> - returns an object from the top of the stack.</li>
 *     <li><b>search()</b> - search an element in the stack, It returns the position of the element from the top of the stack.</li>
 *     <li><b>empty()</b> - check whether a stack is empty or not</li>
 * </ul>
 */
public class StackExample {
    public static void main(String[] args) {
        stack();
    }

    private static void stack() {
        Stack<Integer> number = new Stack<>();

        number.push(1);
        number.push(2);
        number.push(3);

        System.out.print(number);
        System.out.println(".push()  : " + number.push(4));

        System.out.print(number);
        System.out.println(".pop(): " + number.pop());

        System.out.print(number);
        System.out.println(".peek()  : " + number.peek());

        System.out.print(number);
        System.out.println(".search(): " + number.search(3));

        System.out.print(number);
        System.out.println(".empty() : " + number.empty());
    }
}