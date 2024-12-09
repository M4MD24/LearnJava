package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_61_method_overriding_2_super_keyword;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_61_method_overriding_2_super_keyword.files <h2>Question</h2>
 */

class Cycle {
    void printInfo() {
        System.out.print("I am a cycle with an engine.");
    }
}

class Motorcycle extends Cycle {
    void printInfo() {
        System.out.print("Hello I am a motorcycle, ");
        super.printInfo();
    }

    void printAncestor() {
        System.out.print("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

public class MethodOverriding2SuperKeyword {
    public static void main(final String[] PARAMETERS) {
        final Motorcycle MOTORCYCLE = new Motorcycle();
        MOTORCYCLE.printInfo();
        System.out.println();
        MOTORCYCLE.printAncestor();
    }
}