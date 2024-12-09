package _2_solve._2_3_codeforces._2_3_2_problem_set._2_3_2_282a_bit_plus_plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <h1>282A. Bit++</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>
 * The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.
 * <br/>
 * <br/>
 * The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:
 * <br/>
 * <br/>
 * • Operation ++ increases the value of variable x by 1.
 * <br/>
 * • Operation -- decreases the value of variable x by 1.
 * <br/>
 * <br/>
 * A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.
 * <br/>
 * <br/>
 * A programme in Bit++ is a sequence of statements, each of them needs to be executed. Executing a programme means executing all the statements it contains.
 * <br/>
 * <br/>
 * You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value of the variable when this programme is executed).
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * ++X
 * </h2>
 * <br/>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * </h2>
 */

public class BitPlusPlus {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCases = Integer.parseInt(INPUT.readLine());
        int result = 0;
        while (testCases-- > 0)
            if (INPUT.readLine().charAt(1) == '+')
                result++;
            else
                result--;
        OUTPUT.write(String.valueOf(result));
        OUTPUT.flush();
    }
}