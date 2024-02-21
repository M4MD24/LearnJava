package _1_learning._1_7_data_structures_and_algorithms._1_7_4_stack;

public class Stack<Type> {
    private static int top = 0;
    private static int capacity = top;
    Type[] stack = (Type[]) new Object[capacity];

    public int size() {
        return top;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int length) {
        Type[] newStack = (Type[]) new Object[capacity = length];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(Type data) {
        if (capacity == size()) expand();
        stack[top] = data;
        top++;
    }

    private void expand() {
        Type[] newStack = (Type[]) new Object[++capacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
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

    public void shrink() {
        Type[] newStack = (Type[]) new Object[capacity = top];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
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