package _1_learning._1_7_data_structures_and_algorithms._1_7_4_queue;

public class Queue<Type> {
    int[] queue = new int[5];
    int size,
            front,
            rear;

    public void enQueue(int data) {
        queue[rear] = data;
        rear = (rear + 1) % 5;
        ++size;
    }

    public int deQueue() {
        int data = queue[front];
        front = (front + 1) % 5;
        --size;
        return data;
    }

    public void showElements() {
        System.out.print("Elements: ");
        for (int index = 0; index < size; index++) System.out.print(queue[(front + index) % 5] + " ");
    }

    public void showAll() {
        System.out.print("All: ");
        for (int item : queue) System.out.print(item + " ");
    }
}