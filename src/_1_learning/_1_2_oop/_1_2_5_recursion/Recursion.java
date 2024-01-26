package _1_learning._1_2_oop._1_2_5_recursion;

public class Recursion {
    int index = 0;

    public static void main(String[] args) {
        new Recursion().methodExample();
    }

    void methodExample() {
        System.out.println(index + " Start");
        ++this.index;
        if (index != 5) methodExample();
        else System.out.println(index + " Stop");
    }
}