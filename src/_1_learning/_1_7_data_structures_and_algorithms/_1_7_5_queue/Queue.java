package _1_learning._1_7_data_structures_and_algorithms._1_7_5_queue;

public class Queue<Type> {
    private int capacity = 0,
            rear = 0;
    private final int FRONT = 0;
    Type temporary;
    private Type[] queue = (Type[]) new Object[capacity];

    public void enQueue(Type data) {
        if (rear == capacity) {
            ++capacity;
            Type[] newQueue = (Type[]) new Object[capacity];
            System.arraycopy(queue, 0, newQueue, 0, capacity - 1);
            newQueue[rear] = data;
            queue = newQueue;
        } else if (rear < capacity) queue[rear] = data;
        rear++;
    }

    public void deQueue() {
        if (rear == 0) System.out.print("Nothing to deQueue!");
        else {
            queue[FRONT] = null;
            for (int index = 0; index < capacity - 1; index++) {
                temporary = queue[index];
                queue[index] = queue[index + 1];
                queue[index + 1] = temporary;
            }
            rear--;
        }
    }

    public void showElements() {
        for (int index = 0; index < rear; index++) {
            System.out.print(queue[index]);
            if (index != capacity - 1) System.out.print(" ");
        }
    }

    public void showAll() {
        if (rear != 0) {
            for (int index = 0; index < capacity; index++) {
                System.out.print(queue[index]);
                if (index < capacity - 1) System.out.print(" ");
            }
        } else System.out.print("Nothing to show!");
    }

    public int getSize() {
        return rear;
    }

    public boolean isEmpty() {
        return queue[FRONT] == null;
    }

    public boolean isFull() {
        return queue[capacity - 1] != null;
    }
}