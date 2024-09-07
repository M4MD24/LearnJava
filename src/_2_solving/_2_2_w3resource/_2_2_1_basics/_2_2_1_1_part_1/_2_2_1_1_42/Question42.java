package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_42;

import java.io.Console;
import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to input and display your password.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input your Password:         </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Your password was: abc@123%</h2>
 */

public class Question42 {
    public static void main(final String[] PARAMETERS) {
        Console console;

        if ((console = System.console()) != null) {
            char[] passward = null;

            try {
                passward = console.readPassword("Input your Password:");
                System.out.println("Your password was: " + new String(passward));
            } finally {
                if (passward != null) Arrays.fill(passward, ' ');
            }
        } else throw new RuntimeException("Can't get the password... No console");
    }
}