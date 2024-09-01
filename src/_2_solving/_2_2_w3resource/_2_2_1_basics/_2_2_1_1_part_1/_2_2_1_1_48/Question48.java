package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_48;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print odd numbers from 1 to 99. Prints one number per line.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 3
 * <br/>
 * 5
 * <br/>
 * 7
 * <br/>
 * 9
 * <br/>
 * 11
 * <br/>
 * ....
 * <br/>
 * 91
 * <br/>
 * 93
 * <br/>
 * 95
 * <br/>
 * 97
 * <br/>
 * 99
 * </h2>
 */

public class Question48 {
    public static void main(final String[] ARGS) {
        for (byte index = 0; index < 100; index++)
            if (index % 2 != 0) System.out.println(index);
    }
}