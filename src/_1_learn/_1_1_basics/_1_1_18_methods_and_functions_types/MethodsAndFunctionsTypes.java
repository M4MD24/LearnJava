package _1_learn._1_1_basics._1_1_18_methods_and_functions_types;

abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();
}

public class MethodsAndFunctionsTypes extends AbstractClass {
    // Static method
    public static void printStaticMessage() {
        System.out.println("This is a static method.");
    }

    // Instance method
    public void printInstanceMessage() {
        System.out.println("This is an instance method.");
    }

    // Return method
    public int add(int a, int b) {
        return a + b;
    }

    // Void method
    public void printMessage() {
        System.out.println("This is a void method.");
    }

    // Parameterized method
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Overloaded methods
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(String a) {
        System.out.println("String: " + a);
    }

    // Abstract method implementation
    @Override
    void abstractMethod() {
        System.out.println("This is an abstract method implementation.");
    }
}