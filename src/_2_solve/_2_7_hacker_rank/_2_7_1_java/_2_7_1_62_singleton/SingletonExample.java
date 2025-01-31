package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_62_singleton;

import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_62_singleton.files <h2>Question</h2>
 */

class Singleton {
    String TEXT;

    private Singleton() {
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    static Singleton getSingleInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class SingletonExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final Singleton SINGLETON = Singleton.getSingleInstance();
        SINGLETON.TEXT = INPUT.nextLine();
        System.out.println("Hello I am a singleton! Let me say " + SINGLETON.TEXT + " to you");
    }
}