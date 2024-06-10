package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_object_oriented_programming._2_2_5_6_15_question_464;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Keyboard" with a collection of songs and methods to print key character, to print a characters.</h2>
 */

public class Question464 {
    public static void main(final String[] ARGS) {
        printNullexia();
        printFor();
        printProgramming();
    }

    private static void printProgramming() {
        System.out.printf("%s%s%s%s%s%s%s%s%s%s%s",
                KeyCharacters.P,
                KeyCharacters.r,
                KeyCharacters.o,
                KeyCharacters.g,
                KeyCharacters.r,
                KeyCharacters.a,
                KeyCharacters.m,
                KeyCharacters.m,
                KeyCharacters.i,
                KeyCharacters.n,
                KeyCharacters.g
        );
    }

    private static void printFor() {
        System.out.printf("%s%s%s%s",
                KeyCharacters.F,
                KeyCharacters.o,
                KeyCharacters.r,
                KeyCharacters.SPACE.getCharacter()
        );
    }

    private static void printNullexia() {
        System.out.printf("%s%s%s%s%s%s%s%s%s",
                KeyCharacters.N,
                KeyCharacters.u,
                KeyCharacters.l,
                KeyCharacters.l,
                KeyCharacters.e,
                KeyCharacters.x,
                KeyCharacters.i,
                KeyCharacters.a,
                KeyCharacters.SPACE.getCharacter()
        );
    }
}

enum KeyCharacters {
    a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,
    SPACE,
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    String getCharacter() {
        if (this == SPACE)
            return " ";
        else
            return "";
    }
}