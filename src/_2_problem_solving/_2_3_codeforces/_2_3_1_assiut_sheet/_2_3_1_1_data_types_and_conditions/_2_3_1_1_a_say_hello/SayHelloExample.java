package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_data_types_and_conditions._2_3_1_1_a_say_hello;

import java.util.Scanner;

/**
 * <h1>A. Say Hello</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a name S. Print "Hello, (name)" without parentheses.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>programmer</h2>
 * <h1>Output:</h1>
 * <h2>Hello, programmer</h2>
 */
public class SayHelloExample {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final String name = input.nextLine();
        printWelcomeMessage(name);
    }

    private static void printWelcomeMessage(String name) {
        System.out.print("Hello, " + name);
    }
}