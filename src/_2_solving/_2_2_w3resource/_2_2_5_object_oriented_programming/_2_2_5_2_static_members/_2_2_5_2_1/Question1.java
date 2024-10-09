package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_static_members._2_2_5_2_1;

/**
 * <h3>Static Variables</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        new Counter();
        new Counter();
        new Counter();
        System.out.print(Counter.getCount());
    }
}

class Counter {
    private static int count = 0;

    Counter() {
        count++;
    }

    static int getCount() {
        return count;
    }
}