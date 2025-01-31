package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_71_simplify_path;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.
 * <br/>
 * <br/>
 * The rules of a Unix-style file system are as follows:
 * </h2>
 * <br/>
 * <ul>
 * <li>A single period '.' represents the current directory.</li>
 * <li>A double period '..' represents the previous/parent directory.</li>
 * <li>Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.</li>
 * <li>Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.</li>
 * </ul>
 * <h2>The simplified canonical path should follow these rules:</h2>
 * <ul>
 * <li>The path must start with a single slash '/'.</li>
 * <li>Directories within the path must be separated by exactly one slash '/'.</li>
 * <li>The path must not end with a slash '/', unless it is the root directory.</li>
 * <li>The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.</li>
 * </ul>
 * <h2>Return the simplified canonical path.</h2>
 */

public class SimplifyPath {
    public static void main(final String[] ARGUMENTS) {
        final String PATH = "/home/";
        System.out.print(simplifyPath(PATH));
    }

    private static String simplifyPath(final String PATH) {
        final Stack<String> PARTS = new Stack<>();
        for (final String PART : PATH.split("/"))
            if (PART.equals("..")) {
                if (!PARTS.isEmpty())
                    PARTS.pop();
            } else if (!PART.isEmpty() && !PART.equals("."))
                PARTS.push(PART);
        return "/" + String.join(
                "/",
                PARTS
        );
    }
}