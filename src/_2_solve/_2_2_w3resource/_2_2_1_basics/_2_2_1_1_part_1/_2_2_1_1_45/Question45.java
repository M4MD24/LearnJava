package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_45;

import java.io.File;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * /home/students/abc.txt  : 0 bytes
 * <br/>
 * /home/students/test.txt : 0 bytes
 * </h2>
 */

public class Question45 {
    public static void main(final String[] ARGUMENTS) {
        File file = new File("src/_2_problem_solving/_2_2_w3resource/_2_2_1_basics/_2_2_1_1_part_1/_2_2_1_1_45_45/Question45.java");
        System.out.print(file.toURI() + ": " + file.length() + " Bytes");
    }
}