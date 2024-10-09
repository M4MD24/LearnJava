package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_20_valid_parantheses;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <br/>
 * <br/>
 * An input string is valid if:
 * </h2>
 * <br/>
 * <br/>
 * <ol>
 * <li>Open brackets must be closed by the same type of brackets.</li>
 * <li>Open brackets must be closed in the correct order.</li>
 * <li>Every close bracket has a corresponding open bracket of the same type.</li>
 * </ol>
 */

public class ValidParentheses {
    public static void main(final String[] PARAMETERS) {
        final String PARENTHESES = "([])";
        System.out.print(isValid(PARENTHESES));
    }

    private static boolean isValid(final String TEXT) {
        int index = -1;
        final char[] PARENTHESES = new char[TEXT.length()];
        for (final char CHARACTERS : TEXT.toCharArray())
            if (CHARACTERS == '(' || CHARACTERS == '{' || CHARACTERS == '[')
                PARENTHESES[++index] = CHARACTERS;
            else if (index >= 0 &&
                    ((PARENTHESES[index] == '(' && CHARACTERS == ')') || (PARENTHESES[index] == '{' && CHARACTERS == '}') || (PARENTHESES[index] == '[' && CHARACTERS == ']')))
                index--;
            else
                return false;
        return index == -1;
    }

// >
    /*private static boolean isValid(final String TEXT) {
        final Stack<Character> PARENTHESES = new Stack<>();
        for (final char CHARACTER : TEXT.toCharArray())
            switch (CHARACTER) {
                case '(':
                case '{':
                case '[':
                    PARENTHESES.push(CHARACTER);
                    break;
                case ')':
                    if (PARENTHESES.isEmpty() || PARENTHESES.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (PARENTHESES.isEmpty() || PARENTHESES.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (PARENTHESES.isEmpty() || PARENTHESES.pop() != '[')
                        return false;
                    break;
            }
        return PARENTHESES.isEmpty();
    }*/
}