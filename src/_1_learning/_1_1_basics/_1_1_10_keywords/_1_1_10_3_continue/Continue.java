package _1_learning._1_1_basics._1_1_10_keywords._1_1_10_3_continue;

public class Continue {
    public static void main(final String[] ARGS) {
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