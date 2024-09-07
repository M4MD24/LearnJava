package _1_learning._1_4_object_oriented_programming._1_4_2_methods._1_4_2_1_method;

public class Method {
    /* ~ The difference between (method) and (function)
     * Just about where the function is defined, where I am the function. If you define it alone (not inside a class), it is called a Function, or if you define it inside a class, it is called a Method */

    /* static: it can be accessed without creating objects. */
    static float addition2Number(final float NUMBER_1 /* Parameter */, final float NUMBER_2 /* Parameter */) { // Return Method
        return NUMBER_1 / NUMBER_2;
    }

    void printAddition2Number(final float NUMBER_1 /* Parameter */, final float NUMBER_2 /* Parameter */) { // Method
        System.out.println(addition2Number(NUMBER_1 /* Argument */, NUMBER_2 /* Argument */));
    }

    public static void main(final String[] PARAMETERS) {
        final float NUMBER_1 = 10, NUMBER_2 = 3;

        new Method().printAddition2Number(NUMBER_1 /* Argument */, NUMBER_2 /* Argument */);
    }

}