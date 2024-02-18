package _1_learning._1_7_data_structures_and_algorithms._1_7_4_queue;

public class Queue<Type> {
    private static int size = 0;
    private Type[] queue = (Type[]) new Object[size];

    public void enQueue(Type data) {
        ++size;
        Type[] newQueue = (Type[]) new Object[getSize()];
        newQueue[getSize() - 1] = data;
        System.arraycopy(queue, 0, newQueue, 0, getSize() - 1);
        queue = newQueue;
    }

    public void deQueue() {
        Type[] newQueue = (Type[]) new Object[getSize()];
        System.arraycopy(queue, 1, newQueue, 0, getSize() - 1);
        queue = newQueue;
    }

    public void showAll() {
        if (getSize() != 0) {
            for (int index = 0; index < getSize(); index++) {
                System.out.print(queue[index]);
                if (index < size - 1) System.out.print(" ");
            }
        } else System.out.print("Nothing to show");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return queue[getSize() - 1] != null;
    }

}