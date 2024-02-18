package _1_learning._1_7_data_structures_and_algorithms._1_7_4_queue;

public class Queue<Type> {
    private static int size = 0;
    private Type[] queue = (Type[]) new Object[size];

    public void enQueue(Type data) {
        ++size;
        Type[] newQueue = (Type[]) new Object[size];
        newQueue[size - 1] = data;
        System.arraycopy(queue, 0, newQueue, 0, size - 1);
        queue = newQueue;
    }

    public void deQueue() {
        Type[] newQueue = (Type[]) new Object[size];
        System.arraycopy(queue, 1, newQueue, 0, size - 1);
        queue = newQueue;
    }

    public void showAll() {
        if (size != 0) {
            for (int index = 0; index < size; index++) {
                System.out.print(queue[index]);
                if (index < size - 1) System.out.print(" ");
            }
        } else System.out.print("Nothing to show");
    }
}