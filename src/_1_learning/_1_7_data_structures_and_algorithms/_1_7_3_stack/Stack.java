package _1_learning._1_7_data_structures_and_algorithms._1_7_3_stack;

public class Stack<Type> {
    private static int top = 0;
    int capacity;
    Type[] stack;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = (Type[]) new Object[capacity];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(Type data) {
        if (top != capacity) {
            stack[top] = data;
            top++;
        } else System.out.print("Stack is full");
    }

    public Type pop() {
        Type popped = null;
        if (top != 0) {
            popped = stack[top - 1];
            stack[top - 1] = null;
            top--;
        } else System.out.print("Stack is empty");
        return popped;
    }

    public Type peek() {
        return stack[top - 1];
    }

    public void showAll() {
        if (top != 0) {
            for (int index = 0; index < stack.length; index++) {
                System.out.print(stack[index]);
                if (index < stack.length - 1) System.out.print(" ");
            }
        } else System.out.print("Nothing to show");
    }

    public void deleteAll() {
        for (int index = top - 1; index > -1; index--, --top) stack[index] = null;
    }
}