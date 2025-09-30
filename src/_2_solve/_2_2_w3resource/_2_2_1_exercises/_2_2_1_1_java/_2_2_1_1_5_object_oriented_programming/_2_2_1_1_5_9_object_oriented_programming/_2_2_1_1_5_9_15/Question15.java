package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_9_object_oriented_programming._2_2_1_1_5_9_15;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Keyboard" with a collection of songs and methods to print key character, to print a characters.</h2>
 */

public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        printBarmajaa();
    }

    private static void printBarmajaa() {
        System.out.printf(
                "%s%s%s%s%s%s%s%s",
                KeyCharacters.B,
                KeyCharacters.a,
                KeyCharacters.r,
                KeyCharacters.m,
                KeyCharacters.a,
                KeyCharacters.j,
                KeyCharacters.a,
                KeyCharacters.a
        );
    }
}

enum KeyCharacters {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,
    j,
    k,
    l,
    m,
    n,
    o,
    p,
    q,
    r,
    s,
    t,
    u,
    v,
    w,
    x,
    y,
    z,
    SPACE,
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z;

    String getCharacter() {
        if (this == SPACE)
            return " ";
        else
            return "";
    }
}