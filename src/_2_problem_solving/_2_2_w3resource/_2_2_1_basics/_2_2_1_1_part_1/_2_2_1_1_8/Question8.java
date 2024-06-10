package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_8;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to display the following pattern.</h2>
 * <br/>
 * <h1>Sample Pattern:</h1>
 */
/*
   J    a    v     v    a
   J   a a    v   v    a a
J  J  aaaaa    V V    aaaaa
 JJ  a     a    V    a     a
*/
public class Question8 {
    public static void main(final String[] ARGS) {
        final String JAVA_WORD_DRAWING = """
                    J    a    v     v    a
                    J   a a    v   v    a a
                 J  J  aaaaa    V V    aaaaa
                  JJ  a     a    V    a     a
                """;
        System.out.print(JAVA_WORD_DRAWING);
    }
}