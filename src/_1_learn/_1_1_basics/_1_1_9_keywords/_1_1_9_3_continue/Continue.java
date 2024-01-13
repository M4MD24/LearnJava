package _1_learn._1_1_basics._1_1_9_keywords._1_1_9_3_continue;

public class Continue {
    public static void main(String[] args) {
        int number = 5;
        int index = 0;
        int stopIn = 10;

        while (index <= stopIn) {
            System.out.println(index);
            ++index;
            if (index == number) continue; /* Skips the current iteration of a loop! */
            System.out.println("-");
        }
    }
}