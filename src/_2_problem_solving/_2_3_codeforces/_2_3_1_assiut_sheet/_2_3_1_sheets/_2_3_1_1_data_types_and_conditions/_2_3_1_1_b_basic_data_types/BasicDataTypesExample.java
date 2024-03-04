package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._2_3_1_1_b_basic_data_types;

import java.util.Scanner;

/**
 * <h1>B. Basic Data Types</h1>
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
 * <h2>Only one line containing the following space-separated values: int, long long, char, float and double respectively.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 12345678912345 a 334.23 14049.30493</h2>
 * <h1>Output:</h1>
 * <h2>
 * 3
 * <br/>
 * 12345678912345
 * <br/>
 * a
 * <br/>
 * 334.23
 * <br/>
 * 14049.3
 * </h2>
 */
public class BasicDataTypesExample {
    private static final Scanner input = new Scanner(System.in);
    private static int intVariable;
    private static long longVariable;
    private static char charVariable;
    private static float floatVariable;
    private static double doubleVariable;

    public static void main(String[] args) {
        inputValues();
        displayValues();
    }

    private static void inputValues() {
        intVariable = Integer.parseInt(input.next());
        longVariable = Long.parseLong(input.next());
        charVariable = input.next().charAt(0);
        floatVariable = Float.parseFloat(input.next());
        doubleVariable = Double.parseDouble(input.next());
        input.close();
    }

    private static void displayValues() {
        System.out.println(intVariable);
        System.out.println(longVariable);
        System.out.println(charVariable);
        System.out.println(floatVariable);
        System.out.print(doubleVariable);
    }
}